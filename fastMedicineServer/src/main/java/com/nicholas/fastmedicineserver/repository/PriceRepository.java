package com.nicholas.fastmedicineserver.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.nicholas.fastmedicineserver.entity.Price;
import com.nicholas.fastmedicineserver.entity.ProductDetail;

public interface PriceRepository extends JpaRepository<Price, Integer>
{
	@Query(nativeQuery = true, value ="SELECT * from t_price WHERE  pharmacy_id=?1 and category_id=?2")
	List<Price> getList(Integer p,Integer c);
	
	@Query(nativeQuery = true, value ="SELECT * from t_price WHERE  pharmacy_id=?1 and product_id=?2")
	Price getDetail(Integer ph,Integer pr);
}
