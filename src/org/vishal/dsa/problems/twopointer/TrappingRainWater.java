package org.vishal.dsa.problems.twopointer;

public class TrappingRainWater {

    public static void main(String[] args) {
        int[] height = {0,1,0,2,1,0,1,3,2,1,2,1};
        System.out.println(trap(height));
    }

    public static int trap(int[] height) {
        int length = height.length;
        if (length <= 1) return 0;
        int left = 0, right = length - 1;
        int leftMax = 0, rightMax = 0;
        int result = 0;
        while (left < right) {
            if (height[left] < height[right]) {
                if (height[left] >= leftMax) {
                    leftMax = height[left];
                } else result += (leftMax - height[left]);
                left++;
            } else {
                if (height[right] >= rightMax) {
                    rightMax = height[right];
                } else result += (rightMax - height[right]);
                right--;
            }
        }
        return result;
    }
}
