package com.nicholas.fastmedicineserver.business.UserInfo.model;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.nicholas.fastmedicineserver.business.UserInfo.service.IUserService;
import com.nicholas.fastmedicineserver.entity.Address;
import com.nicholas.fastmedicineserver.entity.UserInfo;
import com.nicholas.fastmedicineserver.repository.AddressRepository;
import com.nicholas.fastmedicineserver.repository.UserRepository;

@Component
public class UserServiceImpl implements IUserService
{
	@Autowired
	UserRepository userRepo;
	
	@Autowired
	AddressRepository addressRepo;
	
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
	public boolean isUserExistById(Integer id)
	{
		UserInfo userInfo=userRepo.findById(id);
		if (userInfo==null)
		{
			return false;
		}
		return true;
	}
	
	@Override
	public Integer registerUser(String phoneNum,String password)
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

	@Override
	public void submitAddress(Integer userId, String city, String receiver,
			String phone, String mapAdd, String detailAdd,String mapLongAdd)
	{
		Address address=new Address();
		address.setCity(city);
		address.setDetailAdd(detailAdd);
		address.setMapAdd(mapAdd);
		address.setPhoneNum(phone);
		address.setReceiver(receiver);
		address.setUserId(userId);
		address.setMapLongAdd(mapLongAdd);
		addressRepo.save(address);
		Integer id=address.getId();
	}

	@Override
	public List<Address> getAddress(Integer userId)
	{
		List<Address> list=addressRepo.findByUserId(userId);
		return list;
	}
	
}
