package com.capgemini.collectionframework.list;

import java.util.Iterator;
import java.util.Vector;

public class VectorExample {

	public static void main(String[] args) {

		Vector<Character> v1 = new Vector<Character>();
		v1.add('p');
		v1.add('q');
		v1.add('r');
		
		System.out.println("Using for-each");
		for (Character c : v1 ) {
			System.out.println(c);
		}
		
		System.out.println("Using for");
		for(int i = 0 ; i< v1.size(); i++) {
			Character d = v1.get(i);
			System.out.println(d);
		}
		
		System.out.println("Using Iterator");
		
		Iterator<Character> it = v1.iterator();
		while(it.hasNext()) {
			Character r =it.next();
			System.out.println(r);
		
		}
	}
}
