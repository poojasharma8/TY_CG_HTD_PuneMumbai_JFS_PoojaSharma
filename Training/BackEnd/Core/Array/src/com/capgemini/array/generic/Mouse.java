package com.capgemini.array.generic;

public class Mouse {

	void walk(double [] a) {

		for (double i : a) {
			System.out.println("double values are:" +i);
		}

	}

	void run(int [] b) {
		for (int i = 0 ; i< b.length ; i++) {
			System.out.println("integer values are: " +b[i]);
		}

	}
}