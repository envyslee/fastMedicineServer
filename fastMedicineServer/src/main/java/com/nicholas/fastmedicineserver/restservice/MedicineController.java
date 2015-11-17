package com.nicholas.fastmedicineserver.restservice;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.nicholas.fastmedicineserver.entity.ProductCategory;
import com.nicholas.fastmedicineserver.entity.ProductDetail;
import com.nicholas.fastmedicineserver.entity.ProductListItem;
import com.nicholas.fastmedicineserver.integration.WsResponse;
import com.nicholas.fastmedicineserver.repository.CategoryRepository;
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
	
	
	
	@RequestMapping(value = "/getProductCategoryList",method=RequestMethod.GET)
	public WsResponse getCategoryList(HttpServletRequest request)
	{
		List<ProductCategory> categories=categoryRepo.findAll();
		return WsResponse.successResponse(categories);
	}
	
	
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
	
	
	@RequestMapping(value = "/postProductDetail",method=RequestMethod.POST)
	public String  getProductDetail(HttpServletRequest request,@RequestParam("productId") Long productId)
	{
		ProductDetail detail=productDetailRepo.findById(productId);
		return CommonMethod.Obj2Json(WsResponse.successResponse(detail));
	}
	
	
	
	@RequestMapping(value = "/postSearch",method=RequestMethod.POST)
	public String  postSearch(HttpServletRequest request,@RequestParam("keyword") String keyword)
	{
		
		
		return null;
	}
	
	
}
