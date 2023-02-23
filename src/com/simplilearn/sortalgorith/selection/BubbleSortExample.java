package com.simplilearn.sortalgorith.selection;

public class BubbleSortExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {3,60,35,2,45,320,5};
		
		System.out.println("before bubble sort");
		for (int i=0; i<arr.length;i++ ) {
			System.out.print(arr[i] + " ");
		}

		bubbleSort(arr);
		System.out.println();
		System.out.println("after bubble sort");
		for (int i=0; i<arr.length;i++ ) {
			System.out.print(arr[i] + " ");
		}

		
	}
	
	private static void bubbleSort(int[] arr) {
		
		int length = arr.length;
		int temp = 0;
		
		for (int i=0; i<arr.length;i++) {
			int index = 1;
			
			for (int j=1; j<arr.length-i;j++) {
				
				if (arr[j-1] > arr[j]) {
					temp = arr[j-1];
					arr[j-1] = arr[j];
					arr[j] = temp;
				}
				
			}
			
		}
		
	}

}
