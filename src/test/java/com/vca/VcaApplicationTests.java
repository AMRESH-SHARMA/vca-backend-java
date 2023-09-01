package com.vca;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class VcaApplicationTests {

	private SegmentRepoTest ss = new SegmentRepoTest();
	
	@Test
	void contextLoads() {
	}
	
	@Test
	void testSum()
	{
		int expectedResult=22;
		int actualResult=ss.doSum(12,3,7);
		
		assertThat(actualResult).isEqualTo(expectedResult);
		
	}


}
