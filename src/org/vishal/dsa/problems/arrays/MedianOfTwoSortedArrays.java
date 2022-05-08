package org.vishal.dsa.problems.arrays;

public class MedianOfTwoSortedArrays {

    public static void main(String[] args) {
        int[] nums1 = {1, 2};
        int[] nums2 = {3, 4};
        System.out.println(findMedianSortedArrays(nums1, nums2));
    }

    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n = nums1.length;
        int m = nums2.length;
        int[] merged = new int[m + n];
        int firstPtr = 0, secondPtr = 0, resultIndex = 0;

        while (firstPtr < n && secondPtr < m) {
            if (nums1[firstPtr] < nums2[secondPtr]) {
                merged[resultIndex++] = nums1[firstPtr++];
            }else {
                merged[resultIndex++] = nums2[secondPtr++];
            }
        }

        while (firstPtr < n) {
            merged[resultIndex++] = nums1[firstPtr++];
        }
        while (secondPtr < m) {
            merged[resultIndex++] = nums2[secondPtr++];
        }

        int index = (m + n) / 2;

        double result;
        if ((m + n) % 2 == 0) {
            result = ((double)merged[index] + (double)merged[index - 1]) / (double)2;
        }else {
            result = merged[index];
        }
        return result;
    }
}
