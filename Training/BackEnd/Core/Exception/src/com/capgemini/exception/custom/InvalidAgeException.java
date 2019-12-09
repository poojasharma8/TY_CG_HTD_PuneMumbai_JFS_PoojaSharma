package com.capgemini.exception.custom;

public class InvalidAgeException extends RuntimeException {

	String msg = "Invalid Age to proceed";
	
	@Override
	public String getMessage() {
		return msg;
	}
	
}
