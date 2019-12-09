package com.capgemini.sorting.set;

import java.util.HashSet;
import java.util.TreeSet;

public class TestN_Tree {

	public static void main(String[] args) {

		TreeSet ts = new TreeSet();
		ts.add(15);
		ts.add(20);
		ts.add(25);
		ts.add(10);
		//ts.add(null); can't load
		
		System.out.println("***Using for-each***");
		for(Object o : ts) {
			System.out.println(o);
		}
	}

}
