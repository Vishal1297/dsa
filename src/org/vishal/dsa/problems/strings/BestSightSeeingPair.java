package org.vishal.dsa.problems.strings;

public class BestSightSeeingPair {

    public static void main(String[] args) {
        int[] values = {8, 1, 5, 2, 6};
        System.out.println(maxScoreSightseeingPair(values));
    }

    public static int maxScoreSightseeingPair(int[] values) {
        int maxi = values[0];
        int ans = Integer.MIN_VALUE;
        for (int i = 1; i < values.length; i++) {
            maxi = Math.max(maxi, values[i - 1] + i - 1);
            ans = Math.max(ans, maxi + values[i] - i);
        }
        return ans;
    }
}