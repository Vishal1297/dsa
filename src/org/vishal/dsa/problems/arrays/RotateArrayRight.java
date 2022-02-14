package org.vishal.dsa.problems.arrays;

public class RotateArrayRight {

    public static void main(String[] args) {
        int[] input = {8, 3, -4, 11, 4, 0};
        int rotateValue = 3;

        rotate(input, rotateValue);

        for (int val : input) {
            System.out.print(val + " ");
        }

        System.out.println();
    }

    public static void rotate(int[] nums, int k) {
        k %= nums.length;
        reverse(nums, 0, nums.length - 1);
        reverse(nums, 0, k - 1);
        reverse(nums, k, nums.length - 1);
    }

    public static void reverse(int[] nums, int start, int end) {
        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }
}
