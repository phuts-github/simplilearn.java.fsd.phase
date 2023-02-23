package com.simplilearn.arrays.rotation;

public class ArrayLeftRotation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int array[] = {11,22,33,44,55,66,77};
		
		// no of rotations to be performed
		int r = 1;
		
		// array length
		int n = array.length;
		
		System.out.println("array before rotation ");
		for (int i=0; i<n;i++) {
			System.out.print(array[i] + " ");
		}
		
		// rotate array to the left
//		rotateArrayByOne(array, n);
		
		rotateToLeft(array, r, n);
		
		// force next line
		System.out.println();
		System.out.println("array after rotation ");
		for (int i=0; i<n;i++) {
			System.out.print(array[i] + " ");
		}
		

	}

	private static void rotateToLeft (int array[], int d, int n) {
		for (int i = 0; i < d; i++) {
			rotateArrayToLeftByOne(array, n);
		}
	}
	
	private static void rotateArrayToLeftByOne(int array[], int n) {
		int i, temp;
		temp = array [0];
		
		for (i=0; i<(n-1); i++) {
			// shift array element to the left by 1 position
			array[i] = array[i +1];
		
		}
		array[i] = temp;
		
	}
	
	
}
