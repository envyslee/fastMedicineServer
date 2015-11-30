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
@Table(name="t_car")
public class Car {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id", unique = true, nullable = false)
	private Integer id;// 自增序列号

	@Column(name = "userId",  nullable = false)
	private Integer userId;// 用户id
	
	@Column(name = "priceId",  nullable = false)
	private Integer priceId;// 商品id

	@Column(name = "createdTime")
	@Temporal(TemporalType.TIMESTAMP)
	private Date createdTime;// 创建时间
	
	@Column(name = "isAbandoned",  nullable = false)
	private Integer isAbandoned;// 是否废弃 0：有效 1：删除 2：已生成订单
	
	@Column(name = "abandonedTime")
	@Temporal(TemporalType.TIMESTAMP)
	private Date abandonedTime;// 废弃时间

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public Integer getPriceId() {
		return priceId;
	}

	public void setPriceId(Integer priceId) {
		this.priceId = priceId;
	}

	public Date getCreatedTime() {
		return createdTime;
	}

	public void setCreatedTime(Date createdTime) {
		this.createdTime = createdTime;
	}

	public Integer getIsAbandoned() {
		return isAbandoned;
	}

	public void setIsAbandoned(Integer isAbandoned) {
		this.isAbandoned = isAbandoned;
	}

	public Date getAbandonedTime() {
		return abandonedTime;
	}

	public void setAbandonedTime(Date abandonedTime) {
		this.abandonedTime = abandonedTime;
	}
	
	
}
