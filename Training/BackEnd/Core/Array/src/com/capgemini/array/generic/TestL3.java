package com.capgemini.array.generic;

interface Circle {
	 
 double circlearea(double a);
 
}

public class TestL3 {
	
	public static void main(String[] args) {
		Circle f = a ->3.14* a*a ;
		double j = f.circlearea(2.5);
		System.out.println("Area is "+j);



	}

}
