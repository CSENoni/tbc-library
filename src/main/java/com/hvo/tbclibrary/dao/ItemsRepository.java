package com.hvo.tbclibrary.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.hvo.tbclibrary.entity.Items;

public interface ItemsRepository extends JpaRepository<Items, Integer> {
	
	@Query("select i from Items i where i.categories=?1")
	List<Items> findItemsByCategory(String category);
}
