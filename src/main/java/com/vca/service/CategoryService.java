package com.vca.service;

import java.util.List;

import org.springframework.http.ResponseEntity;

import com.vca.entity.Segment;

public interface CategoryService {

	ResponseEntity<List<Segment>> getAll();

}
