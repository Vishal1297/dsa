package org.vishal.dsa.algorithms.sorting;

public class QuickSort {

    public static void main(String[] args) {
        int[] arr = {29, 10, 14, 37, 14};
        sort(arr, 0, arr.length - 1);
        for (int j : arr) {
            System.out.print(j + " ");
        }
    }

    public static void sort(int[] arr, int low, int high){
        if (low > high) return;
        int pivot = arr[high];
        int pivotIndex = partition(arr, pivot, low, high);
        sort(arr, low, pivotIndex - 1);
        sort(arr, pivotIndex + 1, high);
    }

    public static int partition(int[] arr, int pivot, int low, int high) {
        int i = low, j = low;
        while (i <= high) {
            if (pivot >= arr[i]) {
                swap(arr, i, j);
                i++;
                j++;
            }else {
                i++;
            }
        }
        return j - 1;
    }

    public static void swap(int[] arr, int i, int j) {
        if (arr[i] == arr[j]) return;
        arr[i] = arr[i] + arr[j];
        arr[j] = arr[i] - arr[j];
        arr[i] = arr[i] - arr[j];
    }
}
