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
@Table(name="t_userInfo")
public class UserInfo
{
	
	public Long getId()
	{
		return id;
	}

	public void setId(Long id)
	{
		this.id = id;
	}

	public String getPhoneNum()
	{
		return phoneNum;
	}

	public void setPhoneNum(String phoneNum)
	{
		this.phoneNum = phoneNum;
	}

	public String getPassword()
	{
		return password;
	}

	public void setPassword(String password)
	{
		this.password = password;
	}

	public Integer getUserPoint()
	{
		return userPoint;
	}

	public void setUserPoint(Integer userPoint)
	{
		this.userPoint = userPoint;
	}

	public Date getCreatedTime()
	{
		return createdTime;
	}

	public void setCreatedTime(Date createdTime)
	{
		this.createdTime = createdTime;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id", unique = true, nullable = false)
	private Long id;// 自增序列号


	@Column(name = "phoneNum", length = 11, nullable = false)
	private String phoneNum;// 手机号
	
	@Column(name="password",length=50,nullable=false)
	private String password;//密码
	
	@Column(name="userPoint",nullable=false)
	private Integer userPoint;//用户积分
	
	@Column(name = "createdTime")
	@Temporal(TemporalType.TIMESTAMP)
	private Date createdTime;// 创建时间

}
