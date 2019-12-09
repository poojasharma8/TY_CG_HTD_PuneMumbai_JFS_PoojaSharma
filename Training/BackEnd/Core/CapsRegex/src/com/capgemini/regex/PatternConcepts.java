package com.capgemini.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternConcepts {


	static Pattern pattern;
	static Matcher matcher;

	public static void main(String[] args) {

		//pattern for single digit
		pattern = Pattern.compile("\\d");//object creation using compile(),because constructors are private
		matcher = pattern.matcher("1");
		System.out.println("For pattern \\d:"+matcher.matches());
		System.out.println("---------------------------------------");
		
		//pattern for more than 1 digit
		pattern = Pattern.compile("\\d+");
		matcher = pattern.matcher("823456");
		System.out.println("For pattern \\d+:"+matcher.matches());
		System.out.println("---------------------------------------");
		
		//pattern for anything else but digit
		pattern = Pattern.compile("\\D");
		matcher = pattern.matcher("?");
		System.out.println("For pattern \\D:"+matcher.matches());
		System.out.println("---------------------------------------");

		//same as D but for more than one value
		pattern = Pattern.compile("\\D+"); //can't be a digit
		matcher = pattern.matcher("ABCFD");
		System.out.println("For pattern \\D+:"+matcher.matches());
		System.out.println("---------------------------------------");
		
		//For one space
		pattern = Pattern.compile("\\s");
		matcher = pattern.matcher(" ");
		System.out.println("For pattern \\s:"+matcher.matches());
		System.out.println("---------------------------------------");
		
		//For more  than one space
		pattern = Pattern.compile("\\s+");
		matcher = pattern.matcher("   ");
		System.out.println("For pattern \\s+:"+matcher.matches());
		System.out.println("---------------------------------------");
		
		//Represents anything but space
		pattern = Pattern.compile("\\S");
		matcher = pattern.matcher(" ");
		System.out.println("For pattern \\S:"+matcher.matches());
		System.out.println("---------------------------------------");
		
		//pattern for digit + char excluding special chars
		pattern = Pattern.compile("\\w");
		matcher = pattern.matcher("A");
		System.out.println("For pattern \\w:"+matcher.matches());
		System.out.println("---------------------------------------");
			
		//pattern for 
		pattern = Pattern.compile("\\w+");
		matcher = pattern.matcher("Afgjhhuydtt");
		System.out.println("For pattern \\w+:"+matcher.matches());
		System.out.println("---------------------------------------");

		//pattern for
		pattern = Pattern.compile("\\W+"); //Cannot be a char
		matcher = pattern.matcher("&*123");
		System.out.println("For pattern \\W+:"+matcher.matches());
		System.out.println("---------------------------------------");

		//for null digit
		pattern = Pattern.compile("\\d{0}"); 
		matcher = pattern.matcher("");
		System.out.println("For pattern \\d:"+matcher.matches());
		System.out.println("---------------------------------------");
		
		pattern = Pattern.compile("\\d{5,9}"); 
		matcher = pattern.matcher("12345");
		System.out.println("For pattern \\d:"+matcher.matches());
		System.out.println("---------------------------------------");

		//Pattern for mobile phone number
		pattern = Pattern.compile("\\d{10}"); 
		matcher = pattern.matcher("1341245670");
		System.out.println("For pattern \\d{10}:"+matcher.matches());
		System.out.println("---------------------------------------");
	}

}

//[Pattern class will create a pattern and Matcher class will take a input in order to match with the pattern
//matches() method will help match the input with the pattern]