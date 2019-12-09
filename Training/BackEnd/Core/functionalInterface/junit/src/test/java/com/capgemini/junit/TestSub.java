package com.capgemini.junit;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class TestSub {

	@Test
	public void testSub() {
		Calculator cal = new Calculator() ;
		int i = cal.sub(10, 5);
		assertEquals(5, i);
		
	}//End of testSub()
}
