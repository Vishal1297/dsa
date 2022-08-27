package org.vishal.dsa.problems.arrays;

import java.util.HashSet;

/**
 * Given a non-empty array of integers nums, every element appears
 * twice except for one. Find that single one.
 * <p>
 * You must implement a solution with a linear runtime complexity
 * and use only constant extra space.
 */
public class SingleNumber {

    public static void main(String[] args) {
        int[] nums = {4, 1, 4, 1, 2};
        System.out.println(singleNumberV2(nums));
    }

    public static int singleNumber(int[] nums) {
        int length = nums.length;
        if (length == 1) return nums[0];
        HashSet<Integer> unique = new HashSet<>();
        for (int j : nums) {
            if (unique.contains(j)) {
                unique.remove(j);
            } else {
                unique.add(j);
            }
        }
        for (int num : unique) {
            return num;
        }
        return -1;
    }

    public static int singleNumberV2(int[] nums) {
        int result = 0;
        for (int num : nums) {
            result = result ^ num;
        }
        return result;
    }
}
