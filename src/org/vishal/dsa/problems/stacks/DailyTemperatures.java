package org.vishal.dsa.problems.stacks;

import java.util.Stack;

public class DailyTemperatures {

    public static void main(String[] args) {
        int[] temperatures = {73, 74, 75, 71, 69, 72, 76, 73};
        int[] result = dailyTemperatures(temperatures);
        for (long val : result) {
            System.out.print(val + " ");
        }
        System.out.println();
    }

    public static int[] dailyTemperatures(int[] temperatures) {
        int[] result = new int[temperatures.length];
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < temperatures.length; i++) {
            while (!stack.isEmpty() && temperatures[stack.peek()] < temperatures[i]) {
                int temp = stack.pop();
                result[temp] = i - temp;
            }
            stack.push(i);
        }
        return result;
    }
}
