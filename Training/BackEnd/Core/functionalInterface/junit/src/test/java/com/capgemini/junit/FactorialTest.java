package com.capgemini.junit;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class FactorialTest {

	@Test
	public void testFact() {
		Factorial f = new Factorial();
		int res = f.fact(5);
		assertEquals(120, res);
	}// End of testFact()
	
	@Test
	public void testFactForZero() {
		Factorial f = new Factorial();
		int res = f.fact(0);
		assertEquals(1, res);
	}//End of testFactForZero()

	@Test
	public void testFactForNegative() {
		Factorial f = new Factorial();
		int res = f.fact(-6);
		assertEquals(1, res);
	}//End of testFactForNegative()
}
