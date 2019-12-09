package com.capgemini.array.generic;

public class TestG {

	public static void main(String[] args) {

		int[] m = {10, 20 , 30 , 40} ;
		receive (m);
		
	}
	
	static void receive(int[] a) {
		
		for (int i : a) { //for-each loop

			System.out.println(i);
		}
		
	}

}
