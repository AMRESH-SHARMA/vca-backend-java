package com.vca.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vca.entity.Segment;
import com.vca.repository.SegmentRepository;

@CrossOrigin(origins = "http://localhost:8081")
@RestController
@RequestMapping("/api")
public class SegmentController {

	@Autowired
	SegmentRepository repository;

	@GetMapping("/s")
	public List<Segment> getAllSegments() {
		return repository.findAll();
	}

}
