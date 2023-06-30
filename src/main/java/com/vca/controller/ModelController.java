package com.vca.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vca.exception.ResourceNotFoundException;
import com.vca.repository.ModelRepository;

@CrossOrigin(origins = "http://localhost:8081")
@RestController
@RequestMapping("/api")
public class ModelController {

	@Autowired
	ModelRepository repository;

	@GetMapping("/m/{segId}/{mfgId}")
	public ResponseEntity<List<Map<String, Object>>> getAllBySegIdMfgId(@PathVariable(value = "segId") Long segId,
	        @PathVariable(value = "mfgId") Long mfgId) {
	    List<Map<String, Object>> models = repository.findModelBySeg_IdAndMfg_Id(segId, mfgId);

	    if (models.isEmpty()) {
	        throw new ResourceNotFoundException("No data found");
	    }

	    return new ResponseEntity<>(models, HttpStatus.OK);
	}


}
