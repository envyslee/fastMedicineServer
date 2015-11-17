package com.nicholas.fastmedicineserver.business.UserInfo.service;


public interface IUserService
{

	/**
	 * 通过手机号查找用户,判断是否存在
	 * @return
	 */
	boolean isUserExist(String num);
	
	
	Long registerUser(String phoneNum,String password);
}
