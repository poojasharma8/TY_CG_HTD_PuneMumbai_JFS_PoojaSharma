package com.capgemini.collectionframework.list;

import java.util.ArrayList;
import java.util.ListIterator;

public class TestD {

	public static void main(String[] args) {

		ArrayList a1 = new ArrayList();
		a1.add(24);
		a1.add("Payal");
		a1.add('F');
		a1.add(5.5);
		
		ListIterator m =a1.listIterator();
		
		//System.out.println("*******Forward*********");

		while(m.hasNext()) {
			Object r= m.next();
			//System.out.println(r);
		}
		System.out.println("*******Backward*********");
		
		while(m.hasPrevious()) {
			Object r= m.previous();
			System.out.println(r);
		}
		

	}

}
