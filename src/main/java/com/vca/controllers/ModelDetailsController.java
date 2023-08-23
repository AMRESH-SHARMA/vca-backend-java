package com.vca.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vca.repositories.ModelDetailsRepository;

import response.ResponseHandler;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/api")
public class ModelDetailsController {

	@Autowired
	ModelDetailsRepository repository;

	@GetMapping("/md")
	public ResponseEntity<Object> getModelDetails() {
//		List<ModelDetails> modelDetails = repository.findAll();
//
//		if (modelDetails.isEmpty()) {
//			throw new ResourceNotFoundException("No data found");
//		}

		try {
			return ResponseHandler.apiResponse(null, null, null);
		} catch (Exception e) {
			return ResponseHandler.apiResponse(null, null, null);
		}
	}

}
