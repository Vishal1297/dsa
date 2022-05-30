package org.vishal.dsa.problems.arrays;

public class SearchInSortedArray {

    public static void main(String[] args) {
        int[] nums = {1, 3};
        int target = 3;
        System.out.println(search(nums, target));
    }

    public static int search(int[] nums, int target) {
        if (nums == null || nums.length == 0) return -1;
        int leftPtr = 0, rightPtr = nums.length - 1;
        while (leftPtr < rightPtr){
            int mid = leftPtr + (rightPtr - leftPtr) / 2;
            if (nums[mid] > nums[rightPtr]){
                leftPtr = mid + 1;
            } else {
                rightPtr = mid;
            }
        }
        int start = leftPtr;
        leftPtr = 0;
        rightPtr = nums.length - 1;

        if (target >= nums[start] && target <= nums[rightPtr]){
            leftPtr = start;
        }else {
            rightPtr = start;
        }

        while (leftPtr <= rightPtr){
            int mid = leftPtr + (rightPtr - leftPtr) / 2;
            if (target == nums[mid]){
                return mid;
            } else if (target > nums[mid]){
                leftPtr = mid + 1;
            }else {
                rightPtr = mid - 1;
            }
        }
        return -1;
    }
}
