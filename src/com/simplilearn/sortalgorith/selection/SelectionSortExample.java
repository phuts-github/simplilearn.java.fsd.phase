package com.simplilearn.sortalgorith.selection;

public class SelectionSortExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int array[] = {9,14,3,2,43,11,58,22};
		
		System.out.println("before selection sort");
		for (int i=0; i<array.length;i++ ) {
			System.out.print(array[i] + " ");
		}

		selectionSort(array);
		System.out.println();
		System.out.println("after selection sort");
		for (int i=0; i<array.length;i++ ) {
			System.out.print(array[i] + " ");
		}

		
	}
	
	private static void selectionSort(int array[]) {
		
		for (int i=0; i<array.length;i++) {
			int index = 1;
			
			for (int j=i+1; j<array.length;j++) {
				
				if (array[j] < array[index]) {
					index = j;
				}
				
			}
			
			int smallestNumber = array[index];
			array[index] = array[i];
			array[i] = smallestNumber;
			
		}
		
	}

}
