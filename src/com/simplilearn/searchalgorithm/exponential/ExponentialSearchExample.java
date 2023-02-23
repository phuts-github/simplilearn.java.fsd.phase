package com.simplilearn.searchalgorithm.exponential;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ExponentialSearchExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = {10,20,30,40,50};
		
		// find the index of array entry with value 60
		
		int valueToSearch = 50;
		
		int arrayLength = arr.length;
		
		// two steps
		// find range where 20 is present
		// perform binary search in that range
		
		int results = exponentialSearch(arr, arrayLength, valueToSearch);
		if (results < 0) {
			System.out.println(" Value not found");
		}
		else {
			System.out.println(" Value " + valueToSearch + " is found at index " + results);
		}
	}
	
	
	private static int exponentialSearch(int[] array, int arrayLength, int valueToSearch) {
		
		if (array[0] == valueToSearch) {
			return 0;
		}
		
		int i=1;
		
		while (i< arrayLength && array[i] <= valueToSearch) {
			i = i * 2;
		}
		
		//return -1;
		return Arrays.binarySearch(array, i/2, Math.min(i, arrayLength - 1), valueToSearch);

	}
}
