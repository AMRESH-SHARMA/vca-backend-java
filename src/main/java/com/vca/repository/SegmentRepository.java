package com.vca.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vca.entity.Segment;

public interface SegmentRepository extends JpaRepository<Segment, Long> {

}
