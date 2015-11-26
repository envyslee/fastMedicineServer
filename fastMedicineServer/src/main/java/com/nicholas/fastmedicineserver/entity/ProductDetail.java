package com.nicholas.fastmedicineserver.entity;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


//商品详情表
@Entity
@Table(name="t_productdetail")
public class ProductDetail
{
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id", unique = true, nullable = false)
	private Integer id;// 自增序列号
	
	@Column(name = "productIntro")
	private String productIntro;// 说明书
	
	@Column(name="categoryId",nullable=false)
	private Integer categoryId;//分类id
	
	@Column(name="productPics",length = 255)
	private String productPics;//商品连扳图
	


	@Column(name = "productKey", length = 255, nullable = false)
	private String productKey;// 商品关键词
	
	
	
	@Column(name = "mainIngredients", length = 255, nullable = false)
	private String mainIngredients;// 主要成分
	
	@Column(name = "productCharacter", length = 255, nullable = false)
	private String productCharacter;// 商品性状
	
	@Column(name = "productUsage", length = 255, nullable = false)
	private String productUsage;// 功能主治
	
	@Column(name = "usageAmount", length = 255, nullable = false)
	private String usageAmount;// 用法用量
	


	@Column(name = "attentionTip", length = 255, nullable = false)
	private String attentionTip;// 注意事项
	
	@Column(name = "productStorage", length = 255, nullable = false)
	private String productStorage;// 贮藏
	
	@Column(name = "productEnterprise", length = 255, nullable = false)
	private String productEnterprise;// 生产企业
	
	@Column(name = "untowardEffect ", length = 255)
	private String untowardEffect ;// 不良反应

	
	@Column(name = "productName", length = 50, nullable = false)
	private String productName;// 商品名称
	

	@Column(name = "productSpec", length = 255, nullable = false)
	private String productSpec;// 商品规格
	
	@Column(name = "productPrice", length = 50, nullable = false)
	private BigDecimal productPrice;// 商品价格
	
	@Column(name = "productSale",  nullable = false)
	private Integer productSale;// 商品销量
	
	@Column(name = "pharmacyId", nullable = false)
	private Integer pharmacyId;// 药店id
	
	public Integer getPharmacyId()
	{
		return pharmacyId;
	}

	public void setPharmacyId(Integer pharmacyId)
	{
		this.pharmacyId = pharmacyId;
	}


	public String getUsageAmount()
	{
		return usageAmount;
	}

	public void setUsageAmount(String usageAmount)
	{
		this.usageAmount = usageAmount;
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

	public Integer getProductSale()
	{
		return productSale;
	}

	public void setProductSale(Integer productSale)
	{
		this.productSale = productSale;
	}

	public Integer getId()
	{
		return id;
	}

	public void setId(Integer id)
	{
		this.id = id;
	}

	public String getProductIntro()
	{
		return productIntro;
	}

	public void setProductIntro(String productIntro)
	{
		this.productIntro = productIntro;
	}

	public Integer getCategoryId()
	{
		return categoryId;
	}

	public void setCategoryId(Integer categoryId)
	{
		this.categoryId = categoryId;
	}

	public String getProductPics()
	{
		return productPics;
	}

	public void setProductPics(String productPics)
	{
		this.productPics = productPics;
	}

	

	public String getProductKey()
	{
		return productKey;
	}

	public void setProductKey(String productKey)
	{
		this.productKey = productKey;
	}
	
	
}
