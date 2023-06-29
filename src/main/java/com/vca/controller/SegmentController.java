package com.vca.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vca.entity.Segment;
import com.vca.exception.ResourceNotFoundException;
import com.vca.repository.SegmentRepository;

@CrossOrigin(origins = "http://localhost:8081")
@RestController
@RequestMapping("/api")
public class SegmentController {

	@Autowired
	SegmentRepository repository;

	@GetMapping("/s")
	public ResponseEntity<List<Segment>> getAllSegments() {
		List<Segment> segments = repository.findAll();
		
		if (segments.isEmpty()) {
			 throw new ResourceNotFoundException("No data found");
		}
		
		return new ResponseEntity<>(segments, HttpStatus.OK);
	}
}