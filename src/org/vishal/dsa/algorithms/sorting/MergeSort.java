package org.vishal.dsa.algorithms.sorting;

public class MergeSort {

    public static void main(String[] args) {
        int[] arr = {29, 10, 14, 37, 14};
        sort(arr, 0, arr.length - 1);
        for (int j : arr) {
            System.out.print(j + " ");
        }
    }

    public static void sort(int[] arr, int l, int r){
        if (l == r) return;
        int mid = l + (r - l) / 2;
        sort(arr, l, mid);
        sort(arr, mid + 1, r);
        merge(arr, l, r, mid);
    }

    public static void merge(int[] arr, int l, int r, int mid) {
        int leftArrSize = mid - l + 1;
        int rightArrSize = r - mid;
        int[] leftArr = new int[leftArrSize + 1];
        int[] rightArr = new int[rightArrSize + 1];

        for (int i = 0; i < leftArrSize; i++) {
            leftArr[i] = arr[i + l];
        }
        for (int i = 0; i < rightArrSize; i++) {
            rightArr[i] = arr[i + mid + 1];
        }

        leftArr[leftArrSize] = Integer.MAX_VALUE;
        rightArr[rightArrSize] = Integer.MAX_VALUE;

        int l_index = 0, r_index = 0;
        for (int i = l; i <= r; i++) {
            if(leftArr[l_index] <= rightArr[r_index]){
                arr[i] = leftArr[l_index++];
            }else {
                arr[i] = rightArr[r_index++];
            }
        }

    }
}
