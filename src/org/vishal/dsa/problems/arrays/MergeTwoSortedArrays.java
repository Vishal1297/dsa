package org.vishal.dsa.problems.arrays;

import java.util.Arrays;

public class MergeTwoSortedArrays {

    public static void main(String[] args) {
        long[] arr1 = {1, 3, 5, 7};
        long[] arr2 = {0, 2, 6, 8, 9};
        merge(arr1, arr2, arr1.length, arr2.length);
        for (long num : arr1) {
            System.out.print(num + "\t");
        }
        System.out.println();
        for (long num : arr2) {
            System.out.print(num + "\t");
        }
        System.out.println();
    }

    public static void merge(long[] arr1, long[] arr2, int n, int m) {
        int firstIndex = n - 1;
        int secondIndex = 0;
        while (firstIndex >= 0 && secondIndex < m) {
            if (arr1[firstIndex] > arr2[secondIndex]) {
                long temp = arr1[firstIndex];
                arr1[firstIndex] = arr2[secondIndex];
                arr2[secondIndex] = temp;
            }
            firstIndex--;
            secondIndex++;
        }
        Arrays.sort(arr1);
        Arrays.sort(arr2);
    }
}
