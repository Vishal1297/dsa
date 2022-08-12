package org.vishal.dsa.problems.stacks;

import java.util.Stack;

public class InsertAtEndOfStack {

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        for (int i = 1; i <= 5; i++) {
            stack.push(i);
        }

        insertAtEnd(stack, 100);

        System.out.println("Output : \n" + stack);
    }

    public static void insertAtEnd(Stack<Integer> stack, Integer element) {
        System.out.println("Insert at end : " + stack);
        if (stack.isEmpty()) {
            stack.push(element);
        } else {
            int popped = stack.pop();
            insertAtEnd(stack, element);
            stack.push(popped);
        }
    }

}