package org.vishal.dsa.problems.stacks;

import java.util.Stack;

public class BackspaceStringCompare {

    public static void main(String[] args) {
        String s = "y#fo##f";
        String t = "y#f#o##f";
        System.out.println(backspaceCompare(s, t));
    }

    public static boolean backspaceCompare(String s, String t) {
        return build(s).equals(build(t));
    }

    public static String build(String s) {
        Stack<Character> stack = new Stack<>();
        for (char ch : s.toCharArray()) {
            if (ch == '#') {
                if (!stack.isEmpty()) stack.pop();
            }else {
                stack.push(ch);
            }
        }
        return String.valueOf(stack);
    }
}
