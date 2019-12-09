
package com.capgemini.bean; //SingleTon 

public class Van {

	private static final Van ref = new Van(); //always outside the method
	private Van( ) {
	}
	
	public static Van getVan() { 
		return ref;
	}
}
