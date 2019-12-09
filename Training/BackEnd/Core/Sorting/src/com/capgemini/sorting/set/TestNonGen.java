package com.capgemini.sorting.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class TestNonGen {

	public static void main(String[] args) {

//to get ordered output
		
		LinkedHashSet hs = new LinkedHashSet();
		hs.add(15);
		hs.add('A');
		hs.add(2.4);
		hs.add("Deepa");

		
		System.out.println("***Using for each***");
		for(Object o : hs) {
			System.out.println(o);
		}
		
		System.out.println("***Using Iterator***");
		Iterator it =hs.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}

}
