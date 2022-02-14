package org.vishal.dsa.problems.arrays;

import java.util.Arrays;

public class SquaresOfSortedArray {

    public static void main(String[] args) {
        int[] nums = {-7, -3, 2, 3, 11};
        int[] result = sortedSquares(nums);
        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i]);
        }
    }
    
    public static int[] sortedSquares(int[] nums) {
        return Arrays.stream(nums).map(e -> e * e).sorted().toArray();
    }
}