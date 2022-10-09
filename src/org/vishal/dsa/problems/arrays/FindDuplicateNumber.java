package org.vishal.dsa.problems.arrays;

public class FindDuplicateNumber {

    /**
     * Constraints:
     * <p>
     * 1 <= n <= 105
     * nums.length == n + 1
     * 1 <= nums[i] <= n
     * All the integers in nums appear only once except for precisely
     * one integer which appears two or more times.
     * </p>
     */
    public static void main(String[] args) {
        int[] nums = {1, 3, 4, 2, 2, 2};
        System.out.println(findDuplicate(nums));
    }

    private static int findDuplicate(int[] nums) {
        boolean[] has = new boolean[nums.length];
        for (int num : nums) {
            if (has[num - 1]) {
                return num;
            } else {
                has[num - 1] = true;
            }
        }
        return -1;
    }

}
