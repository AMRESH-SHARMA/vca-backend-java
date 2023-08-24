package com.vca.services;

import java.util.List;
import java.util.Optional;

import com.vca.entity.Vehicle;

public interface VehicleService {

	void addVehicle(Vehicle master);

	List<Vehicle> getAllVehicles();

	Optional<Vehicle> getVehiclesByID(int id);

	void updateVehicle(int id, Vehicle master);

	void removeVehicle(int id);
	
	List<Vehicle> getVehicleByModelId(int id);


}
