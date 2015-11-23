package com.nicholas.fastmedicineserver.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;



import org.springframework.data.jpa.repository.Query;

import com.nicholas.fastmedicineserver.entity.ProductDetail;

public interface ProductDetailRepository extends JpaRepository<ProductDetail, Integer>
{
	ProductDetail findById(Integer id);
	
	List<ProductDetail> findByCategoryId(Integer id);
	
	
	@Query(nativeQuery = true, value ="SELECT * from t_productdetail WHERE  product_key LIKE ?1")
	List<ProductDetail> findSearchKey(String key);
}
