package com.nicholas.fastmedicineserver.restservice;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.lang3.StringUtils;
import org.opensaml.xml.encryption.Public;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;




import com.nicholas.fastmedicineserver.business.UserInfo.service.IUserService;
import com.nicholas.fastmedicineserver.entity.DeviceInfo;
import com.nicholas.fastmedicineserver.entity.ProductCategory;
import com.nicholas.fastmedicineserver.entity.ProductDetail;
import com.nicholas.fastmedicineserver.entity.ProductListItem;
import com.nicholas.fastmedicineserver.integration.BaseConstants;
import com.nicholas.fastmedicineserver.integration.WsResponse;
import com.nicholas.fastmedicineserver.repository.CategoryRepository;
import com.nicholas.fastmedicineserver.repository.DeviceRepository;
import com.nicholas.fastmedicineserver.repository.ProductDetailRepository;
import com.nicholas.fastmedicineserver.integration.CommonMethod;;

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
	@Qualifier("userServiceImpl")
	private IUserService userService;

	
	/**
	 * 获取分类列表
	 * @param request
	 * @return
	 */
	@RequestMapping(value = "/getProductCategoryList",method=RequestMethod.GET)
	public WsResponse getCategoryList(HttpServletRequest request)
	{
		List<ProductCategory> categories=categoryRepo.findAll();
		return WsResponse.successResponse(categories);
	}
	
	
	/**
	 * 根据分类获取产品列表
	 * @param request
	 * @return
	 */
	@RequestMapping(value = "/postProductList",method=RequestMethod.POST)
	public WsResponse getProductList(HttpServletRequest request,@RequestParam("categoryId") Long categoryId)
	{
		List<ProductListItem> list=new ArrayList<ProductListItem>();
		List<ProductDetail> tmp= productDetailRepo.findByCategoryId(categoryId);
		for(ProductDetail detail:tmp)
		{
			ProductListItem item=new ProductListItem();
			item.setProductId(detail.getId());
			item.setIconUrl(detail.getProductPics());
			item.setProductName(detail.getProductName());
			String usage=detail.getProductUsage();
			if (usage.length()>28)
			{
				usage=usage.substring(0, 28)+"...";
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
	 *获取产品详情
	 * @param request
	 * @return
	 */
	@RequestMapping(value = "/postProductDetail",method=RequestMethod.POST)
	public WsResponse getProductDetail(HttpServletRequest request,@RequestParam("productId") Long productId)
	{
		ProductDetail detail=productDetailRepo.findById(productId);
		return WsResponse.successResponse(detail);
		//return CommonMethod.Obj2Json(WsResponse.successResponse(detail));
	}
	
	
	/**
	 * 关键词搜索
	 * @param request
	 * @return
	 */
	@RequestMapping(value = "/postSearch",method=RequestMethod.POST)
	public WsResponse  postSearch(HttpServletRequest request,@RequestParam("keyword") String keyword)
	{
		
		
		return null;
	}
	
	
	/**
	 * 登录
	 * @param request
	 * @return
	 */
	@RequestMapping(value = "/postLogin",method=RequestMethod.POST)
	public WsResponse postLogin(HttpServletRequest request,
			@RequestParam("phoneNum") String phoneNum,
			@RequestParam("password") String password){
		
		return null;
	}
	
	/**
	 * 注册
	 * @param request
	 * @return
	 */
	@RequestMapping(value = "/postRegister",method=RequestMethod.POST)
	public WsResponse postRegister(HttpServletRequest request,
			@RequestParam("phoneNum") String phoneNum,
			@RequestParam("password") String password,
			@RequestParam("deviceModel") String deviceModel,
			@RequestParam("appVersion") String appVersion){
		if (!CommonMethod.isMobileNum(phoneNum))
		{
			return WsResponse.response("002", BaseConstants.phoneError);
		}
		if (StringUtils.isEmpty(password)||StringUtils.isEmpty(deviceModel)||StringUtils.isEmpty(appVersion))
		{
			return WsResponse.response("001", BaseConstants.paramError);
		}
		
		if(userService.isUserExist(phoneNum)){
			return WsResponse.response("003", BaseConstants.phoneRegisterError);
		}
		try
		{
			int id=userService.registerUser(phoneNum, password).intValue();
			if (id>=0)
			{
				DeviceInfo deviceInfo=new DeviceInfo();
				deviceInfo.setAppVersion(appVersion);
				deviceInfo.setDeviceModel(deviceModel);
				deviceInfo.setUserId(id);
				deviceRepo.save(deviceInfo);
			}
			return WsResponse.successResponse();
		} catch (Exception e)
		{
			return WsResponse.response("010", BaseConstants.exception);
		}
		
		
	}
	
	
	
	
}
