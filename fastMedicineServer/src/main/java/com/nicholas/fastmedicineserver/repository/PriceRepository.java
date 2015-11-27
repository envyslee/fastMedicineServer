package com.nicholas.fastmedicineserver.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.nicholas.fastmedicineserver.entity.Price;
import com.nicholas.fastmedicineserver.entity.ProductDetail;

public interface PriceRepository extends JpaRepository<Price, Integer>
{
	@Query(nativeQuery = true, value ="SELECT * from t_price WHERE  pharmacy_id=?1 and category_id=?2 LIMIT ?3,15")
	List<Price> getList(Integer p,Integer c,Integer i);
	
	@Query(nativeQuery = true, value ="SELECT * from t_price WHERE  pharmacy_id=?1 and product_id=?2")
	Price getDetail(Integer ph,Integer pr);
	
	List<Price> findByPharmacyId(Integer id); 
	
	@Query(nativeQuery=true,value="SELECT * from t_price WHERE  pharmacy_id=?1 and special_price=1 LIMIT ?2,15")
	List<Price> findSepcPrice(Integer ph,Integer row);
	
	@Query(nativeQuery=true,value="SELECT * from t_price WHERE  pharmacy_id=?1 and shake_status=1")
	List<Price> findShake(Integer ph);
	
}
