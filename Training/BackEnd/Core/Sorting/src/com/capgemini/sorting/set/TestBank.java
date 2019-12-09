package com.capgemini.sorting.set;

import java.util.Iterator;
import java.util.TreeSet;

public class TestBank {

	public static void main(String[] args) {
		ByPin comp = new ByPin();
		ByName comp1 = new ByName();
		ByMicr comp2 = new ByMicr();

		TreeSet<Bank> t = new TreeSet<>(comp2);
		Bank b1 = new Bank(123 , "SBI" ,79999);
		Bank b2 = new Bank(100 , "HDFC" ,12678);
		Bank b3 = new Bank(200 , "ICICI" ,23657);
		Bank b4 = new Bank(300 , "PNB" , 80020);

		t.add(b1);
		t.add(b2);
		t.add(b3);
		t.add(b4);

		Iterator<Bank> it = t.iterator();
		while(it.hasNext()) {
			Bank b = it.next();
			System.out.println("Pin is "+b.pin);
			System.out.println("Name is "+b.name);
			System.out.println("micr is "+b.micr);
			System.out.println("--------------------------------------------");

		}


	}

}
