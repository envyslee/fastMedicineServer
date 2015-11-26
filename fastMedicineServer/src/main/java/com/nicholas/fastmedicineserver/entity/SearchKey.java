package com.nicholas.fastmedicineserver.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="t_searchKey")
public class SearchKey
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id", unique = true, nullable = false)
	private Integer id;// 自增序列号


	@Column(name = "keyword", length = 50, nullable = false)
	private String keyword;// 关键词
	
	@Column(name = "userId", nullable = false)
	private Integer userId;// 用户id
	
	@Column(name = "createdTime")
	@Temporal(TemporalType.TIMESTAMP)
	private Date createdTime;// 创建时间


	public Integer getId()
	{
		return id;
	}

	public void setId(Integer id)
	{
		this.id = id;
	}

	public String getKeyword()
	{
		return keyword;
	}

	public void setKeyword(String keyword)
	{
		this.keyword = keyword;
	}

	public Integer getUserId()
	{
		return userId;
	}

	public void setUserId(Integer userId)
	{
		this.userId = userId;
	}

	public Date getCreatedTime()
	{
		return createdTime;
	}

	public void setCreatedTime(Date createdTime)
	{
		this.createdTime = createdTime;
	}
	
	
}
