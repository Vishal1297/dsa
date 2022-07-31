package org.vishal.dsa.problems.stacks;

public class MaxNestingDepthOfParentheses {

    public static void main(String[] args) {
        String s = "(1)+((2))+(((3)))";
        System.out.println(maxDepth(s));
    }

    public static int maxDepth(String s) {
        if (s == null || s.isEmpty()) {
            return 0;
        }
        int max = 0, count = 0;
        for (char ch : s.toCharArray()) {
            if (ch == '(') {
                count++;
            } else if (ch == ')') {
                count--;
            }
            if (count > max) {
                max = count;
            }
        }
        return max;
    }
}
