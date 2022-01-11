package com.hvo.tbclibrary.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hvo.tbclibrary.entity.Items;

@RestController
@RequestMapping("/api")
public class ItemsController {
	
	@GetMapping("/items")
	public List<Items> getAllItems() {
		return new ArrayList<Items>();
	}
}
