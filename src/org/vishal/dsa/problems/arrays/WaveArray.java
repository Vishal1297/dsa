package org.vishal.dsa.problems.arrays;

import java.util.Arrays;

/**
 * Input :
 * n = 5
 * arr[] = {1,2,3,4,5}
 * Output : 2 1 4 3 5
 *
 * If Many solutions - lexicographically the smallest one
 *
 */

public class WaveArray {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11};
        waveArray(arr, arr.length);
    }

    private static void waveArray(int[] arr, int n) {
        Arrays.sort(arr);
        for (int i = 1; i < n; i+=2) {
            arr[i-1] = arr[i-1] + arr[i];
            arr[i] = arr[i-1] - arr[i];
            arr[i-1] = arr[i-1] - arr[i];
        }
    }


}
