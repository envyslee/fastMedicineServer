package com.nicholas.fastmedicineserver.entity;

import java.math.BigDecimal;


public class ProductDetailItem
{
	
	private String productPics;//商品连扳图
	
	private String mainIngredients;// 主要成分
	
	private String productCharacter;// 商品性状
	
	private String productUsage;// 功能主治
	
	private String usageAmount;// 用法用量

	private String attentionTip;// 注意事项
	
	private String productStorage;// 贮藏
	
	private String productEnterprise;// 生产企业
	
	private String untowardEffect ;// 不良反应
	
	private String productName;// 商品名称
	
	private String productSpec;// 商品规格
	
	private BigDecimal productPrice;// 商品价格
	
	private String pharmacyName;//药店名称
	
	private String pharmacyPhone;//药店电话
	
	private String pharmacyAddress;//药店地址
	
	

	public String getPharmacyAddress()
	{
		return pharmacyAddress;
	}

	public void setPharmacyAddress(String pharmacyAddres)
	{
		this.pharmacyAddress = pharmacyAddres;
	}

	public String getProductPics()
	{
		return productPics;
	}

	public void setProductPics(String productPics)
	{
		this.productPics = productPics;
	}

	public String getMainIngredients()
	{
		return mainIngredients;
	}

	public void setMainIngredients(String mainIngredients)
	{
		this.mainIngredients = mainIngredients;
	}

	public String getProductCharacter()
	{
		return productCharacter;
	}

	public void setProductCharacter(String productCharacter)
	{
		this.productCharacter = productCharacter;
	}

	public String getProductUsage()
	{
		return productUsage;
	}

	public void setProductUsage(String productUsage)
	{
		this.productUsage = productUsage;
	}

	public String getUsageAmount()
	{
		return usageAmount;
	}

	public void setUsageAmount(String usageAmount)
	{
		this.usageAmount = usageAmount;
	}

	public String getAttentionTip()
	{
		return attentionTip;
	}

	public void setAttentionTip(String attentionTip)
	{
		this.attentionTip = attentionTip;
	}

	public String getProductStorage()
	{
		return productStorage;
	}

	public void setProductStorage(String productStorage)
	{
		this.productStorage = productStorage;
	}

	public String getProductEnterprise()
	{
		return productEnterprise;
	}

	public void setProductEnterprise(String productEnterprise)
	{
		this.productEnterprise = productEnterprise;
	}

	public String getUntowardEffect()
	{
		return untowardEffect;
	}

	public void setUntowardEffect(String untowardEffect)
	{
		this.untowardEffect = untowardEffect;
	}

	public String getProductName()
	{
		return productName;
	}

	public void setProductName(String productName)
	{
		this.productName = productName;
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

	public String getPharmacyName()
	{
		return pharmacyName;
	}

	public void setPharmacyName(String pharmacyName)
	{
		this.pharmacyName = pharmacyName;
	}

	public String getPharmacyPhone()
	{
		return pharmacyPhone;
	}

	public void setPharmacyPhone(String pharmacyPhone)
	{
		this.pharmacyPhone = pharmacyPhone;
	}
	
	
	
	
}
