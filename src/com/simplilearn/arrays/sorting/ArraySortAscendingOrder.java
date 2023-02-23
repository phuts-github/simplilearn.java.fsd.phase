package com.simplilearn.arrays.sorting;

import java.util.Arrays;
import java.util.Collections;

public class ArraySortAscendingOrder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Double[] array = {10.,5.,8.1,20.,20.00,13.5,30.01};
		
		
		System.out.println("Array before the sorting");
		
		for (int i=0; i <array.length; i++) {
			System.out.print(array[i] + " ");
		}
		
		Arrays.sort(array, Collections.reverseOrder());
		
		System.out.println();
		System.out.println("Array after the sorting");
		
		for (int i=0; i <array.length; i++) {
			System.out.print(array[i] + " ");
		}

	}

}
