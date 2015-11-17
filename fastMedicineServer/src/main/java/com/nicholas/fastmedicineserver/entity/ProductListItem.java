package com.nicholas.fastmedicineserver.entity;

import java.math.BigDecimal;

import javax.annotation.Generated;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


public class ProductListItem
{
	
	private Long id;
	

	private String iconUrl;// 图片
	

	private String productName;// 名称
	

	private String productDesc;// 描述
	
	
	private Long productId;
	
	private String productSpec;// 商品规格
	
	private BigDecimal productPrice;// 商品价格
	
	private Integer productSale;// 商品销量
	
	

	public Long getId()
	{
		return id;
	}

	public void setId(Long id)
	{
		this.id = id;
	}

	public String getIconUrl()
	{
		return iconUrl;
	}

	public void setIconUrl(String iconUrl)
	{
		this.iconUrl = iconUrl;
	}

	public String getProductName()
	{
		return productName;
	}

	public void setProductName(String productName)
	{
		this.productName = productName;
	}

	public String getProductDesc()
	{
		return productDesc;
	}

	public void setProductDesc(String productDesc)
	{
		this.productDesc = productDesc;
	}

	public Long getProductId()
	{
		return productId;
	}

	public void setProductId(Long productId)
	{
		this.productId = productId;
	}

	public String getProductSpec()
	{
		return productSpec;
	}

	public void setProductSpec(String productSpec)
	{
		this.productSpec = productSpec;
	}

	public BigDecimal getProductPrice()
	{
		return productPrice;
	}

	public void setProductPrice(BigDecimal productPrice)
	{
		this.productPrice = productPrice;
	}

	public Integer getProductSale()
	{
		return productSale;
	}

	public void setProductSale(Integer productSale)
	{
		this.productSale = productSale;
	}

}
