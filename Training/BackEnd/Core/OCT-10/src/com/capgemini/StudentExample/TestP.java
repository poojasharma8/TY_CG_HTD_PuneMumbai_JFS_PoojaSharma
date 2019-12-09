package com.capgemini.StudentExample;

import java.util.ArrayList;
import java.util.Collections;

public class TestP {

	public static void main(String[] args) {

		ArrayList a = new ArrayList();
		a.add('A');
		a.add('D');
		a.add('B');
		a.add('C');
		
		System.out.println("Before------>"+a);
		
		
		Collections.shuffle(a);
		System.out.println("After------>"+a);
	}

}
