package com.simplilearn.arrays.matrices;

public class ArrayMatricesAddition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [][] a = {{1,2,3},{4,5,6},{7,8,9}};
		int [][] b = {{10,11,12},{13,14,15},{16,17,18}};
		
		// add sum of array a and b arrays 
		int [][] c = new int [3][3];
		
		System.out.println(" Addition");
		for (int i=0; i<3; i++) {
			
			for (int j=0;j<3;j++) {
				c[i][j] = a[i][j]+b[i][j];
				System.out.print(c[i][j] + " ");
				
			}
			System.out.println();
		}
		
		//subtracting sum of arrays a and b
		System.out.println(" Subtraction");
		for (int i=0; i<3; i++) {
			
			for (int j=0;j<3;j++) {
				c[i][j] = a[i][j] - b[i][j];
				System.out.print(c[i][j] + " ");
				
			}
			System.out.println();
		}
		
		//subtracting sum of arrays a and b
		System.out.println(" Multiplications");
		for (int i=0; i<3; i++) {
			
			for (int j=0;j<3;j++) {
				c[i][j] = a[i][j] * b[i][j];
				System.out.print(c[i][j] + " ");
				
			}
			System.out.println();
		}
		
		//subtracting sum of arrays a and b
		System.out.println(" Division");
		for (int i=0; i<3; i++) {
			
			for (int j=0;j<3;j++) {
				c[i][j] = a[i][j] / b[i][j];
				System.out.print(c[i][j] + " ");
				
			}
			System.out.println();	
		}
		
		

	}

}
