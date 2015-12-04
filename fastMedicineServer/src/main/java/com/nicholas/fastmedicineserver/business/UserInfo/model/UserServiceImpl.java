package com.nicholas.fastmedicineserver.business.UserInfo.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import scala.collection.mutable.HashMap;

import com.nicholas.fastmedicineserver.business.UserInfo.service.IUserService;
import com.nicholas.fastmedicineserver.entity.Address;
import com.nicholas.fastmedicineserver.entity.Card;
import com.nicholas.fastmedicineserver.entity.MyCard;
import com.nicholas.fastmedicineserver.entity.ReviewItem;
import com.nicholas.fastmedicineserver.entity.UserInfo;
import com.nicholas.fastmedicineserver.repository.AddressRepository;
import com.nicholas.fastmedicineserver.repository.CardRepository;
import com.nicholas.fastmedicineserver.repository.MyCardRepository;
import com.nicholas.fastmedicineserver.repository.ReviewRepository;
import com.nicholas.fastmedicineserver.repository.UserRepository;

@Component
public class UserServiceImpl implements IUserService
{
	@Autowired
	UserRepository userRepo;
	
	@Autowired
	AddressRepository addressRepo;
	
	@Autowired
	MyCardRepository myCardRepo;
	
	@Autowired
	CardRepository cardRepo;
	
	@Autowired
	ReviewRepository reviewRepo;
	
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
		Address defaultAddress=addressRepo.findByUserIdAndIsDefault(userId, 1);
		if (defaultAddress!=null) {
			defaultAddress.setIsDefault(0);
			addressRepo.save(defaultAddress);
		}
		Address address=new Address();
		address.setCity(city);
		address.setDetailAdd(detailAdd);
		address.setMapAdd(mapAdd);
		address.setPhoneNum(phone);
		address.setReceiver(receiver);
		address.setUserId(userId);
		address.setMapLongAdd(mapLongAdd);
		address.setIsDefault(1);
		addressRepo.save(address);
		//Integer id=address.getId();
	}

	@Override
	public List<Address> getAddress(Integer userId)
	{
		List<Address> list=addressRepo.findByUserId(userId);
		return list;
	}

	@Override
	public void updateDefaultAddress(Integer userId,Integer addressId) {
		Address defaultAddress=addressRepo.findByUserIdAndIsDefault(userId, 1);
		defaultAddress.setIsDefault(0);
		addressRepo.save(defaultAddress);
		Address newDefault=addressRepo.findById(addressId);
		newDefault.setIsDefault(1);
		addressRepo.save(newDefault);
	}

	@Override
	public int getPoint(Integer userId) {
		UserInfo info=userRepo.findById(userId);
		return info.getUserPoint();
	}

	@Override
	public List<Card> getCard(Integer userId) {
		List<Card> list=new ArrayList<Card>();
		List<MyCard> myCards=myCardRepo.findByUserIdAndUseStatus(userId, 0);
		for (MyCard myCard : myCards) {
			Card card=cardRepo.findById(myCard.getCardId());
			if (card.getOverTime().before(new Date())) {
				myCard.setUseStatus(2);
				myCardRepo.save(myCard);
			}else {
				
				list.add(card);
			}
		}
		return list;
	}

	@Override
	public List<Card> getOtherCard(Integer userId, Integer useStatus) {
		List<Card> list=new ArrayList<Card>();
		List<MyCard> myCards=myCardRepo.findByUserIdAndUseStatus(userId,useStatus);
		for (MyCard myCard : myCards) {
			Card card=cardRepo.findById(myCard.getCardId());
			list.add(card);
		}
		return list;
	}

	
	@Override
	public List<ReviewItem> getReviewList(Integer priceId) {
		List<ReviewItem> reviews=reviewRepo.findByPriceIdAndVerifyId(priceId, 1);
		for (ReviewItem review : reviews) {
			Integer userId=review.getUserId();
			UserInfo userInfo=userRepo.findById(userId);
			review.setUserName(userInfo.getPhoneNum());
		}
		return reviews;
	}
}
