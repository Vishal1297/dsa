package org.vishal.dsa.problems.arrays;

public class MonotonicArray {

    public static void main(String[] args) {
        int[] nums = {6, 5, 4, 4};
        System.out.println(isMonotonic(nums));
    }

    public static boolean isMonotonic(int[] nums) {
        int length = nums.length;
        if (length <= 1) return true;
        boolean inc = nums[0] <= nums[length - 1];
        for (int i = 1; i < length; i++) {
            if (inc) {
                if (nums[i - 1] > nums[i]) {
                    return false;
                }
            } else {
                if (nums[i - 1] < nums[i]) {
                    return false;
                }
            }
        }
        return true;
    }
}
