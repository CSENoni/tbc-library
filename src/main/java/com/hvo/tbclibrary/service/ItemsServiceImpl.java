package com.hvo.tbclibrary.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hvo.tbclibrary.dao.ItemsRepository;
import com.hvo.tbclibrary.entity.Items;

@Service
public class ItemsServiceImpl implements ItemsService {

	@Autowired
	private ItemsRepository itemsRepository;
	
	@Override
	public List<Items> getAllItems() {
		return itemsRepository.findAll();
	}

	@Override
	public List<Items> getItemsByCategory(String category) {
		return itemsRepository.findItemsByCategory(category);
	}

}
