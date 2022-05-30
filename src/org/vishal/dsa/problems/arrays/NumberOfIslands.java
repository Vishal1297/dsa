package org.vishal.dsa.problems.arrays;

public class NumberOfIslands {

    public static void main(String[] args) {
        char[][] grid = new char[][]{
                {'1', '1', '0', '0', '0'},
                {'1', '1', '0', '0', '0'},
                {'0', '0', '1', '0', '0'},
                {'0', '0', '0', '1', '1'}
        };
        System.out.println(numIslands(grid));
    }

    public static int numIslands(char[][] grid) {
        int count = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] != 'X' && grid[i][j] == '1'){
                    findIslands(grid, i , j);
                    count++;
                }
            }
        }
        return count;
    }

    public static void findIslands(char[][] grid, int i , int j){
        if (i < 0 || i >= grid.length || j < 0 || j >= grid[0].length || grid[i][j] == '0' || grid[i][j] == 'X'){
            return;
        }
        grid[i][j] = 'X';
        findIslands(grid, i + 1, j);
        findIslands(grid, i - 1, j);
        findIslands(grid, i, j + 1);
        findIslands(grid, i, j - 1);
    }
}
