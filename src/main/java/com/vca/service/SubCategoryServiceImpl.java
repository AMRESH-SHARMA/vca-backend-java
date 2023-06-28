package com.vca.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.*;
import org.springframework.stereotype.Service;

import com.vca.entity.SubCategory;
import com.vca.exception.ResourceNotFoundException;
import com.vca.repository.SubCategoryRepository;

@Service
public class SubCategoryServiceImpl implements SubCategoryService {

	@Autowired
	SubCategoryRepository repository;

	@Override
	public ResponseEntity<List<SubCategory>> getAllByCategoryId(Long categoryId) {

		if (!repository.existsById(categoryId)) {
			throw new ResourceNotFoundException("Not found Tutorial with id = " + categoryId);
		}

		List<SubCategory> subCategories = repository.findByCategoryId(categoryId);
		return new ResponseEntity<List<SubCategory>>(subCategories, HttpStatus.OK);
	}

}
