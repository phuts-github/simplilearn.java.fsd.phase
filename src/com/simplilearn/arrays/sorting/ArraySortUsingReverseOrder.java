package com.simplilearn.arrays.sorting;

import java.util.Arrays;

public class ArraySortUsingReverseOrder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		int array[] = {10,5,8,2,20,13,30};
		int array[] = new int [] {10,5,8,2,20,13,30};
		
		System.out.println("Array before the sorting");
		
		for (int i=0; i <array.length; i++) {
			System.out.print(array[i] + " ");
		}
		
		Arrays.sort(array);
		
		System.out.println();
		System.out.println("Array after the sorting");
		
		for (int i=0; i <array.length; i++) {
			System.out.print(array[i] + " ");
		}

	}

}
