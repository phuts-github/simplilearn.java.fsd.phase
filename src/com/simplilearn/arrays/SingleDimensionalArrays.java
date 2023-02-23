package com.simplilearn.arrays;

public class SingleDimensionalArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int integerArray[] = new int[5];
		//integerArray[0] = 80;
		integerArray[1] = 90;
		integerArray[2] = 100;
		integerArray[3] = 70;
		integerArray[4] = 60;		
		
		//declaration, instantiation , initialization at once

		System.out.println("The integer array length is :: " + integerArray.length);
		System.out.println("The integer array values are :: " + integerArray[0] + ","
				+ integerArray[1] + "," + integerArray[2] + "," + integerArray[3] + "," + integerArray[4]);
		
		//traversing/printing an integer array with for loop
		for (int i=0; i<integerArray.length; i++) {
			System.out.println(integerArray[i]);
			
		}
		
		//declaration, instantiation , initialization at once
		int intArray[] = {11,12,13,14,15};
		
		//traversing/printing an integer array with for loop
		for (int i=0; i<intArray.length; i++) {
			System.out.println(intArray[i]);
			
		}		
	}

}
