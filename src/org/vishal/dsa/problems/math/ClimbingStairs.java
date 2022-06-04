package org.vishal.dsa.problems.math;

import java.util.HashMap;
import java.util.Map;

public class ClimbingStairs {

    public static void main(String[] args) {
        System.out.println(climbStairs(5));
    }

    public static int climbStairs(int n) {
        Map<Integer, Integer> memo = new HashMap<>();
        return r(n, memo);
    }

    public static int r(int n, Map<Integer, Integer> memo) {
        if (memo.containsKey(n)) {
            return memo.get(n);
        }
        if (n == 0 || n == 1) {
            return 1;
        }
        int v1 = r(n - 1, memo);
        int v2 = r(n - 2, memo);
        return memo.computeIfAbsent(n, (k) -> v1 + v2);
    }
}
