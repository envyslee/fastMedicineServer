package com.nicholas.fastmedicineserver.restservice;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.lang3.StringUtils;
import org.jboss.logging.annotations.Param;
import org.opensaml.xml.encryption.Public;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.nicholas.fastmedicineserver.business.UserInfo.service.IUserService;
import com.nicholas.fastmedicineserver.entity.DeviceInfo;
import com.nicholas.fastmedicineserver.entity.Feedback;
import com.nicholas.fastmedicineserver.entity.ProductCategory;
import com.nicholas.fastmedicineserver.entity.ProductDetail;
import com.nicholas.fastmedicineserver.entity.ProductListItem;
import com.nicholas.fastmedicineserver.integration.BaseConstants;
import com.nicholas.fastmedicineserver.integration.WsResponse;
import com.nicholas.fastmedicineserver.repository.CategoryRepository;
import com.nicholas.fastmedicineserver.repository.DeviceRepository;
import com.nicholas.fastmedicineserver.repository.FeedbackRepository;
import com.nicholas.fastmedicineserver.repository.ProductDetailRepository;
import com.nicholas.fastmedicineserver.integration.CommonMethod;

;

@RestController
@RequestMapping("/medicine")
public class MedicineController
{
	@Autowired
	CategoryRepository categoryRepo;

	@Autowired
	ProductDetailRepository productDetailRepo;

	@Autowired
	DeviceRepository deviceRepo;
	
	
	@Autowired
	FeedbackRepository feedRepo;

	@Autowired
	@Qualifier("userServiceImpl")
	private IUserService userService;

	/**
	 * 获取分类列表
	 * 
	 * @param request
	 * @return
	 */
	@RequestMapping(value = "/getProductCategoryList", method = RequestMethod.GET)
	public WsResponse getCategoryList(HttpServletRequest request)
	{
		List<ProductCategory> categories = categoryRepo.findAll();
		return WsResponse.successResponse(categories);
	}

	/**
	 * 根据分类获取产品列表
	 * 
	 * @param request
	 * @return
	 */
	@RequestMapping(value = "/postProductList", method = RequestMethod.POST)
	public WsResponse getProductList(HttpServletRequest request,
			@RequestParam("categoryId") Long categoryId)
	{
		List<ProductListItem> list = new ArrayList<ProductListItem>();
		List<ProductDetail> tmp = productDetailRepo
				.findByCategoryId(categoryId);
		for (ProductDetail detail : tmp)
		{
			ProductListItem item = new ProductListItem();
			item.setProductId(detail.getId());
			item.setIconUrl(detail.getProductPics());
			item.setProductName(detail.getProductName());
			String usage = detail.getProductUsage();
			if (usage.length() > 28)
			{
				usage = usage.substring(0, 28) + "...";
			}
			item.setProductDesc(usage);
			item.setProductSpec(detail.getProductSpec());
			item.setProductSale(detail.getProductSale());
			item.setProductPrice(detail.getProductPrice());
			list.add(item);
		}
		return WsResponse.successResponse(list);
	}

	/**
	 * 获取产品详情
	 * 
	 * @param request
	 * @return
	 */
	@RequestMapping(value = "/postProductDetail", method = RequestMethod.POST)
	public WsResponse getProductDetail(HttpServletRequest request,
			@RequestParam("productId") Long productId)
	{
		ProductDetail detail = productDetailRepo.findById(productId);
		return WsResponse.successResponse(detail);
	}

	/**
	 * 关键词搜索
	 * 
	 * @param request
	 * @return
	 */
	@RequestMapping(value = "/postSearch", method = RequestMethod.POST)
	public WsResponse postSearch(HttpServletRequest request,
			@RequestParam("keyword") String keyword)
	{
		List<ProductDetail> list=productDetailRepo.findSearchKey("%"+keyword+"%");
		if (list!=null&&list.size()>0)
		{
			return WsResponse.successResponse(list);
		}
		return WsResponse.response("007", BaseConstants.searchNoResult);
	}

