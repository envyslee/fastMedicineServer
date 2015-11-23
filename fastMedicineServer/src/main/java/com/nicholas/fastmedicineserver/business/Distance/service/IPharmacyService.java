package com.nicholas.fastmedicineserver.business.Distance.service;


public interface IPharmacyService
{
	/**
	 * 获取最近门店
	 * @param la
	 * @param lo
	 * @return
	 */
	Integer getNearestPharmacy(double la,double lo);
}
