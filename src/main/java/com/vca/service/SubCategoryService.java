package com.vca.service;

import java.util.List;

import org.springframework.http.ResponseEntity;

import com.vca.entity.SubCategory;

public interface SubCategoryService {

	ResponseEntity<List<SubCategory>> getAllByCategoryId(Long Id);

}
