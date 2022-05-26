package org.vishal.dsa.problems.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MinAbsoluteDifference {

    public static void main(String[] args) {
        int[] arr = {40,11,26,27,-20};
        List<List<Integer>> result = minimumAbsDifference(arr);
        for (List<Integer> list : result){
            for (int num : list){
                System.out.print(num + "\t");
            }
            System.out.println();
        }
    }

    public static List<List<Integer>> minimumAbsDifference(int[] arr) {
        Arrays.sort(arr);
        int length = arr.length;
        if (length < 2) return new ArrayList<>();
        int minDiff = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length - 1; ++i) {
            minDiff = Math.min(minDiff, arr[i + 1] - arr[i]);
        }
        List<List<Integer>> result = new ArrayList<>();
        for (int i = 0; i < arr.length - 1; ++i) {
            if (arr[i + 1] - arr[i] == minDiff) {
                result.add(Arrays.asList(arr[i], arr[i + 1]));
            }
        }
        return result;
    }
}
