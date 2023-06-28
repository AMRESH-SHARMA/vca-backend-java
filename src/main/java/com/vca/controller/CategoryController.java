package com.vca.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.vca.service.CategoryService;

@CrossOrigin(origins = "http://localhost:8081")
@RestController
@RequestMapping("/api")
public class CategoryController {

	@Autowired
	CategoryService service;

	@GetMapping("/c")
	public ResponseEntity<?> getAllCategories() {
		return service.getAll();
	}

}
