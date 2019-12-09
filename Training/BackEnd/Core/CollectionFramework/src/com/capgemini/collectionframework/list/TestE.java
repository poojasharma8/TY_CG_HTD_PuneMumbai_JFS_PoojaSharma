package com.capgemini.collectionframework.list;

import java.util.ArrayList;

public class TestE {

	public static void main(String[] args) {
		
		ArrayList a1 = new ArrayList();
		a1.add(24);
		a1.add("Payal");
		a1.add('F');
		a1.add(5.5);
		
		System.out.println(a1); //toString method overridden
	}

}
