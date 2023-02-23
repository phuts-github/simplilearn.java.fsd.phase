package com.simplilearn.searchalgorithm.binary;

import java.lang.reflect.Array;

public class BinarySearchExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = {10,20,30,40,50,60,70,80};
		
		// find the index of array entry with value 60
		
		int value = 60;
		int firstArrayIndex = arr.length - (arr.length - 1);
		int lastArrayIndex = arr.length - 1;
		
		binarySearch(arr, firstArrayIndex, lastArrayIndex, value);

	}
	
	
	private static void binarySearch(int[] array, int firstArrayIndex, int lastArrayIndex, int value) {
		
		
		while (firstArrayIndex <= lastArrayIndex) {
			
			int midIndex = (firstArrayIndex + lastArrayIndex) / 2;
			
			System.out.println("Indexes first - mid - last :: " + firstArrayIndex + " - " + midIndex + " - " + lastArrayIndex);
			
			if (array[midIndex] == value) {
				System.out.println("Value is equal to mid index " + midIndex);
				break;
			}
			else {
				if (array[midIndex] < value) {
					firstArrayIndex = midIndex + 1;
				}
				else {
					lastArrayIndex = midIndex - 1;
				}
			}
		}
	}
}
