package com.simplilearn.arrays.range;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArrayRange {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int []array = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};
		
		int n=array.length;
		
		ArrayList<Query> arrayQueryList = new ArrayList<>();
		arrayQueryList.add(new Query(0,4));
		arrayQueryList.add(new Query(1,3));
		arrayQueryList.add(new Query(2,4));
		
		int m = arrayQueryList.size();
		printQueryList (array, n, arrayQueryList, m);
		
	}
	
	private static void printQueryList(int array[], int arrLength, ArrayList<Query> arrQueryLst, int sizeQL) {
		for (int i=0;i<sizeQL;i++) {
			// L - Left boundary of current range
			// R - Right boundary of current range
			int L = arrQueryLst.get(i).L;
			int R = arrQueryLst.get(i).R;
			
			// Compute sum of current range query
			int sum=0;
			for (int j=L;j<=R;j++) {
				sum = sum + array[j];
			}
			System.out.println("Sum of [ " + L + " , " + R + " ] = " + sum);
		}
	}

}
