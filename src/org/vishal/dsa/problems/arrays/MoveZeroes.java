package org.vishal.dsa.problems.arrays;

public class MoveZeroes {

    public static void main(String[] args) {
        int[] nums = {0,1,0,3,12};
        moveZeroes(nums);
    }

    public static void moveZeroes(int[] nums) {
        int n = nums.length;
        if (n < 2) return;
        int left = 0, right = 0;
        while (right < n){
            if (nums[right] == 0){
                right++;
            }else {
                int temp = nums[left];
                nums[left] = nums[right];
                nums[right] = temp;
                right++;
                left++;
            }
        }
    }
}
