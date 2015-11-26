package com.nicholas.fastmedicineserver.entity;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.neo4j.cypher.internal.compiler.v2_1.ast.False;


@Entity
@Table(name="t_price")
public class Price
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id", unique = true, nullable = false)
	private Integer id;// 自增序列号

	@Column(name = "pharmacyId", nullable = false)
	private Integer pharmacyId;// 药店id
	
	@Column(name = "productPrice", nullable = false)
	private BigDecimal productPrice;// 商品价格
	
	@Column(name = "productId",nullable = false)
	private Integer productId;// 商品id
	
	
	@Column(name = "categoryId",nullable = false)
	private Integer categoryId;// 商品分类id
	
	@Column(name="shakeStatus",nullable=false)
	private Integer shakeStatus;//0: 不参与摇一摇 1：摇一摇
	
	@Column(name="specialPrice",nullable=false)
	private Integer specialPrice;//0:特价 1：非特价
	
	

	public Integer getShakeStatus()
	{
		return shakeStatus;
	}

	public void setShakeStatus(Integer shakeStatus)
	{
		this.shakeStatus = shakeStatus;
	}

	public Integer getSpecialPrice()
	{
		return specialPrice;
	}

	public void setSpecialPrice(Integer specialPrice)
	{
		this.specialPrice = specialPrice;
	}

	public Integer getCategoryId()
	{
		return categoryId;
	}

	public void setCategoryId(Integer categoryId)
	{
		this.categoryId = categoryId;
	}

	public Integer getId()
	{
		return id;
	}

	public void setId(Integer id)
	{
		this.id = id;
	}

	public Integer getPharmacyId()
	{
		return pharmacyId;
	}

	public void setPharmacyId(Integer pharmacyId)
	{
		this.pharmacyId = pharmacyId;
	}

	public BigDecimal getProductPrice()
	{
		return productPrice;
	}

	public void setProductPrice(BigDecimal productPrice)
	{
		this.productPrice = productPrice;
	}

	public Integer getProductId()
	{
		return productId;
	}

	public void setProductId(Integer productId)
	{
		this.productId = productId;
	}
	
	
	
}
