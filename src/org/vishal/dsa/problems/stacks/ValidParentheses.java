package org.vishal.dsa.problems.stacks;

import java.util.Stack;

public class ValidParentheses {

    public static void main(String[] args) {
        String s = "[]{{}}";
        System.out.println(isValid(s));
    }

    public static boolean isValid(String s) {
        if (s == null || s.isEmpty()) return false;
        Stack<Character> stack = new Stack<>();
        for (char ch : s.toCharArray()) {
            if (ch == '(' || ch == '[' || ch == '{') {
                stack.push(ch);
            }else {
                if (stack.isEmpty()) {
                    stack.push(ch);
                }else {
                    if (ch == ')') {
                        if (stack.peek() != '(') return false;
                        stack.pop();
                    } else if (ch == ']') {
                        if (stack.peek() != '[') return false;
                        stack.pop();
                    } else if (ch == '}') {
                        if (stack.peek() != '{') return false;
                        stack.pop();
                    }
                }
            }
        }
        return stack.isEmpty();
    }

}
