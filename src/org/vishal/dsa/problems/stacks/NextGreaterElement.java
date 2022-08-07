package org.vishal.dsa.problems.stacks;

import java.util.Stack;

public class NextGreaterElement {

    public static void main(String[] args) {
        long[] arr = {1, 3, 2, 4};
        int N = 4;
        long[] result = nextLargerElement(arr, N);
        for (long val : result) {
            System.out.print(val + " ");
        }
        System.out.println();
    }

    public static long[] nextLargerElement(long[] arr, int n) {
        if (n == 1) {
            return new long[]{-1};
        }
        long[] result = new long[n];
        Stack<Long> stack = new Stack<>();
        for (int i = n - 1; i >= 0; i--) {
            if (stack.isEmpty()) {
                result[i] = -1;
            } else {
                while (!stack.isEmpty()) {
                    if (stack.peek() > arr[i]) {
                        result[i] = stack.peek();
                        break;
                    } else {
                        stack.pop();
                    }
                }
                if (stack.isEmpty()) {
                    result[i] = -1;
                }
            }
            stack.push(arr[i]);
        }
        return result;
    }
}
