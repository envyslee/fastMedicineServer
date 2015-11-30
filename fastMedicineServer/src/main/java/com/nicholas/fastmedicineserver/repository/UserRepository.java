package com.nicholas.fastmedicineserver.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nicholas.fastmedicineserver.entity.UserInfo;

public interface UserRepository extends JpaRepository<UserInfo, Integer>
{
		UserInfo findByPhoneNum(String num);
		
		UserInfo findById(Integer id);
}
