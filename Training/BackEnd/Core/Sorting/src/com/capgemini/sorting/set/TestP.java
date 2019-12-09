package com.capgemini.sorting.set;

import java.util.HashSet;

public class TestP {

	public static void main(String[] args) {

		HashSet e = new HashSet();
		e.add(1.23);
		e.add("pooja");
		e.add(2);
		e.add('A');
		e.add('A');
		e.add(null);
		

		System.out.println("***Using for each***");
		for(Object o : e) {
			System.out.println(o);
		}
		
	}

}
