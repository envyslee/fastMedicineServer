package com.nicholas.fastmedicineserver.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.nicholas.fastmedicineserver.entity.Car;

public interface CarRepository extends JpaRepository<Car, Integer> {
	
	
	@Query(nativeQuery=true,value="SELECT * FROM t_car WHERE user_id=?1 and is_abandoned=0")
	List<Car> findCarList(Integer userId);

}
