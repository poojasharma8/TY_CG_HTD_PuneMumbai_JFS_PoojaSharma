package com.capgemini.array.generic;

public class TestH {

	public static void main(String[] args) {

		String[] m = {"Pooja " , "Sharma"} ;
		receive (m);

	}

	static void receive(String[] a) {

		for (String s : a) { //for-each loop

			System.out.print(s);
		}

	}

}

