package com.capgemini.array.generic;

interface Square {

	int sqrarea(int a);

}

public class TestL1 {
	public static void main(String[] args) {
		Square f = a -> a * a;
		int j = f.sqrarea(20);
		System.out.println("Area is "+j);



	}

}
