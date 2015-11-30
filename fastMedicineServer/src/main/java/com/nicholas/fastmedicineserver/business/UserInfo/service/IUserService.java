package com.nicholas.fastmedicineserver.business.UserInfo.service;

import java.util.List;

import com.nicholas.fastmedicineserver.entity.Address;


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
	boolean isUserExistById(Integer id);
	
	
	/**
	 * 注册
	 * @return
	 */
	Integer registerUser(String phoneNum,String password);
	
	/**
	 * 登录
	 * @return
	 */
	String login(String phoneNum,String password);
	
	/**
	 * 提交地址
	 * @param userId
	 * @param city
	 * @param receiver
	 * @param phone
	 * @param mapAdd
	 * @param detailAdd
	 * @return
	 */
	void submitAddress(Integer userId,String city,String receiver,String phone,String mapAdd,String detailAdd,String mapLongAdd);
	
	
	/**
	 * 获取地址
	 * @param userId
	 * @return
	 */
	List<Address> getAddress(Integer userId);
}
