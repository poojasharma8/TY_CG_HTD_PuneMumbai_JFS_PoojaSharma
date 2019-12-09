package com.capgemini.sorting;

public class Student2 implements Comparable<Student2>{
	int id;
	String name ;
	double percentage;
	public Student2(int id, String name, double percentage) {

		this.id = id;
		this.name = name;
		this.percentage = percentage;
	}
	// Logic to Sort using id
	/*
	 * @Override 
	 * public int compareTo(Student2 s) { 
	 * if(this.id>s.id) { 
	 * return 1; 
	 * }
	 * else if(this.id<s.id) { 
	 * return -1 ;
	 * }
	 *  else { 
	 *  return 0; 
	 * } 
	 *   
	 */
	
	
	// Sorting by percentage using boxing
	@Override
	public int compareTo(Student2 s) {
		Double k = this.percentage;
		Double t = s.percentage;

		return k.compareTo(t);
	}


	// Logic to sort using Percentage
	/*@Override
	 * public int compareTo(Student2 s) {
	 *  if(this.percentage>s.percentage) {
	 *   return 1;
	 *  } 
	 *  else if(this.percentage<s.percentage) {
	 *   return -1 ; 
	 *   } 
	 *   else {
	 *    return 0; 
	 *    }
	 */

	
	/*
	 * // Logic to sort Students by name(ascending order)
	 * public int compareTo(Student2 s) {
	 * //because String is Comparable and 
	 * String k = this.name; 
	 * String p = s.name;
	 * int res = this.name.compareTo(s.name);
	 *  return res; }
	 */
	/*
	 * //Logic to sort students by name in descending order 
	 * public int compareTo(Student2 s) { 
	 * return this.name.compareTo(s.name) * -1;
	 * 
	 * }
	 */
}
