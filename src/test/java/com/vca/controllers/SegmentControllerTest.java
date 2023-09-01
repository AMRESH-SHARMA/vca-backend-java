package com.vca.controllers;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import com.vca.entity.Segment;
import com.vca.services.SegmentServiceImpl;

import response.ResponseHandler;

@ExtendWith(MockitoExtension.class)
class SegmentControllerTest {

	@Mock
	SegmentServiceImpl service;
	
	@InjectMocks
	SegmentController controller;
	
	
	@Test
	void testGetAllSegments() {
		
		Segment segment1 = new Segment("Cope");
		Segment segment2 = new Segment("Dope");
		Segment segment3 = new Segment("Shope");
		
		List<Segment> segment = new ArrayList<Segment>();
		List<Segment> segmentW = new ArrayList<Segment>();
		segment.add(segment1);
		segment.add(segment2);
		ResponseEntity<Object> wrongresponse = ResponseHandler.apiResponse("Segments retrieved successfully", HttpStatus.OK, segmentW);
		
		segmentW.add(segment3);
		
		ResponseEntity<Object> response = ResponseHandler.apiResponse("Segments retrieved successfully", HttpStatus.OK, segment);
		
		when(service.getAllSegments()).thenReturn(segment);

		ResponseEntity<Object> result = controller.getAllSegments();
			
		System.out.println("<---------------- " + result.getBody().toString() + " ----- " + wrongresponse.getBody().toString());
		
        //assertEquals(result.getBody(), response.getBody());
		assertEquals(result.getBody(), response.getBody());
		
	}

}
