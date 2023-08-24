package com.vca.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vca.entity.Vehicle;
import com.vca.repositories.VehicleRepository;

@Service
public class VehicleServiceImpl implements VehicleService {

	@Autowired
	VehicleRepository repository;
	
	
	@Override
	public void addVehicle(Vehicle master) {
		
		repository.save(master);
		
	}

	@Override
	public List<Vehicle> getAllVehicles() {
		return repository.findAll();
		
	}

	@Override
	public Optional<Vehicle> getVehiclesByID(int id) {
		
		return repository.findById(id);
		
	}

	@Override
	public void updateVehicle(int id, Vehicle master) {
		System.out.println("<<<---- Pending --->>>");
		//repository.update(vehicle.getCompType(),vehicle.getIsConfigurable(),id);
		
	}

	@Override
	public void removeVehicle(int id) {

		repository.deleteById(id);
		
	}

	@Override
	public List<Vehicle> getVehicleByModelId(int id) {
		
		return repository.findAllByModelId(id);
	}

	
	
}
