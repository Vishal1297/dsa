package org.vishal.dsa.problems.sortings;

import java.util.Arrays;
import java.util.Comparator;

public class MinOfArrowsToBurstBalloons {

    public static void main(String[] args) {
        int[][] points = {{10, 16}, {2, 8}, {1, 6}, {7, 12}};
        System.out.println(findMinArrowShots(points));
    }

    public static int findMinArrowShots(int[][] points) {
        Arrays.sort(points, Comparator.comparingInt(a -> a[1]));
        int result = 1, previous = 0;
        for (int curr = 0; curr < points.length; curr++) {
            if (points[curr][0] > points[previous][1]) {
                result++;
                previous = curr;
            }
        }
        return result;
    }
}
