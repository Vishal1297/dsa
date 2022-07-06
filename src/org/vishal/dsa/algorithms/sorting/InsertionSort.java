package org.vishal.dsa.algorithms.sorting;

public class InsertionSort {

    public static void main(String[] args) {
        int[] arr = {29, 10, 14, 37, 14};
        sort(arr);
        for (int j : arr) {
            System.out.print(j + " ");
        }
    }

    public static void sort(int[] arr){
        for (int i = 1; i < arr.length; i++) {
            int key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }
    }

}
