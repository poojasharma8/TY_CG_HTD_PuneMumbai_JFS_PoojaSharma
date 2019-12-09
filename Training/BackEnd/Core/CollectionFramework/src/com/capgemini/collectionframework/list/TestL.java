package com.capgemini.collectionframework.list;

import java.util.LinkedList;
import java.util.ListIterator;

public class TestL {

	public static void main(String[] args) {

		LinkedList li = new LinkedList();
		li.add(9);
		li.add(2.1);
		li.add("dimple");
		
		System.out.println("***Using for-each****");
		for(Object o : li)
		{
			System.out.println(o);
		}
		System.out.println("***Using for loop****");
		for(int i =0 ;i<li.size(); i++) {
			System.out.println(li.get(i));
		}
		
		
		System.out.println("*********ListIterator***********");
		
		ListIterator lit = li.listIterator();
		System.out.println("----------> Forward---");
		
		while(lit.hasNext()) {
			Object r= lit.next();
			System.out.println(r);
		}
		System.err.println("----------> Backward---");

		while(lit.hasPrevious()) {
			Object r= lit.previous();
			System.out.println(r);
		}
			
	}

}
