package com.vca.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vca.entity.Manufacturer;

public interface ManufacturerRepository extends JpaRepository<Manufacturer, Integer> {

	List<Manufacturer> findBySegmentId(int segId);

}
