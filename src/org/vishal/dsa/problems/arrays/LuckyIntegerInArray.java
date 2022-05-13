package org.vishal.dsa.problems.arrays;

import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

public class LuckyIntegerInArray {

    public static void main(String[] args) {
        int[] arr = {2, 2, 3, 4};
        System.out.println(findLucky(arr));
    }

    public static int findLucky(int[] arr) {
        HashMap<Integer, Integer> freq = new HashMap<>();
        for (int num : arr){
            int prev = freq.getOrDefault(num, 0);
            freq.put(num, prev + 1);
        }
        List<Integer> sortedList = freq.keySet()
                .stream()
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toList());

        for (int num : sortedList){
            if (num == freq.getOrDefault(num, -1)){
                return num;
            }
        }
        return -1;
    }

}
