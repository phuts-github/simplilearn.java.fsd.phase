package com.simplilearn.arrays;

public class MultiDimensionalArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [][] intMultiDimArray = new int [3][3];
		intMultiDimArray[0][0] = 00;
		intMultiDimArray[0][1] = 01;
		intMultiDimArray[0][2] = 02;

		intMultiDimArray[1][0] = 10;
		intMultiDimArray[1][1] = 11;
		intMultiDimArray[1][2] = 12;
	
		intMultiDimArray[2][0] = 20;
		intMultiDimArray[2][1] = 21;
		intMultiDimArray[2][2] = 22;	
		
		for (int i=0;i<3;i++) {
			System.out.println("Row " + (i+1));
			for (int j=0;j<3;j++) {
				System.out.println("Col " + (j +1 )+ " > " + intMultiDimArray[i][j]);
			}
			System.out.println();
		}
	}

}
