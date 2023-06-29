package com.vca.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vca.entity.Manufacturer;
import com.vca.repository.ManufacturerRepository;

@CrossOrigin(origins = "http://localhost:8081")
@RestController
@RequestMapping("/api")
public class ManufacturerController {

	@Autowired
	ManufacturerRepository repository;

	@GetMapping("/m/{seg_Id}")
	public List<Manufacturer> getAllManufacturerBySegId(@PathVariable(value = "seg_Id") Long seg_Id) {
		return repository.findBySegment_id(seg_Id);
	}

}
