package com.simplilearn.sortalgorith.selection;

public class MergeSortExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {9,14,3,2,43,11,58,22};
		
		System.out.println("before merge sort");
		for (int i=0; i<arr.length;i++ ) {
			System.out.print(arr[i] + " ");
		}

		insertionSort(arr);
		System.out.println();
		System.out.println("after merge sort");
		for (int i=0; i<arr.length;i++ ) {
			System.out.print(arr[i] + " ");
		}

		
	}
	
	private static void insertionSort(int[] array) {
		
//		int length = array.length;
		int temp = 0;
		
		for (int j=1; j<array.length;j++) {
			int value = array[j];
			int i = j -1;
			while ((i > -1) && (array[i] > value)) {
				array[i + 1] = array [i];
				i--;
			}
			array[i + 1] = value;
				
		}
		
	}

}
