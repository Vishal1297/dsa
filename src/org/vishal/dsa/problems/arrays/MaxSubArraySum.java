package org.vishal.dsa.problems.arrays;

/**
 * Given an array Arr[] of N integers.
 * Find the contiguous sub-array(containing at least one number) which has the maximum sum
 * and return its sum.
 */
public class MaxSubArraySum {

    public static void main(String[] args) {
        int[] input = {0, -1, 1, 11, -11, -2, -3, -4, 8};
        long result = maxSubarraySum(input, input.length);
        System.out.println(result);
    }

    static long maxSubarraySum(int[] arr, int n) {
        long maxSum = Integer.MIN_VALUE, maxEnd = 0;
        for (int j : arr) {
            maxEnd += j;
            if (maxSum < maxEnd) {
                maxSum = maxEnd;
            }
            if (maxEnd < 0) {
                maxEnd = 0;
            }
        }
        return maxSum;
    }
}
