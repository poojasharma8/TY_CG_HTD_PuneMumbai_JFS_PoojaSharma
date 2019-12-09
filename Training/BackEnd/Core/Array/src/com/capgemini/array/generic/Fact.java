package com.capgemini.array.generic;

	interface Factorial{
		 
		int fact(int k);
		 
		}
	
	public class Fact {
		
public static void main(String[] args) {
	 Factorial f = m -> {
		 int a = 1;
		 
		for (int i = 0 ; i <= m ; i++) {
			a = a*i ;
		}
		return a ;
	 };
	  int g = f.fact(5);
	  System.out.println("the factorial is : "+g);
	 }
	
}
	


