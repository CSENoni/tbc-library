package com.hvo.tbclibrary.service;

import java.util.List;
import java.util.Optional;

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

	@Override
	public Items getItem(int id) {
		Optional<Items> result = itemsRepository.findById(id);
		
		if(result.isPresent()) {
			return result.get();
		}
		
		throw new RuntimeException("Cannot find item id: " + id);
	}

	@Override
	public void save(Items item) {
		itemsRepository.save(item);
	}

}
