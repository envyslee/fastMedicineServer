package com.nicholas.fastmedicineserver.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nicholas.fastmedicineserver.entity.ReviewItem;

public interface ReviewRepository extends JpaRepository<ReviewItem, Integer> {

	List<ReviewItem> findByPriceIdAndVerifyId(Integer priceId,Integer verifyId);
}
