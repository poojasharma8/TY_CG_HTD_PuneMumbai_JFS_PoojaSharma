package com.capgemini.collectionframework.list;

import java.util.ArrayList;
import java.util.Iterator;

public class TestF {

	public static void main(String[] args) {

		ArrayList a1 = new ArrayList();
		a1.add("priya");
		a1.add(2);
		a1.add('F');
		a1.add(5.6);
		
		Iterator i = a1.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
	}

}
