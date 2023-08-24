package com.vca.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vca.entity.Vehicle;
import com.vca.services.VehicleService;


@RestController
@CrossOrigin("*")
@RequestMapping("/api")
public class VehicleController {
	
	@Autowired
	VehicleService service;
	
	@PostMapping(value = "addVehicle")
	public void addVehicle(@RequestBody Vehicle master) {
		service.addVehicle(master);
	}
	
	@GetMapping(value = "vehicles")
	public List<Vehicle> getVehicles(){
		return service.getAllVehicles();
	}
	
	@GetMapping(value = "vehicles/{id}")
	public List<Vehicle> getVehicleByID( @PathVariable int id) {
		return service.getVehicleByModelId(id);
	}
	
	@PutMapping(value = "vehicles/{id}")
	public void updateVehicle(@PathVariable int id, @RequestBody Vehicle master) {
		service.updateVehicle(id, master);
	}
	
	@DeleteMapping(value = "vehicles/{id}")
	public void removeVehicle(@PathVariable int id) {
		service.removeVehicle(id);
	}
	
	
	
}
