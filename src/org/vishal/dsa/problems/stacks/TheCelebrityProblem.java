package org.vishal.dsa.problems.stacks;

import java.util.Stack;

public class TheCelebrityProblem {

    public static void main(String[] args) {
        int[][] M = {{0, 1, 0},
                {0, 0, 0},
                {0, 1, 0}};
        System.out.println(celebrity(M, M.length));
    }

    public static int celebrity(int[][] M, int n) {
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < n; i++) {
            stack.push(i);
        }
        while (!stack.isEmpty() && stack.size() > 1) {
            int firstTop = stack.pop();
            int secondTop = stack.pop();
            if (M[secondTop][firstTop] == 0) {
                stack.push(secondTop);
            } else if (M[firstTop][secondTop] == 0) {
                stack.push(firstTop);
            }
        }
        boolean row = false;
        for (int i = 0; i < n; i++) {
            if (M[stack.peek()][i] == 0) {
                row = true;
            } else {
                row = false;
                break;
            }
        }
        boolean col = false;
        if (row) {
            for (int i = 0; i < n; i++) {
                if (stack.peek() != i) {
                    if (M[i][stack.peek()] == 1) {
                        col = true;
                    } else {
                        col = false;
                        break;
                    }
                }
            }
        }
        return !row ? -1 : col ? stack.peek() : -1;
    }
}
