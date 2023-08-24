package com.vca.controllers;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.vca.entity.Model;
import com.vca.entity.Segment;
import com.vca.services.ModelService;

import response.ResponseHandler;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/api")
public class ModelController {

	@Autowired
	ModelService modelService;

	// This is Paginated API
	@GetMapping("/models")
	public ResponseEntity<Object> getAllModels(@RequestParam(defaultValue = "0") int page,
			@RequestParam(defaultValue = "10") int size) {

		try {

			Pageable pageable = PageRequest.of(page, size);
			Page<Model> modelsPage = modelService.getAllModels(pageable);
			List<Model> data = modelsPage.getContent();

			Map<String, Object> response = new HashMap<>();
			response.put("models", data);
			response.put("currentPage", modelsPage.getNumber());
			response.put("totalItems", modelsPage.getTotalElements());
			response.put("totalPages", modelsPage.getTotalPages());
			return ResponseHandler.apiResponse("Models retrieved successfully", HttpStatus.OK, response);
		} catch (Exception e) {
			return ResponseHandler.apiResponse(e.getMessage(), HttpStatus.BAD_REQUEST, null);
		}
	}

	// This is Paginated API
	@GetMapping("/models/{segId}/{manuId}")
	public ResponseEntity<Object> getAllModelsByManuIdAndSegId(@PathVariable int segId, @PathVariable int manuId,
			@RequestParam(defaultValue = "0") int page, @RequestParam(defaultValue = "1") int size) {

		try {

			Pageable pageable = PageRequest.of(page, size);
			Page<Model> modelsPage = modelService.getAllModelsByManuIdAndSegId(manuId, segId, pageable);
			List<Model> data = modelsPage.getContent();

			Map<String, Object> response = new HashMap<>();
			response.put("models", data);
			response.put("currentPage", modelsPage.getNumber());
			response.put("totalItems", modelsPage.getTotalElements());
			response.put("totalPages", modelsPage.getTotalPages());
			return ResponseHandler.apiResponse("Models retrieved successfully", HttpStatus.OK, response);
		} catch (Exception e) {
			return ResponseHandler.apiResponse(e.getMessage(), HttpStatus.BAD_REQUEST, null);
		}
	}
	
	@GetMapping("/models/{segId}")
	public List<Model> getModelBySegId(@PathVariable int segId, @RequestParam(defaultValue = "0") int page, @RequestParam(defaultValue = "1") int size){
		
		List<Model> modelsPage = modelService.getModelsBySegId(segId);
		//Map<String, List<Model>> response = new HashMap<>();
		//response.put("models", modelsPage);
		//System.out.println("inside Controller --> "+ response.get("models"));
		
		System.out.println(modelsPage.get(0).getSegment());
		
		return modelsPage;
		
		//return modelService.getModelsBySegId(segId);
		
	}

}
