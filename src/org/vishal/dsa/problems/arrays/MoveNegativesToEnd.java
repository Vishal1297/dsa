package org.vishal.dsa.problems.arrays;

public class MoveNegativesToEnd {

    public static void main(String[] args) {
        int[] arr = {1, -1, 3, 2, -7, -5, 11, 6};
        segregateElements(arr, arr.length);
        for (int num : arr) {
            System.out.print(num + "\t");
        }
        System.out.println();
    }

    public static void segregateElements(int[] arr, int n) {
        int[] arr2 = new int[n];
        int index = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] > -1) {
                arr2[index] = arr[i];
                index++;
            }
        }
        for (int i = 0; i < n; i++) {
            if (arr[i] < 0) {
                arr2[index] = arr[i];
                index++;
            }
        }
        for (int i = 0; i < n; i++) {
            arr[i] = arr2[i];
        }
    }

}
