package com.nicholas.fastmedicineserver.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nicholas.fastmedicineserver.entity.UserInfo;

public interface UserRepository extends JpaRepository<UserInfo, Long>
{
		UserInfo findByPhoneNum(String num);
		
		UserInfo findById(Long id);
}
