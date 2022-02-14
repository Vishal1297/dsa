package org.vishal.dsa.problems.arrays;

public class KeyInSegment {
    public static void main(String[] args) {
        int arr[] = { 3, 5, 2, 4, 9, 3, 1, 7, 3, 11, 12, 3 };
        int k = 3;
        int x = 3;
        System.out.println(isFound(arr, k, x));
    }
    
    //  O(n^2)
    public static boolean isFound(int[] arr, int key, int segementSize) {
        boolean found = false;
        for (int i = 0; i < arr.length; i = i + segementSize) {
            boolean curr = false;
            for (int j = i; j < arr.length && j < segementSize + i; j++) {
                if (key == arr[j]) {
                    curr = true;
                }
            }
            if (curr) {
                found = true;
            } else {
                found = false;
                break;
            }
        }
        return found;
    }

}