package com.capg.corejava.methods;

public class methods_sample {
		int y = 10;
	
	public static void main(String[] args) {
		print();
		System.out.println("area of square -"+areaOfSquare(2));
		int area = new methods_sample().areaOfRec(2,5);
		System.out.println(area);
	}
	public static void print() {
		System.out.println("print() method");

	}
	public static int areaOfSquare(int side) {
		
		return side*side;
	}
	public int areaOfRec(int length,int width) {
		return length*width;
	}
}
