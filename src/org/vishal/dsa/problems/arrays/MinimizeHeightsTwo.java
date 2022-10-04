package org.vishal.dsa.problems.arrays;

import java.util.Arrays;

public class MinimizeHeightsTwo {

    public static void main(String[] args) {
        int[] arr = {2, 6, 3, 4, 7, 2, 10, 3, 2, 1};
        int k = 5;
        System.out.println(getMinDiff(arr, arr.length, k));
    }

    public static int getMinDiff(int[] arr, int n, int k) {
        Arrays.sort(arr);
        int smallest = arr[0] + k;
        int largest = arr[n - 1] - k;
        int result = arr[n - 1] - arr[0];
        for (int i = 0; i < n - 1; i++) {
            int min = Math.min(smallest, arr[i + 1] - k);
            int max = Math.max(largest, arr[i] + k);
            if (min < 0) continue;
            result = Math.min(result, max - min);
        }
        return result;
    }
}
