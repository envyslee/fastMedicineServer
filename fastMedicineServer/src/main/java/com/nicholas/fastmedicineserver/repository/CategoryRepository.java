package com.nicholas.fastmedicineserver.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.nicholas.fastmedicineserver.entity.ProductCategory;


public interface CategoryRepository extends JpaRepository<ProductCategory, Long>
{
	//List<ProductCategory> categories=findAll();
}
