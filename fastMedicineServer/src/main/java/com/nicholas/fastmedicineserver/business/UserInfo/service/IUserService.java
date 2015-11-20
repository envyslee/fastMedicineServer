package com.nicholas.fastmedicineserver.business.UserInfo.service;


public interface IUserService
{

	/**
	 * 通过手机号查找用户,判断是否存在
	 * @return
	 */
	boolean isUserExistByPhone(String num);
	
	
	/**
	 * 通过id查找用户,判断是否存在
	 * @return
	 */
	boolean isUserExistById(Long id);
	
	
	/**
	 * 注册
	 * @return
	 */
	Long registerUser(String phoneNum,String password);
	
	/**
	 * 登录
	 * @return
	 */
	String login(String phoneNum,String password);
}
