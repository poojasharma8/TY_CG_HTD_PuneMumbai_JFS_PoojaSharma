package com.capgemini.junit;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class SumTest {

    @Test
	public void testSum() {
		Sum s = new Sum();
		int i=s.add(10,5);
		assertEquals(20, i);
	
	}
	
}
