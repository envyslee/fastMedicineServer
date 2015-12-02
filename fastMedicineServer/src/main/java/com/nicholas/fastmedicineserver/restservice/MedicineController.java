package com.nicholas.fastmedicineserver.restservice;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.nicholas.fastmedicineserver.business.Distance.service.IPharmacyService;
import com.nicholas.fastmedicineserver.business.Order.service.IProductSevice;
import com.nicholas.fastmedicineserver.business.UserInfo.service.IUserService;
import com.nicholas.fastmedicineserver.entity.Address;
import com.nicholas.fastmedicineserver.entity.CarListItem;
import com.nicholas.fastmedicineserver.entity.Card;
import com.nicholas.fastmedicineserver.entity.DeviceInfo;
import com.nicholas.fastmedicineserver.entity.Feedback;
import com.nicholas.fastmedicineserver.entity.MyCard;
import com.nicholas.fastmedicineserver.entity.ProductCategory;
import com.nicholas.fastmedicineserver.entity.ProductDetailItem;
import com.nicholas.fastmedicineserver.entity.ProductListItem;
import com.nicholas.fastmedicineserver.entity.SearchKey;
import com.nicholas.fastmedicineserver.integration.BaseConstants;
import com.nicholas.fastmedicineserver.integration.WsResponse;
import com.nicholas.fastmedicineserver.repository.CategoryRepository;
import com.nicholas.fastmedicineserver.repository.DeviceRepository;
import com.nicholas.fastmedicineserver.repository.FeedbackRepository;
import com.nicholas.fastmedicineserver.repository.SearchKeyRepository;
import com.nicholas.fastmedicineserver.integration.CommonMethod;


@RestController
@RequestMapping("/medicine")
public class MedicineController
{
	@Autowired
	CategoryRepository categoryRepo;

	@Autowired
	DeviceRepository deviceRepo;
	
	@Autowired
	FeedbackRepository feedRepo;
	
	@Autowired
	SearchKeyRepository searchRepo;

	@Autowired
	@Qualifier("userServiceImpl")
	private IUserService userService;
	
	@Autowired
	@Qualifier("pharmacyServiceImpl")
	private IPharmacyService pharmacyService;
	
