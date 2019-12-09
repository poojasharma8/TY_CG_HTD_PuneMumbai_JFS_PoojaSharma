package com.capgemini.collectionframework.list;

import java.util.ArrayList;

public class TestA {

	@SuppressWarnings({ "unchecked", "rawtypes" }) //suppress warning
	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		al.add(24);
		al.add("Chinnu");
		al.add(2.9);
		al.add('F');

		for(int i=0;i<al.size() ;i++) {
			Object r = al.get(i);
			System.out.println(r);
		}

	}

}
