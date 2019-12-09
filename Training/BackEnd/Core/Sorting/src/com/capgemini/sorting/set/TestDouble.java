package com.capgemini.sorting.set;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class TestDouble {

	public static void main(String[] args) {

		//to get ordered output

		LinkedHashSet<Double> hs = new LinkedHashSet();
		hs.add(1.23);
		hs.add(2.54);
		hs.add(2.96);
		hs.add(3.07);

		System.out.println("***Using for each***");
		for(Object o : hs) {
			System.out.println(o);
		}

		System.out.println("***Using Iterator***");
		Iterator<Double> it =hs.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}


}