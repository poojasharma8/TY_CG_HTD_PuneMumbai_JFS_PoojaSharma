package com.capgemini.exception;

public class BMS {

	public static void main(String[] args) {
		System.out.println("Main started");

		PVR v = new PVR();
	try {
		v.confirm();
	}
	 
	catch(ArithmeticException e) {
		System.out.println("Exception in confirm");

	}
	
		System.out.println("Main Ended");
		
	}

}
