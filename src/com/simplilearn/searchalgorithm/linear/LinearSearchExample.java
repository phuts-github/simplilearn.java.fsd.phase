package com.simplilearn.searchalgorithm.linear;

public class LinearSearchExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = {10,20,30,40,50,60,70,80,90};
		
		// find the index of array entry with value 70
		
		int value = 700;
		int returnIndex = linearSearch(arr, value);
		
		if (returnIndex != -1) {
			System.out.println("Value " + value + " found in index " + returnIndex);
		}
		else {
			System.out.println("Value " + value + " not found on the array");
		}

	}
	
	
	private static int linearSearch(int[] array, int value) {
		
		for (int i=0; i<array.length; i++) {
			if (array[i] == value) {
				return i;
			}
		}
		
		// if there is no match, return -1
		return -1;
	}

}
