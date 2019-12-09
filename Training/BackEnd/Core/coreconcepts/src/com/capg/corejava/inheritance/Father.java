package com.capg.corejava.inheritance;

public class Father extends Grandfather {

		String fname = "Eddard";
	public static void main(String[] args) {
		new Father().printName();
	}
	
	@Override
	 public void printName() {
	System.out.println(fname+" "+name+" "+lastname);
	 super.printName();
	
	}
	 
}
