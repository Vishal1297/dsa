package org.vishal.dsa.problems.twopointer;

public class SortByParity {

    public static void main(String[] args) {
        int[] nums = {3, 1, 2, 4};
        sortArrayByParity(nums);
        for (int num : nums){
            System.out.print(num + " ");
        }
    }

    public static void sortArrayByParity(int[] nums) {
        int length = nums.length;
        if (length <= 1) return;
        int leftPtr = 0, rightPtr = length - 1;
        while (leftPtr < rightPtr) {
            if (nums[leftPtr] % 2 != 0 && nums[rightPtr] % 2 == 0) {
                nums[leftPtr] = nums[leftPtr] + nums[rightPtr];
                nums[rightPtr] = nums[leftPtr] - nums[rightPtr];
                nums[leftPtr] = nums[leftPtr] - nums[rightPtr];
                leftPtr++;
                rightPtr--;
            } else if (nums[leftPtr] % 2 == 0) {
                leftPtr++;
            } else if (nums[rightPtr] % 2 != 0) {
                rightPtr--;
            } else {
                leftPtr++;
                rightPtr--;
            }
        }
    }
}
