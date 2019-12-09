package com.capgemini.exception;

public class IRCTC {

	void confirm () {
		System.out.println("Confirm started");
		
		try {
		System.out.println(10/0);
		}
		 catch(ArithmeticException e) {
			 System.out.println("Dont divide by 0");
		 }
		
		System.out.println("Confirm ended");
	}
}
