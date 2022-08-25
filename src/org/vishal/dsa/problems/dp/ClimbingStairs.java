package org.vishal.dsa.problems.dp;

import java.util.HashMap;
import java.util.Map;

public class ClimbingStairs {

    public static void main(String[] args) {
        System.out.println(climbStairs(5));
    }

    public static int climbStairs(int n) {
        Map<Integer, Integer> memo = new HashMap<>();
        return compute(n, memo);
    }

    public static int compute(int n, Map<Integer, Integer> memo) {
        if (memo.containsKey(n)) return n;
        if (n == 0 || n == 1) return 1;
        return memo.computeIfAbsent(n, k -> compute(n - 1, memo) + compute(n - 2, memo));
    }

}
