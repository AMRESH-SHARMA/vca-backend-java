package com.vca.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vca.entity.Manufacturer;

public interface ManufacturerRepository extends JpaRepository<Manufacturer, Long> {

	List<Manufacturer> findBySegment_id(Long seg_Id);

}
