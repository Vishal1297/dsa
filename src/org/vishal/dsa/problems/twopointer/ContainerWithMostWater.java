package org.vishal.dsa.problems.twopointer;

public class ContainerWithMostWater {

    public static void main(String[] args) {
        int[] arr = {1, 8, 6, 2, 5, 4, 8, 3, 7};
        System.out.println(maxArea(arr));
    }

    public static int maxArea(int[] height) {
        int length = height.length;
        int leftPtr = 0, rightPtr = length - 1;
        int maxArea = 0;
        while (leftPtr < rightPtr) {
            if (height[leftPtr] < height[rightPtr]){
                maxArea = Math.max(maxArea, height[leftPtr] * (rightPtr - leftPtr));
                leftPtr++;
            }else {
                maxArea = Math.max(maxArea, height[rightPtr] * (rightPtr - leftPtr));
                rightPtr--;
            }
        }
        return maxArea;
    }
}
