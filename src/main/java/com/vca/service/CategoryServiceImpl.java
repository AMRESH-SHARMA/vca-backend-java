//package com.vca.service;
//
//import java.util.List;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.*;
//import org.springframework.stereotype.Service;
//
//import com.vca.entity.Segment;
//import com.vca.repository.CategoryRepository;
//
//@Service
//public class CategoryServiceImpl implements CategoryService {
//
//	@Autowired
//	CategoryRepository categoryRepository;
//
//	@Override
//	public ResponseEntity<List<Segment>> getAll() {
//
//		List<Segment> categories = categoryRepository.findAll();
//
//		if (categories.isEmpty()) {
//			return new ResponseEntity<>(HttpStatus.NO_CONTENT);
//		}
//
//		return new ResponseEntity<List<Segment>>(categories, HttpStatus.OK);
//	}
//
//}
