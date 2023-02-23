package com.simplilearn.arrays.sorting;

import java.util.Arrays;

public class ArraySortAscendingOrderWithoutSortMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		int array[] = {10,5,8,2,20,13,30};
		int array[] = new int [] {50,10,5,8,2,20,13,30};
		
		System.out.println("Array before the sorting");
		
		for (int i=0; i <array.length; i++) {
			System.out.print(array[i] + " ");
		}
		
		int n = array.length;
		
		sortArray (array, n);
		
		System.out.println();
		System.out.println("Array after the sort");
		
		for (int i=0; i <array.length; i++) {
			System.out.print(array[i] + " ");
		}

	}
	
	private static void sortArray (int array[], int n) {
		for (int i=1; i<n; i++) {
			int j = i;
			int a = array[i];
			
			while (j>0 && array[j-1] > a) {
				array[j] = array[j -1];
				j--;
			}
			array[j] = a;
		}
	}

}
