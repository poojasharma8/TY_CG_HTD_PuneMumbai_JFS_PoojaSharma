package com.capgemini.sorting.dataStructures;

import java.time.Duration;
import java.time.Instant;

public class Main {

	public static void main(String[] args) {

		
		int a[] = {10 , 15 , 8 , 11 , 12};
		
		System.out.println("Before Sorting :" );
			for(int i = 0 ; i < a.length ; i++) {
				System.out.print(a[i] +" ");
			}
		System.out.println();
		System.out.println("----------------------------------------------");
		
		
		System.out.println("After Sorting:");
		for(int j =0 ; j <a.length ; j++) {
			System.out.print(a[j] +" ");
			
		}
		

		//BubbleSort.bubble(a);
		Instant start = Instant.now();
		InsertionSort.sort(a);
		Instant end = Instant.now();
		long duration = Duration.between(start, end).toMillis();
		double seconds = duration / 1000.0;
		System.out.println("Insertion time : " + seconds + " seconds ");

	}// End of main()

}// End of class
