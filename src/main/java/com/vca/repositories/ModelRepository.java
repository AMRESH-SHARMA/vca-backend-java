package com.vca.repositories;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import com.vca.entity.Model;

public interface ModelRepository extends JpaRepository<Model, Integer> {

	Page<Model> findByManufacturerIdAndSegmentId(int manuId, int segId, Pageable pageable);
	
//	query method findAllByOrderByCreatedAtDesc
//	specifies that you want to retrieve all models and order them by the createdAt field in descending order (DESC).
    Page<Model> findAllByOrderByCreatedAtDesc(Pageable pageable);

	List<Model> findBySegmentId(int segId);
}
