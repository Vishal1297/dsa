package org.vishal.dsa.algorithms.sorting;

import org.vishal.dsa.algorithms.Swap;

public class BubbleSort {

    public static void main(String[] args) {
        int[] arr = {29, 10, 14, 37, 14};
        sort(arr);
        for (int j : arr) {
            System.out.print(j + " ");
        }
    }

    public static void sort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    Swap.swap(arr, i, j);
                }
            }
        }
    }
}
