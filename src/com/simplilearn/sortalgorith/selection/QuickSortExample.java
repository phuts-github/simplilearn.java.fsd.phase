package com.simplilearn.sortalgorith.selection;

public class QuickSortExample {

    public static void main(String[] args) {

        int a[] = {13,18,27,2,19,25};

        int length = a.length;

        System.out.println("Array before Quick Sort");

        Quick q1 = new Quick();
        q1.printArray(a, length);
        q1.quick(a, 0, length -1);

        System.out.println("Array after Quick Sort");

        q1.printArray(a, length);
    }

}
