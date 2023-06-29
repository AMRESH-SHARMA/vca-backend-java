//package com.vca.service;
//
//import java.util.List;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.*;
//import org.springframework.stereotype.Service;
//
//import com.vca.entity.Manufacturer;
//import com.vca.exception.ResourceNotFoundException;
//import com.vca.repository.ManufacturerRepository;
//
//@Service
//public class SubCategoryServiceImpl implements SubCategoryService {
//
//	@Autowired
//	ManufacturerRepository repository;
//
//	@Override
//	public ResponseEntity<List<Manufacturer>> getAllByCategoryId(Long categoryId) {
//
//		if (!repository.existsById(categoryId)) {
//			throw new ResourceNotFoundException("Not found Tutorial with id = " + categoryId);
//		}
//
//		List<Manufacturer> subCategories = repository.findByCategoryId(categoryId);
//		return new ResponseEntity<List<Manufacturer>>(subCategories, HttpStatus.OK);
//	}
//
//}
