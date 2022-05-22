package org.vishal.dsa.problems.twopointer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum {

    public static void main(String[] args) {
        int[] nums = {-1, 0, 1, 2, -1, -4};
        List<List<Integer>> result = threeSum(nums);
        System.out.println(result);
    }

    public static List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        int length = nums.length;
        List<List<Integer>> result = new ArrayList<>();
        for (int i = 0; i < length - 2; i++) {
            if (i == 0 || (i > 0 && nums[i] != nums[i - 1])){
                int left = i + 1, right = length - 1;
                int sum = -nums[i];
                while (left < right){
                    if (nums[left] + nums[right] == sum){
                        result.add(Arrays.asList(nums[i], nums[left], nums[right]));
                        while (left < right && nums[left] == nums[left + 1]){
                            left++;
                        }
                        while (left < right && nums[right - 1] == nums[right]){
                            right--;
                        }
                        left++;
                        right--;
                    }else if (nums[left] + nums[right] > sum){
                        right--;
                    }else {
                        left++;
                    }
                }
            }
        }
        return result;
    }
}
