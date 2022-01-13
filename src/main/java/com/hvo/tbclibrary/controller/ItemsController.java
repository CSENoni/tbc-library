package com.hvo.tbclibrary.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hvo.tbclibrary.entity.Items;
import com.hvo.tbclibrary.service.ItemsService;

@RestController
@RequestMapping("/api")
public class ItemsController {
	
	@Autowired
	private ItemsService itemsService;
	
	@GetMapping("/items")
	public List<Items> getAllItems() {
		return itemsService.getAllItems();
	}
}
