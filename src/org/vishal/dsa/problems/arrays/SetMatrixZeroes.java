package org.vishal.dsa.problems.arrays;

import java.util.Arrays;

/**
 * Given an m x n integer matrix,
 * if an element is 0, set its entire row and column to 0's.
 *
 * You must do it in place.
 */
public class SetMatrixZeroes {

    public static void main(String[] args) {
        int[][] matrix = new int[][]{
                {1, 1, 1},
                {1, 0, 1},
                {1, 1, 1}
        };

        System.out.println("Input : ");

        for (int[] arr : matrix){
            for (int value: arr){
                System.out.print(value+"\t");
            }
            System.out.println();
        }
        setZeroes(matrix);

        System.out.println("Output : ");
        for (int[] arr : matrix){
            for (int value: arr){
                System.out.print(value+"\t");
            }
            System.out.println();
        }
    }

    public static void setZeroes(int[][] matrix) {
        boolean isCol = false;
        for (int i = 0; i < matrix.length; i++) {
            if (matrix[i][0] == 0) {
                isCol = true;
            }
            for (int j = 1; j < matrix[0].length; j++) {
                if (matrix[i][j] == 0){
                    matrix[0][j] = 0;
                    matrix[i][0] = 0;
                }
            }
        }
        for (int i = 1; i < matrix.length; i++) {
            for (int j = 1; j < matrix[0].length; j++) {
                if (matrix[i][0] == 0 || matrix[0][j] == 0) {
                    matrix[i][j] = 0;
                }
            }
        }
        if (matrix[0][0] == 0) {
            Arrays.fill(matrix[0], 0);
        }
        if (isCol) {
            for (int i = 0; i < matrix.length; i++) {
                matrix[i][0] = 0;
            }
        }
    }
}
