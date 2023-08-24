package com.vca.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.vca.entity.AlternateComponent;
import com.vca.entity.Vehicle;


@Repository
public interface VehicleRepository extends JpaRepository<Vehicle, Integer> {

	
	@Query(value = "Select * from Vehicle where mod_id = :id", nativeQuery = true)
	List<Vehicle> findAllByModelId(@Param("id") int id);

	
}
