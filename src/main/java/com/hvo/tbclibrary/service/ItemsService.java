package com.hvo.tbclibrary.service;

import java.util.List;

import com.hvo.tbclibrary.entity.Items;

public interface ItemsService {
	public List<Items> getAllItems();
	public List<Items> getItemsByCategory(String category);
	public Items getItem(int id);
	public void save(Items item);
}
