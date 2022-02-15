package org.vishal.dsa.problems.arrays;

/**
 * You are given an array arr[], you have to re-construct an array arr[].
 * The values in arr[] are obtained by doing Xor of consecutive elements in the array.
 *
 * Input : arr[ ] = {10, 11, 1, 2, 3}
 *
 * Output : 1 10 3 1 3
 *
 * Explanation:
 * At index 0, arr[0] xor arr[1] = 1
 * At index 1, arr[1] xor arr[2] = 10
 * At index 2, arr[2] xor arr[3] = 3
 * ...
 * At index 4, No element is left So, it will remain as it is.
 *
 * New Array will be {1, 10, 3, 1, 3}.
 */
public class GameWithNos {

    public static void main(String[] args) {
        int[] arr = {10, 11, 1, 2, 3};
        getXORsUsingOperator(arr, arr.length);
//        getXORsUsingOtherOperators(arr, arr.length);
        for (int num : arr){
            System.out.print(num+"\t");
        }
    }

    public static void getXORsUsingOperator(int[] arr, int n){
        for (int i = 0; i <n ; i++) {
            if (i + 1 < n){
                arr[i] = arr[i] ^ arr[i+1];
            }
        }
    }

    public static void getXORsUsingOtherOperators(int[] arr, int n){
        for (int i = 0; i <n ; i++) {
            if (i + 1 < n){
                arr[i] = (arr[i] | arr[i+1]) - (arr[i] & arr[i+1]);
            }
        }
    }
}
