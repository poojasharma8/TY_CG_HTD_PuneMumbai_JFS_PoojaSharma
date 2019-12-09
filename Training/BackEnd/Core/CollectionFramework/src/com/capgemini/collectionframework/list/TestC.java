package com.capgemini.collectionframework.list;

import java.util.ArrayList;

public class TestC {
	public static void main(String[] args) {

		ArrayList a1 = new ArrayList();
		a1.add(24);
		a1.add(2.4); //Double type (auto-boxing)
		a1.add("pooja");
		a1.add('f');

		for (Object obj : a1) {
		System.out.println(obj);
		}
		

	}
}
