package com.nicholas.fastmedicineserver.business.UserInfo.model;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.nicholas.fastmedicineserver.business.UserInfo.service.IUserService;
import com.nicholas.fastmedicineserver.entity.UserInfo;
import com.nicholas.fastmedicineserver.repository.UserRepository;

@Component
public class UserServiceImpl implements IUserService
{
	@Autowired
	UserRepository userRepo;
	
	
	@Override
	public boolean isUserExistByPhone(String num)
	{
		UserInfo userInfo=	userRepo.findByPhoneNum(num);
		if (userInfo==null)
		{
			return false;
		}
		return true;
	}
	
	@Override
	public boolean isUserExistById(Long id)
	{
		UserInfo userInfo=userRepo.findById(id);
		if (userInfo==null)
		{
			return false;
		}
		return true;
	}
	
	@Override
	public Long registerUser(String phoneNum,String password)
	{
		UserInfo info=new UserInfo();
		info.setPhoneNum(phoneNum);
		info.setPassword(password);
		info.setUserPoint(0);
		info.setCreatedTime(new Date());
		userRepo.save(info);
		return info.getId();
	}
	
	@Override
	public String login(String phoneNum,String password)
	{
		UserInfo userInfo=	userRepo.findByPhoneNum(phoneNum);
		String realPassword=userInfo.getPassword();
		if (password.equals(realPassword))
			return userInfo.getId().toString();
		return null;
	}
	
}
