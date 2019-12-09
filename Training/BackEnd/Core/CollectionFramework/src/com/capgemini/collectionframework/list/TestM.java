package com.capgemini.collectionframework.list;

import java.util.Iterator;
import java.util.LinkedList;

public class TestM {

	public static void main(String[] args) {

		LinkedList<String> li = new LinkedList<String>();
		li.add("hello");
		li.add("hi");
		li.add("GM");
		
		System.out.println("Using for Each");
		for (String s : li) {
			System.out.println(s);
			
		System.out.println("Using For loop");
		for(int i = 0 ; i<li.size() ;i++) {
			String s1 = li.get(i);
			System.out.println(s1);
		}
		  
		System.out.println("Using Iterator");

		Iterator<String> it = li.iterator();
		while(it.hasNext()) {
			String r = it.next();
			System.out.println(r);
		
		}
			
	}
	}
}
