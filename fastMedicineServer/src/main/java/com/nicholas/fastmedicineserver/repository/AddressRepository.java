package com.nicholas.fastmedicineserver.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nicholas.fastmedicineserver.entity.Address;

public interface AddressRepository extends JpaRepository<Address, Integer>
{
	List<Address> findByUserId(Integer userId);
}
