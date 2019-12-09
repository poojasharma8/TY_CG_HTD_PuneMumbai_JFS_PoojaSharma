package com.capgemini.StudentExample;

import java.util.ArrayList;
import java.util.LinkedList;

public class TestZ {

	public static void main(String[] args) {

		LinkedList<Double> li = new LinkedList<Double>();
		li.add(3.6);
		li.add(2.4);
		li.add(4.7);
		li.add(1.6);
		
	for (int i = 0 ; i <li.size() ; i++) {
		Double r = li.get(i);
		System.out.println(r);
				
	}	
}

}