	/**
	 * 登录
	 * 
	 * @param request
	 * @return
	 */
	@RequestMapping(value = "/postLogin", method = RequestMethod.POST)
	public WsResponse postLogin(HttpServletRequest request,
			@RequestParam("phoneNum") String phoneNum,
			@RequestParam("password") String password){
		if (!CommonMethod.isMobileNum(phoneNum))
		{
			return WsResponse.response("002", BaseConstants.phoneError);
		}
		if (StringUtils.isEmpty(password))
		{
			return WsResponse.response("001", BaseConstants.paramError);
		}
		try
		{
			if (!userService.isUserExistByPhone(phoneNum))
			{
				return WsResponse.response("004",BaseConstants.phoneLoginError);
			}
			String userId=userService.login(phoneNum, password);
			if (userId!=null&&userId.length()>0)
			{
				
				return WsResponse.successResponse(userId);//登录成功
			}
			else {
				return WsResponse.response("005", BaseConstants.passwordLoginError);//登录失败
			}
		} catch (Exception e)
		{
			return WsResponse.response("010", BaseConstants.exception);
		}
	}

	/**
	 * 注册
	 * 
	 * @param request
	 * @return
	 */
	@RequestMapping(value = "/postRegister", method = RequestMethod.POST)
	public WsResponse postRegister(HttpServletRequest request,
			@RequestParam("phoneNum") String phoneNum,
			@RequestParam("password") String password,
			@RequestParam("deviceModel") String deviceModel,
			@RequestParam("appVersion") String appVersion,
			@RequestParam("osVersion") String osVersion){
		if (!CommonMethod.isMobileNum(phoneNum))
		{
			return WsResponse.response("002", BaseConstants.phoneError);
		}
		if (StringUtils.isEmpty(password) || StringUtils.isEmpty(deviceModel)
				|| StringUtils.isEmpty(appVersion))
		{
			return WsResponse.response("001", BaseConstants.paramError);
		}
		try
		{
			if (userService.isUserExistByPhone(phoneNum))
			{
				return WsResponse.response("003",BaseConstants.phoneRegisterError);
			}
			Integer id = userService.registerUser(phoneNum, password).intValue();
			if (id >= 0)
			{
				DeviceInfo deviceInfo = new DeviceInfo();
				deviceInfo.setAppVersion(appVersion);
				deviceInfo.setDeviceModel(deviceModel);
				deviceInfo.setUserId(id);
				deviceInfo.setOsVersion(osVersion);
				deviceRepo.save(deviceInfo);
			}
			return WsResponse.successResponse(id.toString());
		} catch (Exception e)
		{
			return WsResponse.response("010", BaseConstants.exception);
		}

	}
	
	/**
	 * 意见反馈
	 * 
	 * @param request
	 * @return
	 */
	@RequestMapping(value = "/postFeedback", method = RequestMethod.POST)
	public WsResponse postFeedback(HttpServletRequest request,
			@RequestParam("userId") String userId,
			@RequestParam("feedContent") String feedContent,
			@RequestParam("appVersion") String appVersion,
			@RequestParam("deviceModel") String deviceModel,
			@RequestParam("deviceOS") String deviceOS,
			@RequestParam("osVersion") String osVersion)
	{
		if (StringUtils.isEmpty(userId)||StringUtils.isEmpty(feedContent))
		{
			return WsResponse.response("001", BaseConstants.paramError);
		}
		Long idLong=Long.valueOf(userId);
		try
		{
			if (!userService.isUserExistById(idLong))
			{
				return WsResponse.response("006", BaseConstants.idNotExist);
			}
			Feedback feedback=new Feedback();
			feedback.setAppVersion(appVersion);
			feedback.setCreatedTime(new Date());
			feedback.setDeviceModel(deviceModel);
			feedback.setDeviceOS(deviceOS);
			feedback.setFeedContent(feedContent);
			feedback.setOsVersion(osVersion);
			feedback.setUserId(idLong);
			feedRepo.save(feedback);
			return WsResponse.successResponse();
		} catch (Exception e)
		{
			return WsResponse.response("010", BaseConstants.exception);
		}
	}

}
