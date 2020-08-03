package com.openclassrooms;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestAdd {

	@Test
	public void testAddMe() {
		HelloWorld addme = new HelloWorld();
		int sum = addme.addMe(2,3);
		assertEquals(5,sum);
	}
	
	

}
