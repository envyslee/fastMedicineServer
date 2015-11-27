package com.nicholas.fastmedicineserver.business.Order.service;

import java.util.List;

import com.nicholas.fastmedicineserver.entity.Price;
import com.nicholas.fastmedicineserver.entity.ProductDetail;
import com.nicholas.fastmedicineserver.entity.ProductDetailItem;
import com.nicholas.fastmedicineserver.entity.ProductListItem;

public interface IProductSevice
{
	/**
	 * 获取商品列表
	 * @param p 药店id
	 * @param c 分类id
	 * @return
	 */
	List<ProductListItem> getProductDetails(int p, int c,int i);
	
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
	
	
	/**
	 * 获取特价药品
	 * @param ph
	 * @return
	 */
	List<ProductListItem> getSpecPrice(Integer ph,Integer i);
	
	
	/**
	 * 获取摇一摇商品
	 * @param ph
	 * @return
	 */
	ProductListItem getShakePrice(Integer ph);
}
