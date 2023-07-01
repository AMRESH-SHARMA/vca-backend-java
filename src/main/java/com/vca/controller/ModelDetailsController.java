package com.vca.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vca.entity.ModelDetails;
import com.vca.exception.ResourceNotFoundException;
import com.vca.repository.ModelDetailsRepository;

@CrossOrigin(origins = "*")
@RestController
public class ModelDetailsController {

	@Autowired
	ModelDetailsRepository repository;

	@GetMapping("/md")
	public ResponseEntity<List<ModelDetails>> getAllModelDetails() {
		List<ModelDetails> modelDetails = repository.findAll();

		if (modelDetails.isEmpty()) {
			throw new ResourceNotFoundException("No data found");
		}

		return new ResponseEntity<>(modelDetails, HttpStatus.OK);
	}

}
