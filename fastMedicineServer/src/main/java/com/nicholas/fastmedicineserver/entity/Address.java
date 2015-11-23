package com.nicholas.fastmedicineserver.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="t_address")
public class Address
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id", unique = true, nullable = false)
	private Integer id;// 自增序列号

	@Column(name = "userId",  nullable = false)
	private Integer userId;// 用户id

	@Column(name = "receiver", length = 20, nullable = false)
	private String receiver;// 收货人
	
	@Column(name = "city", length = 20, nullable = false)
	private String city;// 城市
	
	@Column(name = "mapAdd", length = 255, nullable = false)
	private String mapAdd;// 地图选择地址
	
	@Column(name = "mapLongAdd", length = 255, nullable = false)
	private String mapLongAdd;// 地图选择地址详细部分
	
	@Column(name = "detailAdd", length = 20, nullable = false)
	private String detailAdd;// 手动填写部分地址
	
	@Column(name = "phoneNum", length = 11, nullable = false)
	private String phoneNum;// 收货人手机号

	
	
	public String getMapLongAdd()
	{
		return mapLongAdd;
	}

	public void setMapLongAdd(String mapLongAdd)
	{
		this.mapLongAdd = mapLongAdd;
	}

	public Integer getId()
	{
		return id;
	}

	public void setId(Integer id)
	{
		this.id = id;
	}

	public Integer getUserId()
	{
		return userId;
	}

	public void setUserId(Integer userId)
	{
		this.userId = userId;
	}

	public String getReceiver()
	{
		return receiver;
	}

	public void setReceiver(String receiver)
	{
		this.receiver = receiver;
	}

	public String getCity()
	{
		return city;
	}

	public void setCity(String city)
	{
		this.city = city;
	}

	public String getMapAdd()
	{
		return mapAdd;
	}

	public void setMapAdd(String mapAdd)
	{
		this.mapAdd = mapAdd;
	}

	public String getDetailAdd()
	{
		return detailAdd;
	}

	public void setDetailAdd(String detailAdd)
	{
		this.detailAdd = detailAdd;
	}

	public String getPhoneNum()
	{
		return phoneNum;
	}

	public void setPhoneNum(String phoneNum)
	{
		this.phoneNum = phoneNum;
	}
	
	
	
}
