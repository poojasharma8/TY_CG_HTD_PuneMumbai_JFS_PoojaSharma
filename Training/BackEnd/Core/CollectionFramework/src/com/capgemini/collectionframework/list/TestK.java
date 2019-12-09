package com.capgemini.collectionframework.list;

import java.util.ArrayList;
import java.util.ListIterator;

public class TestK {

	public static void main(String[] args) {

		ArrayList<Double> al = new ArrayList<Double>();
		al.add(2.4);
		al.add(9.6);
		al.add(4.1);
		al.add(3.2);
		

		ListIterator<Double> m =al.listIterator(); // only double values

		System.out.println("*******Forward*********");

		while(m.hasNext()) {
			Object r= m.next();
			System.out.println(r);
		}
		System.err.println("*******Backward*********");

		while(m.hasPrevious()) {
			Object r= m.previous();
			System.out.println(r);
		}
	}

}
