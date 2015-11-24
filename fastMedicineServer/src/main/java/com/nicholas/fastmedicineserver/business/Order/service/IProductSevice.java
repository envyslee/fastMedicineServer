package com.nicholas.fastmedicineserver.business.Order.service;

import java.util.List;

import com.nicholas.fastmedicineserver.entity.Price;
import com.nicholas.fastmedicineserver.entity.ProductDetail;
import com.nicholas.fastmedicineserver.entity.ProductDetailItem;
import com.nicholas.fastmedicineserver.entity.ProductListItem;

public interface IProductSevice
{
	
	
	List<Price> getProducts(Integer p, Integer c);

	
	
	/**
	 * 获取商品列表
	 * @param p 药店id
	 * @param c 分类id
	 * @return
	 */
	List<ProductDetail> getProductDetails(int p, int c);
	
	/**
	 * 获取商品详情
	 * @param ph 药店id
	 * @param pr 商品id
	 * @return
	 */
	ProductDetailItem  getDetail(Integer ph, Integer pr);
	
	
	/**
	 * 获取药店所有商品
	 * @return
	 */
	List<ProductListItem> getProcuctBySearch(Integer ph,String key);
	
	
	
}
