package com.capgemini.junit;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CalculatorTest {
	
	private Calculator calculator = null ;

	@BeforeEach
	public void createObject() {
		calculator = new Calculator();
	}
	@Test
	public void testAdd() {
		int i = calculator.add(-10, 5);
		assertEquals(-5, i);

	}// End of testAdd()

	@Test
	public void testSub() {
		int i = calculator.sub(10, 5);
		assertEquals(5, i);

	}// End of testSub()

	@Test
	public void testDiv() {
		int i = calculator.div(10, 5);
		assertEquals(2, i);

	}// End of testDiv()

	@Test
	public void testDivByZero() {
		assertThrows(ArithmeticException.class, () -> calculator.div(10, 0));

	}// End of testDivByZero()
}
