package com.vca.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vca.entity.Vehicle;
import com.vca.repositories.VehicleRepository;

@Service
public class VehicleServiceImpl implements VehicleService {

	@Autowired
	VehicleRepository vehicleRepository;

	@Override
	public Vehicle getVehicleByID(long id) {
		return vehicleRepository.findById(id).get();
	}

	
	
}
