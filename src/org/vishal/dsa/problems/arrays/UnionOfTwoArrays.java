package org.vishal.dsa.problems.arrays;

import java.util.HashSet;
import java.util.Set;

public class UnionOfTwoArrays {

    public static void main(String[] args) {
        int[] arr1 = {85, 25, 1, 32, 54, 6};
        int[] arr2 = {85, 2};
        System.out.println(doUnion(arr1, arr1.length, arr2, arr2.length));
    }

    public static int doUnion(int[] a, int n, int[] b, int m) {
        Set<Integer> tempSet = new HashSet<>();
        for (int num : a) {
            tempSet.add(num);
        }
        for (int num : b) {
            tempSet.add(num);
        }
        return tempSet.size();
    }

}
