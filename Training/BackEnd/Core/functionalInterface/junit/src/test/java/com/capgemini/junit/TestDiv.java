package com.capgemini.junit;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

public class TestDiv {

	@Test
	public void testDiv() {
		Calculator cal = new Calculator() ;
		int i = cal.div(10, 5);
		assertEquals(2, i);
		
	}//End of testDiv()
	
	@Test
	public void testDivByZero() {
	Calculator cal = new Calculator();
	assertThrows(ArithmeticException.class, ()->cal.div(10, 0));
	
	}//End of testDivByZero()
}
