package com.vca.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.vca.entity.Vehicle;


public interface VehicleRepository extends JpaRepository<Vehicle, Long> {
	
}
