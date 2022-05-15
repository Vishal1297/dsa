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
        int[] nums = {4, 1, 2, 1, 2};
        System.out.println(singleNumber(nums));
    }

    public static int singleNumber(int[] nums) {
        int length = nums.length;
        if (length == 1) return nums[0];
        HashSet<Integer> unique = new HashSet<>();
        for (int i = 0; i < length; i++) {
            if(unique.contains(nums[i])){
                unique.remove(nums[i]);
            }else {
                unique.add(nums[i]);
            }
        }
        for (int num : unique){
            return num;
        }
        return -1;
    }
}
