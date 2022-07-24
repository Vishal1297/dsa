package org.vishal.dsa.problems.arrays;

public class Sort012 {

    public static void main(String[] args) {
        int[] arr = {0, 2, 1, 2, 0};
        sort012(arr, arr.length);
        for (int num : arr) {
            System.out.print(num + "\t");
        }
        System.out.println();
    }

    public static void sort012(int[] a, int n) {
        partition(a, 2, n);
        partition(a, 1, n);
    }

    public static void partition(int[] arr, int pivot, int n) {
        int i = 0;
        int j = 0;
        while (i < n) {
            if (arr[i] < pivot) {
                swap(arr, i, j);
                i++;
                j++;
            } else if (arr[i] >= pivot) {
                i++;
            }
        }
    }

    public static void swap(int[] arr, int i, int j) {
        if (arr[i] == arr[j]) return;
        arr[i] = arr[i] + arr[j];
        arr[j] = arr[i] - arr[j];
        arr[i] = arr[i] - arr[j];
    }
}
