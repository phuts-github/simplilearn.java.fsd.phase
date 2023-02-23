package com.simplilearn.arrays.sorting;

import java.util.Arrays;

public class ArraySortDescendingWithoutReverseOrder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		int array[] = {10,5,8,2,20,13,30};
		int array[] = new int [] {50,10,5,8,2,20,13,30};
		
		System.out.println("Array before the sorting");
		
		for (int i=0; i <array.length; i++) {
			System.out.print(array[i] + " ");
		}
		
		int n = array.length;
		
		sortArrayDescOrder (array, n);
		
		System.out.println();
		System.out.println("Array after the sort");
		
		for (int i=0; i <array.length; i++) {
			System.out.print(array[i] + " ");
		}
		
		
		System.out.println("Print largest three numbers from array.");
		// note - array already sorted in descending order. so just display first three array entries
		int k = 3;
		printLargestNumbers (array, k);

	}
	
	private static void sortArrayDescOrder (int array[], int n) {
		int temp;
		for (int i=1; i<n; i++) {
			
			for (int j = i+1; j<n; j++ ) {
				if (array[i]< array[j]) {
					temp = array[i];
					array[i] = array[j];
					array[j] = temp;
				}
			}
		}
			
	}
	
	private static void printLargestNumbers (int array[], int k) {	
		System.out.print("Largest " + k + "values from array are :: ");
		for (int i=0;i<k;i++) {
			System.out.print(array[i] + " ");
		}
	}

}
