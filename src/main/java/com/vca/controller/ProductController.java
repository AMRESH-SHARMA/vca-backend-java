package com.vca.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vca.repository.ProductRepository;

@CrossOrigin(origins = "http://localhost:8081")
@RestController
@RequestMapping("/api")
public class ProductController {

	@Autowired
	ProductRepository repository;

	@GetMapping("/p/{categoryId}/{subcategoryId}")
	public List<?> getAllByCategoryIdSubCategoryId(@PathVariable(value = "categoryId") Long categoryId,
			@PathVariable(value = "subcategoryId") Long subcategoryId) {
		return repository.findByCategory_IdAndSubcategory_Id(categoryId, subcategoryId);
	}

}
