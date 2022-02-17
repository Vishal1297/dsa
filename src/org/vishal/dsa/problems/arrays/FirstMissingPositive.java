package org.vishal.dsa.problems.arrays;

import java.util.Arrays;

public class FirstMissingPositive {

    public static void main(String[] args) {
        int[] nums = {2, 8, 1, 0};
        System.out.println(firstMissingPositive(nums));
    }

    public static int firstMissingPositive(int[] nums) {
        if (nums.length == 1) {
            if (nums[0] < 1) {
                return 1;
            }
            if (nums[0] != 1) {
                return 1;
            } else {
                return nums[0] + 1;
            }
        }
        Arrays.sort(nums);
        int num = Integer.MAX_VALUE;
        for (int j : nums) {
            if (j < num && j > 0) {
                num = j;
            }
        }
        if (num != 1)
            return 1;
        else
            num = 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] - nums[i - 1] > 1 && nums[i - 1] > 0 && nums[i] > 0) {
                num = nums[i - 1];
                break;
            } else {
                num = nums[i];
            }
        }
        return num + 1;
    }
}
