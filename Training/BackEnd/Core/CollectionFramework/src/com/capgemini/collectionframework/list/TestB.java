package com.capgemini.collectionframework.list;

import java.util.ArrayList;
import java.util.Iterator;

public class TestB {

	@SuppressWarnings({ "rawtypes", "unchecked" }) // warning
	public static void main(String[] args) {

		ArrayList a1 = new ArrayList();
		a1.add(24);
		a1.add("Payal");
		a1.add('F');
		a1.add(5.5);

		Iterator it = a1.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}

	}

}
