package com.capgemini.junit;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class SumTest1 {

	 @Test
		public void testSum() {
			Sum s = new Sum();
			int i=s.add1(10,5,5);
			assertEquals(20, i);
			
		}
}
