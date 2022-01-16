package com.hvo.tbclibrary.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.hvo.tbclibrary.entity.Items;
import com.hvo.tbclibrary.service.ItemsService;

@RestController
@RequestMapping("/api")
public class ItemsController {
	
	@Autowired
	private ItemsService itemsService;
	
	@GetMapping("/items")
	public List<Items> getAllItems(@RequestParam(value="category", required=false) String category) {
		if(category != null) {
			return itemsService.getItemsByCategory(category);
		}
		return itemsService.getAllItems();
	}
	
	@GetMapping("/items/{itemId}")
	public Items getItem(@PathVariable int itemId) {
		return itemsService.getItem(itemId);
	}
	
	@PostMapping("/items")
	public void addItem(@RequestBody Items item) {
		item.setId(0);
		itemsService.save(item);
	}
	
	@PutMapping("/items") 
	public void updateItem(@RequestBody Items item) {
		itemsService.save(item);
	}
	
	@DeleteMapping("/items/{itemId}")
	public void deleteItem(@PathVariable int itemId) {
		itemsService.deleteItemById(itemId);
	}
}
