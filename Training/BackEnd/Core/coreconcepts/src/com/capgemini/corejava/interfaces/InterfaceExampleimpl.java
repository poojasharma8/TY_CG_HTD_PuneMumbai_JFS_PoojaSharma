package com.capgemini.corejava.interfaces;

public class InterfaceExampleimpl implements InterfaceExample1 {

	@Override
	public void print() {
		System.out.println("Implemented print method of interface");
	}
	
	public static void main(String[] args) {
		InterfaceExample1 ie = new InterfaceExampleimpl();
		ie.print();//implementation class object
		ie.display();
		ie.printNum();
		InterfaceExample1.show();
	}
	
	

	/*
	 * @Override public static void show() {
	 * System.out.println("static method of interface"); }
	 */
	 
	 		
	@Override
	
	public void display(){
		System.out.println("implemented display method of interface");
	}

	@Override
	public void printNum() {
		System.out.println("1234");
		
	}
}
