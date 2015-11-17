package com.nicholas.fastmedicineserver.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


//商品分类表
@Entity
@Table(name = "t_category")
public class ProductCategory
{
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

	public String getCategoryName()
	{
		return categoryName;
	}

	public void setCategoryName(String categoryName)
	{
		this.categoryName = categoryName;
	}

	public String getCategoryDesc()
	{
		return categoryDesc;
	}

	public void setCategoryDesc(String categoryDesc)
	{
		this.categoryDesc = categoryDesc;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id", unique = true, nullable = false)
	private Long id;// 自增序列号


	@Column(name = "iconUrl", length = 50, nullable = false)
	private String iconUrl;// 图片
	
	@Column(name = "categoryName", length = 50, nullable = false)
	private String categoryName;// 分类名称
	
	@Column(name = "categoryDesc", length = 50, nullable = false)
	private String categoryDesc;// 分类描述
	
}
