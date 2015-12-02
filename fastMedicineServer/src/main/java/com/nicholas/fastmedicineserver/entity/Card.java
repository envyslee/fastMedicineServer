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
@Table(name="t_card")
public class Card {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id", unique = true, nullable = false)
	private Integer id;// 自增序列号

	@Column(name = "cardAmount",  nullable = false)
	private Integer cardAmount;// 卡券面值
	
	@Column(name = "useConditon",  nullable = false)
	private Integer useConditon;// 使用条件（0：通用 1：满10使用 2：满20...）

	@Column(name = "overTime")
	@Temporal(TemporalType.TIMESTAMP)
	private Date overTime;// 过期时间
	
	@Column(name = "cardName", length = 100, nullable = false)
	private String cardName;// 卡券名称
	
	@Column(name = "cardDesc", length = 100, nullable = false)
	private String cardDesc;// 卡券描述

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getCardAmount() {
		return cardAmount;
	}

	public void setCardAmount(Integer cardAmount) {
		this.cardAmount = cardAmount;
	}

	public Integer getUseConditon() {
		return useConditon;
	}

	public void setUseConditon(Integer useConditon) {
		this.useConditon = useConditon;
	}

	public Date getOverTime() {
		return overTime;
	}

	public void setOverTime(Date overTime) {
		this.overTime = overTime;
	}

	public String getCardName() {
		return cardName;
	}

	public void setCardName(String cardName) {
		this.cardName = cardName;
	}

	public String getCardDesc() {
		return cardDesc;
	}

	public void setCardDesc(String cardDesc) {
		this.cardDesc = cardDesc;
	}
	
	
}
