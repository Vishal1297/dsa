package org.vishal.dsa.problems.arrays;

public class RotateImage {

    public static void main(String[] args) {
        int[][] arr = new int[][]{
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        System.out.println("Input : ");

        for (int[] ints : arr) {
            for (int anInt : ints) {
                System.out.print(anInt + "\t");
            }
            System.out.println();
        }
        rotate(arr);

        System.out.println("Output : ");

        for (int[] ints : arr) {
            for (int anInt : ints) {
                System.out.print(anInt + "\t");
            }
            System.out.println();
        }
    }

    public static void rotate(int[][] arr) {
        int n = arr.length;
        for (int i = 0; i < (n + 1) / 2; i++) {
            for (int j = 0; j < (n / 2); j++) {
                int temp = arr[n - 1 - j][i];
                arr[n - 1 - j][i] = arr[n - 1 - i][n - j - 1];
                arr[n - 1 - i][n - j - 1] = arr[j][n - 1 - i];
                arr[j][n - 1 - i] = arr[i][j];
                arr[i][j] = temp;
            }
        }
    }
}