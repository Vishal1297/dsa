package org.vishal.dsa.problems.arrays;

import java.util.ArrayList;
import java.util.List;

public class NumbersNotInArray {

    public static void main(String[] args) {
        int[] nums = {4,3,2,7,8,2,3,1};
        System.out.println(findDisappearedNumbers(nums));
    }

    public static List<Integer> findDisappearedNumbers(int[] nums) {
        int[] arr = new int[nums.length + 1];
        for (int num : nums) {
            arr[num] = 1;
        }
        ArrayList<Integer> res = new ArrayList<>();
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] != 1){
                res.add(i);
            }
        }
        return res;
    }
}
