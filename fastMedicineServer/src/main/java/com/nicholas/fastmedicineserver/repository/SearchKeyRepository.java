package com.nicholas.fastmedicineserver.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.nicholas.fastmedicineserver.entity.SearchKey;

public interface SearchKeyRepository extends JpaRepository<SearchKey, Integer>
{
	@Query(nativeQuery = true, value="SELECT * FROM t_search_key GROUP BY keyword ORDER BY COUNT(keyword) DESC LIMIT 9")
	List<SearchKey> findTopKeys();
}
