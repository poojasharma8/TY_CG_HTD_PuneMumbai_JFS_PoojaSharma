package com.capgemini.exception;

public class paytm {

	void book() {
		System.out.println("Book Started");
		
		IRCTC i = new IRCTC();
	
		i.confirm();
	
		System.out.println("Book Ended");
		
	}
}
