package com.vca.repositories;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.vca.entity.Segment;

@SpringBootTest
class SegmentRepositoryTest {
	
	@Autowired
	private SegmentRepository repository;
	

	@Test
	void testExistsById() {
		
		Segment s = new Segment();
		s.setId(1);
		s.setSegName("Cope");
		repository.save(s);
		boolean result=repository.existsById(s.getId());
		assertThat(result).isTrue();
	}

}
