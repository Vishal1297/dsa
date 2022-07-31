package org.vishal.dsa.problems.stacks;

import java.util.Stack;

public class RemoveOuterMostParentheses {

    public static void main(String[] args) {
        String s = "(()()())(()())";
        System.out.println(removeOuterParentheses(s));
    }

    public static String removeOuterParentheses(String s) {
        Stack<Character> stack = new Stack<>();
        int count = 0;
        StringBuilder result = new StringBuilder();
        for (char ch : s.toCharArray()) {
            if (ch == '(' && count == 0) {
                stack.push(ch);
                count++;
            }else if (ch == '(') {
                stack.push(ch);
                count++;
                result.append("(");
            }else {
                stack.pop();
                count--;
                if (count > 0) result.append(")");
            }
        }
        return result.toString();
    }
}
