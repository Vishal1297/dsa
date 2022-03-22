package org.vishal.dsa.problems.arrays;

import java.util.ArrayList;
import java.util.List;

public class SpiralMatrix {

    public static void main(String[] args) {
        int[][] matrix = new int[][]{
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 16}
        };

        System.out.println("Input : ");

        for (int[] arr : matrix){
            for (int value: arr){
                System.out.print(value+"\t");
            }
            System.out.println();
        }

        List<Integer> spiralMatrix = solution(matrix);

        System.out.println("\nOutput : " + spiralMatrix);

    }

    private static List<Integer> solution(int[][] matrix) {
        ArrayList<Integer> result = new ArrayList<>();
        int rows = matrix.length;
        int cols = matrix[0].length;
        for(int i=0;i<=rows/2;i++) {
            int j=i,k=i;
            for(;j<cols-i;j++) result.add(matrix[k][j]);
            if(result.size()==rows*cols) break;

            j--;
            k++;

            for(;k<rows-i;k++) result.add(matrix[k][j]);
            if(result.size()==rows*cols) break;

            k--;
            j--;
            for(;j>=i;j--) result.add(matrix[k][j]);
            if(result.size()==rows*cols) break;

            j++;
            k--;
            for(;k>=i+1;k--) result.add(matrix[k][j]);
            if(result.size()==rows*cols) break;
        }
        return result;
    }
}
