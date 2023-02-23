package com.simplilearn.sortalgorith.selection;

public class Merge {
	
	void merge (int a[], int beg, int mid, int end ) {
		int i, j, k;
		int lenArr1 = mid - beg + 1;
		int lenArr2 = end - mid;
		
		int leftArr[] = new int[lenArr1];
		int rightArr[] = new int[lenArr2];
		
		for (i=0;i<lenArr1; i++) {
			leftArr[i] = a[beg + i];
			
		}
		
		for (j=0;j<lenArr2; j++) {
			rightArr[j] = a[mid + 1 +j];
			
		}
		
		i=0;
		j=0;
		k=beg;
		
		while (i<lenArr1 && j<lenArr2) {
			if (leftArr[i] <= rightArr[j]) {
				a[k] = leftArr[i];
				i++;
			}
			else {
				a[k] = leftArr[i];
				j++;
			
			}
		}
		
		
		// some code missing. check code in github
	}

}
