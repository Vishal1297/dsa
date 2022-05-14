package org.vishal.dsa.problems.arrays;

import java.util.HashMap;

public class MajorityElement {

    public static void main(String[] args) {
        int[] nums = {2,2,1,1,1,2,2};
        System.out.println(majorityElement(nums));
    }

    public static int majorityElement(int[] nums) {
        HashMap<Integer, Integer> intFreq = new HashMap<>();
        for (int num : nums){
            intFreq.put(num, intFreq.getOrDefault(num, 0) + 1);
        }
        int maxKey = Integer.MIN_VALUE, value = Integer.MIN_VALUE;
        for (int key : intFreq.keySet()){
            if (intFreq.get(key) > value){
                value = intFreq.get(key);
                maxKey = key;
            }
        }
        return maxKey;
    }
}
