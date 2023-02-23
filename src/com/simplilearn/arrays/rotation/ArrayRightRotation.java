package com.simplilearn.arrays.rotation;

public class ArrayRightRotation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int array[] = {12,-9,4,2,-10,11,14};
		
		// no of rotations to be performed
		int r = 1;
		
		// array length
		int n = array.length;
		
		System.out.println("array before rotation ");
		for (int i=0; i<n;i++) {
			System.out.print(array[i] + " ");
		}
		
		// rotate array to the right
//		rotateArrayRightByOne(array, n);
		
		rotateToRight(array, r, n);
		
		// force next line
		System.out.println();
		System.out.println("array after rotation ");
		for (int i=0; i<n;i++) {
			System.out.print(array[i] + " ");
		}
		

	}

	private static void rotateToRight (int array[], int d, int n) {
		for (int i = 0; i < d; i++) {
			rotateArrayToRightByOne(array, n);
		}
	}
	
	private static void rotateArrayToRightByOne(int array[], int n) {
		int i, temp;
		temp = array [n-1];
		
		for (i=(n-1); i>0; i--) {
			// shift array element to the left by 1 position
			array[i] = array[i -1];
		
		}
		array[i] = temp;
		
	}
	
	
}
