package org.vishal.dsa.problems.arrays;

public class MaxSubArray {

    public static void main(String[] args) {
        int[] arr = {-1, -2, -3, -4};
        System.out.println(maxSubArray(arr));
        System.out.println(maxSubArraySumV2(arr));
    }

    public static int maxSubArray(int[] nums) {
        if (nums.length == 1) {
            return nums[0];
        }
        int max = nums[0];
        int sum = nums[0];
        for (int i = 1; i < nums.length; i++) {
            sum = Math.max(nums[i], sum + nums[i]);
            max = Math.max(max, sum);
        }
        return max;
    }

    /**
     * Acc To Kadane's algorithm
     * Cases :
     * 1. All negative
     * 2. All positive
     * 3. Some positive & some negative
     * @return Int : Max sub array sum
     */
    public static int maxSubArraySumV2(int[] arr){
        int currentSum = 0, bestSum = 0, sum = 0;
        int max = Integer.MIN_VALUE;
        boolean isAllNegative = true, isAllPositive = true;
        for (int j : arr) {
            sum += j;
            if (j > 0) {
                isAllNegative = false;
            }
            if (j < 0) {
                isAllPositive = false;
            }
            if (j > max) {
                max = j;
            }
        }
        if (isAllNegative) {
            bestSum = max;
        } else if(isAllPositive){
            bestSum = sum;
        } else {
            for (int i = 0; i < arr.length; i++) {
                currentSum = Math.max(0, currentSum + arr[i]);
                bestSum = Math.max(currentSum, bestSum);
            }
        }
        return bestSum;
    }
}