package com.nicholas.fastmedicineserver.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nicholas.fastmedicineserver.entity.MyCard;

public interface MyCardRepository extends JpaRepository<MyCard, Integer> {

	List<MyCard> findByUserIdAndUseStatus(Integer userId,Integer useStatus);
}
