package com.nicholas.fastmedicineserver.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nicholas.fastmedicineserver.entity.Feedback;

public interface FeedbackRepository extends JpaRepository<Feedback, Integer>
{

}
