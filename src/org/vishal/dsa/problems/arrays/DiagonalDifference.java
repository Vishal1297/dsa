package org.vishal.dsa.problems.arrays;

import java.util.Arrays;
import java.util.List;

public class DiagonalDifference {

    public static void main(String[] args) {
        List<List<Integer>> arr = Arrays.asList(
                Arrays.asList(11, 2, 4),
                Arrays.asList(4, 5, 6),
                Arrays.asList(10, 8, -12)
        );
        System.out.println(diagonalDifference(arr));
    }

    /**
     * Input
     * 3
     * 11 2 4
     * 4 5 6
     * 10 8 -12
     *
     * Output
     * 15
     */
    public static int diagonalDifference(List<List<Integer>> arr) {
        int leftSum = 0, rightSum = 0;
        for (int i = 0; i < arr.size(); i++) {
            leftSum += arr.get(i).get(i);
            rightSum += arr.get(arr.size() - i - 1).get(i);
        }
        return Math.abs(leftSum - rightSum);
    }
}
