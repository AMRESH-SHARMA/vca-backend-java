package com.vca.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vca.entity.Vehicle;
import com.vca.services.VehicleService;

import response.ResponseHandler;


@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/api")
public class VehicleController {
	
	@Autowired
	VehicleService vehicleService;
	
	
//	@GetMapping(value = "/vehicles")
//	public List<Vehicle> getVehicles(){
//		return service.getAllVehicles();
//	}
	
	@GetMapping(value = "/vehicles/{id}")
	public ResponseEntity<Object> getVehicleByID(@PathVariable long id) {

		try {
			 Vehicle data = vehicleService.getVehicleByID(id);
			return ResponseHandler.apiResponse("Vehicle data", HttpStatus.OK, data);
		} catch (Exception e) {
			return ResponseHandler.apiResponse(e.getMessage(), HttpStatus.BAD_REQUEST, null);
		}
	}
	
}
