package org.vishal.dsa.problems.hashtable;

public class MinPathSum {

    public static void main(String[] args) {
        int[][] grid = {{1, 3, 1}, {1, 5, 1}, {4, 2, 1}};
        System.out.println(minPathSum(grid));
    }

    public static int minPathSum(int[][] grid) {
        int i = grid.length, j = grid[0].length;
        Integer[][] pathSum = new Integer[i][j];
        return path(grid, i - 1, j - 1, pathSum);
    }

    public static Integer path(int[][] grid, int i, int j, Integer[][] pathSum) {
        if (i < 0 || j < 0) {
            return Integer.MAX_VALUE;
        }
        if (i == 0 && j == 0) return grid[i][j];
        if (pathSum[i][j] != null) return pathSum[i][j];
        return pathSum[i][j] = grid[i][j] + Math.min(path(grid, i - 1, j, pathSum), path(grid, i, j - 1, pathSum));
    }
}
