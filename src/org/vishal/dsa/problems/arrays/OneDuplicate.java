package org.vishal.dsa.problems.arrays;

import java.util.Arrays;

public class OneDuplicate {
    /*
        Constraints:
        2 <= n <= 3 * 104
        nums.length == n + 1
        1 <= nums[i] <= n
        All the integers in nums appear only once except for precisely 
        one integer which appears two or more times.
    */

    public static void main(String[] args) {
        int[] input = { 1, 3, 4, 2, 2, 2 };
        System.out.println(getDuplicate(input));
    }

    private static int getDuplicate(int[] input) {
        int n = input.length;
        if (n < 2) {
            throw new IllegalArgumentException("Invalid Input");
        }
        Arrays.sort(input);
        for (int i = 1; i < input.length; i++) {
            if (input[i] == input[i - 1]) {
                return input[i];
            }
        }
        return -1;
    }
    
}
