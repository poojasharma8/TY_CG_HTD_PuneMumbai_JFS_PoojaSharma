package com.capgemini.springcore.beans;

import com.capgemini.interfaces.Animal;

public class Dog implements Animal {

	@Override
	public void eat() {
		System.out.println("Eating pedigree..");
	}

	@Override
	public void speak() {
		System.out.println("Bow Bow ..");

	}

	@Override
	public void walk() {
		System.out.println("Dog is running..");
	}//End of walk()

}//End of class
