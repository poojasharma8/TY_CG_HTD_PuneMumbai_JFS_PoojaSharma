package com.capgemini.collectionframework.list;

import java.util.ArrayList;

public class TestG {

	public static void main(String[] args) {


		ArrayList a1 = new ArrayList();
		a1.add("priya");
		a1.add(2);
		a1.add('F');
		a1.add(5.6);

		for(Object o : a1) {
			System.out.println(o);
		}
	}

}
