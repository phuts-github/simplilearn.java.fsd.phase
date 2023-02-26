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

		// sorting
		while (i<lenArr1 && j<lenArr2) {
			if (leftArr[i] <= rightArr[j]) {
				a[k] = leftArr[i];
				i++;
			}
			else {
				a[k] = leftArr[j];
				j++;
			}
			k++;
		}

		// merging
		while (i <lenArr1) {
			a[k] = leftArr[i];
			i++;
			k++;
		}

		// meging
		while (j <lenArr2) {
			a[k] = rightArr[j];
			j++;
			k++;
		}
		// some code missing. check code in github
	}

	void mergeSort (int a[], int beg, int end) {
		if (beg < end) {
			int mid = (beg + end) / 2;
			mergeSort(a, beg, mid); // first half
			mergeSort(a, mid +1, end); // second half
			merge(a, beg, mid, end);

		}
	}

	void printArray (int a[], int n) {
		System.out.println("???printing merge sort");
		for (int i=0; i<a.length;i++ ) {
			System.out.print(a[i] + " ");
		}
	}

}
