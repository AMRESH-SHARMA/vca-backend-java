package com.vca.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;

import com.vca.service.SubCategoryService;

@CrossOrigin(origins = "http://localhost:8081")
@RestController
@RequestMapping("/api")
public class SubCategoryController {

	@Autowired
	SubCategoryService service;

	@GetMapping("/s/{categoryId}/p")
	public ResponseEntity<?> getAllSubCategoriesByCategoryId(@PathVariable(value = "categoryId") Long categoryId) {
		return service.getAllByCategoryId(categoryId);
	}

}
