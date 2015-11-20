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
@Table(name="t_feedback")
public class Feedback
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id", unique = true, nullable = false)
	private Long id;// 自增序列号

	@Column(name = "createdTime")
	@Temporal(TemporalType.TIMESTAMP)
	private Date createdTime;// 创建时间

	@Column(name = "feedContent", length = 255, nullable = false)
	private String feedContent;// 反馈内容
	
	@Column(name="userId",nullable=false)
	private Long userId;
	
	@Column(name = "appVersion", length = 10, nullable = false)
	private String appVersion;// 应用版本号
	
	@Column(name = "osVersion", length = 10, nullable = false)
	private String osVersion;// 系统版本号
	
	@Column(name = "deviceModel", length = 50, nullable = false)
	private String deviceModel;// 设备
	
	@Column(name = "deviceOS", length = 10, nullable = false)
	private String deviceOS;// 系统
	
	public Long getId()
	{
		return id;
	}

	public void setId(Long id)
	{
		this.id = id;
	}

	public Date getCreatedTime()
	{
		return createdTime;
	}

	public void setCreatedTime(Date createdTime)
	{
		this.createdTime = createdTime;
	}

	public String getFeedContent()
	{
		return feedContent;
	}

	public void setFeedContent(String feedContent)
	{
		this.feedContent = feedContent;
	}

	public Long getUserId()
	{
		return userId;
	}

	public void setUserId(Long userId)
	{
		this.userId = userId;
	}

	public String getAppVersion()
	{
		return appVersion;
	}

	public void setAppVersion(String appVersion)
	{
		this.appVersion = appVersion;
	}

	public String getOsVersion()
	{
		return osVersion;
	}

	public void setOsVersion(String osVersion)
	{
		this.osVersion = osVersion;
	}

	public String getDeviceModel()
	{
		return deviceModel;
	}

	public void setDeviceModel(String deviceModel)
	{
		this.deviceModel = deviceModel;
	}

	public String getDeviceOS()
	{
		return deviceOS;
	}

	public void setDeviceOS(String deviceOS)
	{
		this.deviceOS = deviceOS;
	}

	
	
	
	
}
