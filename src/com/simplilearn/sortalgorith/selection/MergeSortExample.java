package com.simplilearn.sortalgorith.selection;

public class MergeSortExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {10,4,2,15,17,5,3,1};
		
		int arrLength = arr.length;

		Merge m1 = new Merge();
		System.out.println("\nBefore sorting array elements are - ");
		m1.printArray(arr, arrLength);
		m1.mergeSort(arr, 0, arrLength - 1);
		System.out.println("\nAfter sorting array elements are - ");
		m1.printArray(arr, arrLength);
		System.out.println();

	}

}
