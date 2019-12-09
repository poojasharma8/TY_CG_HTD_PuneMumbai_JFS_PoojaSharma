package com.capgemini.exception;

public class PVR {

	void confirm () {
		System.out.println("Confirm started");
		try {
			System.out.println(10/0 );
			System.out.println("confirmed");
		}
		catch(ArithmeticException e) {
		System.out.println("Exception in confirm");
		throw e;
		}
		finally {
			System.out.println("Confirm ended");
		}
		
	}
}
