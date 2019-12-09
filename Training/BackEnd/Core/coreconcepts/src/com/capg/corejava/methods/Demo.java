package com.capg.corejava.methods;
public class Demo { 
	static methods_sample me = new methods_sample();
	public static void main(String[] args) {
	methods_sample me1= new methods_sample();// methods_sample constructor is the default constructor.
	
		System.out.println(me);
		System.out.println(me1);
		System.out.println(methods_sample.areaOfSquare(6));//to call a static method from a different class.
		System.out.println(me.areaOfRec(2,5));
		System.out.println(me1.areaOfRec(2,5));
		System.out.println(me.y);
	}

}
