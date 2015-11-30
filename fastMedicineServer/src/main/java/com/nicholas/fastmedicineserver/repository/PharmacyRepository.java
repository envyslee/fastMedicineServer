package com.nicholas.fastmedicineserver.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nicholas.fastmedicineserver.entity.Pharmacy;

public interface PharmacyRepository extends JpaRepository<Pharmacy, Integer>
{
	Pharmacy findById(Integer id);
	
}