	@Autowired
	@Qualifier("productServiceImpl")
	private IProductSevice productService;

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
			@RequestParam("lo") String lo,
			@RequestParam("la") String la,
			@RequestParam("categoryId") String categoryId,
			@RequestParam("index") String index)
	{
		if (StringUtils.isBlank(lo)||StringUtils.isBlank(la)||StringUtils.isBlank(categoryId))
		{
			return WsResponse.response("001", BaseConstants.paramError);
		}
		
		Integer pharmacy_id=pharmacyService.getNearestPharmacy(Double.valueOf(la), Double.valueOf(lo));
		if (pharmacy_id==null||pharmacy_id<=0)
		{
			return WsResponse.response("008", BaseConstants.noPharmacy);
		}
		List<ProductListItem> list = productService.getProductDetails(pharmacy_id.intValue(),Integer.parseInt(categoryId),Integer.parseInt(index));
		return WsResponse.successResponse(list);
	}
	
	
	/**
	 * 获取特价商品
	 * @param request
	 * @param lo
	 * @param la
	 * @param categoryId
	 * @return
	 */
	@RequestMapping(value="postSprecialPrice",method=RequestMethod.POST)
	public WsResponse getSpecialPrice(HttpServletRequest request,
			@RequestParam("lo") String lo,
			@RequestParam("la") String la,
			@RequestParam("categoryId") String categoryId,
			@RequestParam("index") String index)
	{
		if (StringUtils.isBlank(lo)||StringUtils.isBlank(la))
		{
			return WsResponse.response("001", BaseConstants.paramError);
		}
		
		Integer pharmacy_id=pharmacyService.getNearestPharmacy(Double.valueOf(la), Double.valueOf(lo));
		if (pharmacy_id==null||pharmacy_id<=0)
		{
			return WsResponse.response("008", BaseConstants.noPharmacy);
		}
		List<ProductListItem> list = productService.getSpecPrice(pharmacy_id,Integer.parseInt(index));
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
			@RequestParam("productId") String productId,
			@RequestParam("pharmacyId") String pharmacyId)
	{
		ProductDetailItem detail=productService.getDetail(Integer.valueOf(pharmacyId), Integer.valueOf(productId));
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
			@RequestParam("userId") String userId,
			@RequestParam("keyword") String keyword,
			@RequestParam("lo") String lo,
			@RequestParam("la") String la)
	{
		if (StringUtils.isBlank(lo)||StringUtils.isBlank(la)||StringUtils.isBlank(keyword))
		{
			return WsResponse.response("001", BaseConstants.paramError);
		}
		int id=StringUtils.isBlank(userId)?0:Integer.parseInt(userId);
		SearchKey searchKey=new SearchKey();
		searchKey.setCreatedTime(new Date());
		searchKey.setKeyword(keyword);
		searchKey.setUserId(id);
		searchRepo.save(searchKey);

		Integer pharmacy_id=pharmacyService.getNearestPharmacy(Double.valueOf(la), Double.valueOf(lo));
		if (pharmacy_id==null||pharmacy_id<=0)
		{
			return WsResponse.response("008", BaseConstants.noPharmacy);
		}
		List<ProductListItem> list=productService.getProcuctBySearch(pharmacy_id, keyword);
		
		//List<ProductDetail> list=productDetailRepo.findSearchKey("%"+keyword+"%");
		if (list!=null&&list.size()>0)
		{
			return WsResponse.successResponse(list);
		}
		return WsResponse.response("007", BaseConstants.searchNoResult);
	}
	
	/**
	 * 获取热搜
	 * @param request
	 * @return
	 */
	@RequestMapping(value = "/getHotKey", method = RequestMethod.GET)
	public WsResponse getHotKey(HttpServletRequest request)
	{
		List<String> list=new ArrayList<String>();
		List<SearchKey> searchKeys=searchRepo.findTopKeys();
		for (SearchKey searchKey : searchKeys)
		{
			String t=searchKey.getKeyword();
			if (!list.contains(t))
			{
				if (t.length()>5)
				{
					list.add(t.substring(0,4)+"...");
				}else{
					list.add(t);
				}
			}
		}
		if (list!=null&&list.size()>0)
		{
			return WsResponse.successResponse(list);
		}else {
			return WsResponse.response("007", BaseConstants.searchNoResult);
		}
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
		Integer idLong=Integer.valueOf(userId);
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
	
	/**
	 * 提交地址
	 * @param request
	 * @param userId
	 * @param city
	 * @param receiver
	 * @param phone
	 * @param mapAdd
	 * @param detailAdd
	 * @param mapLongAdd
	 * @return
	 */
	@RequestMapping(value = "/postAddress", method = RequestMethod.POST)
	public WsResponse postAddress(HttpServletRequest request,
			@RequestParam("userId") String userId,
			@RequestParam("city") String city,
			@RequestParam("receiver") String receiver,
			@RequestParam("phone") String phone,
			@RequestParam("mapAdd") String mapAdd,
			@RequestParam("detailAdd") String detailAdd,
			@RequestParam("mapLongAdd") String mapLongAdd)
	{
		if (!CommonMethod.isMobileNum(phone))
		{
			return WsResponse.response("002", BaseConstants.phoneError);
		}
		if (StringUtils.isBlank(userId)||StringUtils.isBlank(city)||StringUtils.isBlank(receiver)||StringUtils.isBlank(mapAdd)||StringUtils.isBlank(detailAdd))
		{
			return WsResponse.response("001", BaseConstants.paramError);
		}
		try
		{
			userService.submitAddress(Integer.valueOf(userId), city, receiver, phone, mapAdd, detailAdd,mapLongAdd);
			return WsResponse.successResponse();
		} catch (Exception e)
		{
			return WsResponse.response("010", BaseConstants.exception);
		}
		
		
	}
	
	/**
	 * 获取地址
	 * @param request
	 * @param userId
	 * @return
	 */
	@RequestMapping(value = "/getAddress", method = RequestMethod.POST)
	public WsResponse getAddress(HttpServletRequest request,@RequestParam("userId") String userId)
	{
		if (StringUtils.isBlank(userId))
		{
			return WsResponse.response("001", BaseConstants.paramError);
		}
		try
		{
			List<Address> list=userService.getAddress(Integer.valueOf(userId));
			return WsResponse.successResponse(list);
		} catch (Exception e)
		{
			return WsResponse.response("010", BaseConstants.exception);
		}
	}
	
	
	/**
	 * 获取摇一摇
	 * @param request
	 * @return
	 */
	@RequestMapping(value = "/getShake", method = RequestMethod.POST)
	public WsResponse getShake(HttpServletRequest request,
			@RequestParam("lo") String lo,
			@RequestParam("la") String la) {
		if (StringUtils.isBlank(lo)||StringUtils.isBlank(la))
		{
			return WsResponse.response("001", BaseConstants.paramError);
		}
		Integer pharmacy_id=pharmacyService.getNearestPharmacy(Double.valueOf(la), Double.valueOf(lo));
		if (pharmacy_id==null||pharmacy_id<=0)
		{
			return WsResponse.response("008", BaseConstants.noPharmacy);
		}
		ProductListItem item=productService.getShakePrice(pharmacy_id);
		return WsResponse.successResponse(item);
	}
	
	/**
	 * 添加到购物车
	 * @param request
	 * @param userId
	 * @param priceId
	 * @param count
	 * @return
	 */
	@RequestMapping(value="/postIntoCar",method=RequestMethod.POST)
	public WsResponse addToCar(HttpServletRequest request,
			@RequestParam("userId") String userId,
			@RequestParam("priceId") String priceId,
			@RequestParam("count") String count) {
		if (StringUtils.isBlank(userId)||StringUtils.isBlank(priceId)) {
			return WsResponse.response("001", BaseConstants.paramError);
		}
		int m=productService.addIntoCar(Integer.parseInt(userId), Integer.parseInt(priceId), Integer.parseInt(count));
		if (m==0) {
			return WsResponse.successResponse();
		}else if (m==1) {
			return WsResponse.response("009", BaseConstants.noStock);
		}else if (m==2){
			return WsResponse.response("012", BaseConstants.carExist);
		}else {
			return WsResponse.response("010", BaseConstants.exception);
		}
	}
	
	@RequestMapping(value="/checkStock",method=RequestMethod.POST)
	public WsResponse checkStock(HttpServletRequest request,
			@RequestParam("priceId")String priceId,
			@RequestParam("count")String count) {
		if (StringUtils.isBlank(priceId)||StringUtils.isBlank(count)) {
			return WsResponse.response("001", BaseConstants.paramError);
		}
		if (productService.checkPriceCount(Integer.parseInt(priceId),Integer.parseInt(count))) {
			return WsResponse.successResponse();
		}
		return WsResponse.response("009", BaseConstants.noStock);
	}
	
	/**
	 * 获取购物车数据
	 * @param request
	 * @param userId
	 * @return
	 */
	@RequestMapping(value="/getCarList",method=RequestMethod.POST)
	public WsResponse getCarList(HttpServletRequest request,
			@RequestParam("userId") String userId) {
		if (StringUtils.isBlank(userId)) {
			return WsResponse.response("001", BaseConstants.paramError);
		}
		List<ProductListItem> carList=productService.getCarList(Integer.parseInt(userId));
		if (carList==null) {
			return WsResponse.response("011", BaseConstants.noCarData);
		}else {
			return WsResponse.successResponse(carList);
		}
	}
	
	/**
	 * 更新默认收获地址信息
	 * @return
	 */
	@RequestMapping(value="/updateDefaultAddress",method=RequestMethod.POST)
	public WsResponse updateDefaultAddress(HttpServletRequest request,
			@RequestParam("userId") String userId,
			@RequestParam("addressId") String addressId) {
		if (StringUtils.isBlank(addressId)||StringUtils.isBlank(userId)) {
			return WsResponse.response("001", BaseConstants.paramError);
		}
		try {
			userService.updateDefaultAddress(Integer.parseInt(userId), Integer.parseInt(addressId));
			return WsResponse.successResponse();
		} catch (Exception e) {
			return WsResponse.response("010", BaseConstants.exception);
		}
		
	}
	
	/**
	 * 获取用户积分
	 * @param request
	 * @param userId
	 * @return
	 */
	@RequestMapping(value="/getPoint",method=RequestMethod.POST)
	public WsResponse getPoint(HttpServletRequest request,
			@RequestParam("userId") String userId) {
		if (StringUtils.isBlank(userId)) {
			return WsResponse.response("001", BaseConstants.paramError);
		}
		try {
			return WsResponse.successResponse(userService.getPoint(Integer.parseInt(userId)));
		} catch (Exception e) {
			return WsResponse.response("010", BaseConstants.exception);
		}
	}
	
	/**
	 * 获取优惠卡券
	 * @param request
	 * @param userId
	 * @return
	 */
	@RequestMapping(value="/getCard",method=RequestMethod.POST)
	public WsResponse getCard(HttpServletRequest request,
			@RequestParam("userId") String userId) {
		if (StringUtils.isBlank(userId)) {
			return WsResponse.response("001", BaseConstants.paramError);
		}
		try {
			List<Card> myCards=userService.getCard(Integer.parseInt(userId));
			if (myCards!=null&&myCards.size()>0) {
				return WsResponse.successResponse(myCards);
			}else {
				return WsResponse.response("013", BaseConstants.noCard);
			}
		} catch (Exception e) {
			return WsResponse.response("010", BaseConstants.exception);
		}
	}
	
	
	
}
