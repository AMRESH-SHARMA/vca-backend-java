package com.vca.service;

import java.util.List;

import org.springframework.http.ResponseEntity;

import com.vca.entity.Category;

public interface CategoryService {

	ResponseEntity<List<Category>> getAll();

}
