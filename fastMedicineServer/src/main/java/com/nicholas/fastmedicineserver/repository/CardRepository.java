package com.nicholas.fastmedicineserver.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nicholas.fastmedicineserver.entity.Card;

public interface CardRepository extends JpaRepository<Card, Integer> {
	Card findById(Integer id);
}
