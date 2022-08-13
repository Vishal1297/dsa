package org.vishal.dsa.problems.stacks;

import java.util.Stack;

public class RemoveAllAdjDuplicatesInString {

    public static void main(String[] args) {
        String s = "abbaca";
        System.out.println(removeDuplicates(s));
    }

    public static String removeDuplicates(String s) {
        Stack<Character> stack = new Stack<>();
        for (int i = s.length() - 1; i >= 0; i--) {
            char ch = s.charAt(i);
            if (stack.isEmpty()) stack.push(ch);
            else {
                if (stack.peek() == ch) {
                    stack.pop();
                } else {
                    stack.push(ch);
                }
            }
        }
        StringBuilder sb = new StringBuilder();
        while (!stack.isEmpty()) {
            sb.append(stack.pop());
        }
        return sb.toString();
    }
}
