package org.vishal.dsa.algorithms.sorting;

import org.vishal.dsa.algorithms.Swap;

public class SelectionSort {

    public static void main(String[] args) {
        int[] arr = {29, 10, 14, 37, 14};
        sort(arr);
        for (int j : arr) {
            System.out.print(j + " ");
        }
    }

    public static void sort(int[] arr) {
        int min = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            int j = min + 1;
            for (; j < arr.length; j++) {
                if (arr[j] < arr[min]) {
                    min = j;
                }
            }
            Swap.swap(arr, i, min);
        }
    }

}
