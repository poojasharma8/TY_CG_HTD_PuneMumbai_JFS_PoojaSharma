package com.capgemini.sorting.dataStructures;

public class InsertionSort {

	public static void sort(int a[]) {
		
		for (int i = 1; i < a.length; i++) {
			
			int k = a[i];
			int j = i - 1;

			/*
			 * Move elements of a[0..i-1],
			 * that are greater than key, to one position ahead
			 * of their current position
			 */
			
			if (j >= 0 && a[j] > k) {
				a[j + 1] = a[j];
				j = j - 1;
			}
			a[j + 1] = k;
		}
	}

}// End of class