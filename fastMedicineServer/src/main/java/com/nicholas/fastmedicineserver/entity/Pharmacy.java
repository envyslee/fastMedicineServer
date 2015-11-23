package com.nicholas.fastmedicineserver.entity;


import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="t_pharmacy")
public class Pharmacy
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id", unique = true, nullable = false)
	private Integer id;// 自增序列号

	@Column(name = "pharmacyName", length = 100, nullable = false)
	private String pharmacyName;// 药店名称
	
	@Column(name = "pharmacyLo", nullable = false)
	private double pharmacyLo;// 经度
	
	@Column(name = "pharmacyLa",  nullable = false)
	private double pharmacyLa;// 纬度
	
	@Column(name = "pharmacyAddress", length = 100, nullable = false)
	private String pharmacyAddress;// 药店地址
	
	@Column(name = "pharmacyPhone", length = 20)
	private String pharmacyPhone;// 药店号码

	public Integer getId()
	{
		return id;
	}

	public void setId(Integer id)
	{
		this.id = id;
	}

	public String getPharmacyName()
	{
		return pharmacyName;
	}

	public void setPharmacyName(String pharmacyName)
	{
		this.pharmacyName = pharmacyName;
	}

	public double getPharmacyLo()
	{
		return pharmacyLo;
	}

	public void setPharmacyLo(double pharmacyLo)
	{
		this.pharmacyLo = pharmacyLo;
	}

	public double getPharmacyLa()
	{
		return pharmacyLa;
	}

	public void setPharmacyLa(double pharmacyLa)
	{
		this.pharmacyLa = pharmacyLa;
	}

	public String getPharmacyAddress()
	{
		return pharmacyAddress;
	}

	public void setPharmacyAddress(String pharmacyAddress)
	{
		this.pharmacyAddress = pharmacyAddress;
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
