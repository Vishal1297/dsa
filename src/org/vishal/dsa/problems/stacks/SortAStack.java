package org.vishal.dsa.problems.stacks;

import java.util.Stack;

public class SortAStack {

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        for (int i = 5; i >= 1; i--) {
            int rnd = (int) (Math.random() * 10);
            stack.push(rnd);
        }
        System.out.println("Input :\n" + stack);
        System.out.println("Output :\n" + sort(stack));
        System.out.println("Stack Top :\n" + stack.peek());
    }

    public static Stack<Integer> sort(Stack<Integer> s) {
        if (s.size() < 2) return s;
        int top = s.pop();
        sort(s);
        insert(s, top);
        return s;
    }

    public static void insert(Stack<Integer> stack, Integer top) {
        if (stack.isEmpty()) {
            stack.push(top);
            return;
        }
        int popped = stack.pop();
        insert(stack, popped >= top ? top : popped);
        stack.push(popped >= top ? popped : top);
    }
}
