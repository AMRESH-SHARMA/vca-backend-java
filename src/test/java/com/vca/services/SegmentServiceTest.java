package com.vca.services;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.verify;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.boot.test.context.SpringBootTest;

import com.vca.entity.Segment;
import com.vca.repositories.SegmentRepository;

@SpringBootTest
@ExtendWith(MockitoExtension.class)
class SegmentServiceTest {
	
	@Mock
	private SegmentRepository repository;

	@InjectMocks
	private SegmentServiceImpl service;

	@Test
	void testGetAllSegments() {
		//System.out.println("Service is\t"+service.getClass().getName());
		service.getAllSegments();
		//System.out.println(repository.findAll());
		verify(repository).findAll();
		//System.out.println("op is "+product.getName());
		/*
		 * System.out.println("productManager is\t"+productManager.getClass().getName())
		 * ; productManager.getProduct(1); verify(dao).getProduct(1);
		 */


	}

}
