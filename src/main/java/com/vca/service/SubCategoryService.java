package com.vca.service;

import java.util.List;

import org.springframework.http.ResponseEntity;

import com.vca.entity.Manufacturer;

public interface SubCategoryService {

	ResponseEntity<List<Manufacturer>> getAllByCategoryId(Long Id);

}
