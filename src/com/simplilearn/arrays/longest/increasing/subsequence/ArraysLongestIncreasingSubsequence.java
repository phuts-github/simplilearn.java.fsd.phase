package com.simplilearn.arrays.longest.increasing.subsequence;

public class ArraysLongestIncreasingSubsequence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = {10,22,9,33,21,50,41,60,80};
		
		// find longest increasing subsequence
		
		int lengthArray = array.length;
		System.out.println("Given Array : " + array);
		System.out.println("Given Array size " + lengthArray);

		
		System.out.println();
		System.out.println("Array values before finding longest increasing subsequnce");
		for (int i=0; i<lengthArray;i++) {
			System.out.print(array[i] + " ");
			
		}

		System.out.println();
		System.out.println("Array values after finding longest increasing subsequnce");
		longestIncreasinSubsequence (array, lengthArray);
		

//		for (int i=0; i<lengthArray;i++) {
//			System.out.print(array[i] + " ");
//			
//		}
		
	}
	
	private static void longestIncreasinSubsequence (int[] array, int length){
		int[] list = new int[length];
		int i, j, max =0;
		
		// initialize list array for all indexes with value 1
		for (i=1; i<length; i++) {
			list[i] =1;
		}
		
		
		for (i=1; i<length; i++) {
			for (j=0; j<i; j++) {
				if (array[i] > array[j] && 	list[i] < list[j] +1 ) {
					list[i] = list[j]+1;
				};
			}
		}
		
		
		for (i=0; i<length; i++) {
			if (max < list[i]) {
				max = list[i];
			};
		}
		
		System.out.println();
		System.out.println("Array length : " + list.length);
	}

}
