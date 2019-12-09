package com.capgemini.sorting.set;

import java.util.HashSet;
import java.util.Iterator;

public class TestH {

	public static void main(String[] args) {
		
		//get unordered output
		HashSet hs = new HashSet();
		hs.add("Meena");
		hs.add("Rekha");
		hs.add("Jaya");
		hs.add("Sushma");
		
		System.out.println("***Using for each***");
		for(Object o : hs) {
			System.out.println(o);
		}
		
		System.out.println("***Using Iterator***");
		Iterator<String> it =hs.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		
		
 		
		
	}

}
