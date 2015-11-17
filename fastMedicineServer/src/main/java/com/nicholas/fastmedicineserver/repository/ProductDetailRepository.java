package com.nicholas.fastmedicineserver.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;



import org.springframework.data.jpa.repository.Query;

import com.nicholas.fastmedicineserver.entity.ProductDetail;

public interface ProductDetailRepository extends JpaRepository<ProductDetail, Long>
{
	ProductDetail findById(Long id);
	
	List<ProductDetail> findByCategoryId(Long id);
}
