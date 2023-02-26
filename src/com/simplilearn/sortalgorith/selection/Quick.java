package com.simplilearn.sortalgorith.selection;

public class Quick {
    // function that considers last element as the pivot
    // objective - place pivot at the exact position
    //           - place smaller element to the left of pivot
    //           - place larger elements to the right of pivot

    public int partition (int a[], int start, int end) {

        int pivot = a[end]; // any number.. begin, middle, end

        int i = start - 1;

        //since pivot is at the right, this algo will move from left to right
        for (int j = start; j <= end - 1; j++) {
            if (a[j] < pivot) {
                // if current element is smaller than the pivot value
                // increment the smaller element index
                i++;
                int t = a[i];
                a[i] = a[j];
                a[j] = t;
            }
        }

        int t = a[i + 1];
        a [i + 1] = a[end];
        a[end] = t;

        return 0;
    }

    void quick (int a[], int start, int end) {
        if (start < end) {
            int p = partition(a, start, end);
            quick(a, start, p - 1);
            quick(a, p + 1, end);
        }
    }

    void printArray (int a[], int n) {
        for (int i=0; i<a.length;i++ ) {
            System.out.print(a[i] + " ");
        }
    }
}
