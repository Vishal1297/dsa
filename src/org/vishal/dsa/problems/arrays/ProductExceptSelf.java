package org.vishal.dsa.problems.arrays;

public class ProductExceptSelf {

    public static void main(String[] args) {
        int[] nums = {0, 4, 0};
        int[] result = productExceptSelf(nums);
        for (int num : result) {
            System.out.print(num + " ");
        }
    }

    public static int[] productExceptSelf(int[] nums) {
        int[] res = new int[nums.length];
        res[0] = 1;
        for (int i = 1; i < nums.length; i++) {
            res[i] = res[i - 1] * nums[i - 1];
        }
        int temp = 1;
        for (int i = nums.length - 1; i >= 0; i--) {
            res[i] = res[i] * temp;
            temp = temp * nums[i];
        }
        return res;
    }
}
