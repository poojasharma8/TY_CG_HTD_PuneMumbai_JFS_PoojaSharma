package com.capgemini.corejava.interfaces;
 
public interface InterfaceExample1  {
	 
	public void print() ;
	public void printNum();
	
	default void display() {
		System.out.println("default method of interface");
	}
	
	public static void show() {
		System.out.println("static method of interface"); 
	}

}
