package com.capgemini.junit;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class TestAdd {
	
	@Test
	public void testAdd() {
		Calculator cal = new Calculator() ;
		int i = cal.add(-10, 5);
		assertEquals(-5, i);
		
	}//End of testAdd()
}
