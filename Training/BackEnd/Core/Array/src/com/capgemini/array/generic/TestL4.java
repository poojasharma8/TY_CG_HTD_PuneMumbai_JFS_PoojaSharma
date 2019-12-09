package com.capgemini.array.generic;

interface GM { 
	 
 void gm();
 
	}

public class TestL4 {

	public static void main(String[] args) {
		
		GM m = () -> System.out.println("Good morning") ;
		
		m.gm();
	}

}
