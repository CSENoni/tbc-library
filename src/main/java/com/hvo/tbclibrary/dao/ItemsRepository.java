package com.hvo.tbclibrary.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hvo.tbclibrary.entity.Items;

public interface ItemsRepository extends JpaRepository<Items, Integer> {

}
