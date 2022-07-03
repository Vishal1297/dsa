package org.vishal.dsa.impl.stack;

// Stack Implementation Using Arrays
class Stack {

    private int size = 5;
    private final int[] stack = new int[size];
    private int stackSize = 0;

    public void setSize(int size) {
        this.size = size;
    }

    public Object push(Object element) {
        if (isFull()) {
            System.out.println("Stack Overflow while adding $element");
            return -1;
        } else
            return stack[stackSize++] = (int) element;
    }

    public Object pop() {
        if (isEmpty()) {
            System.out.println("Stack Underflow");
            return 0;
        }
        int lastIndex = stack.length - 1;
        int lastElement = stack[lastIndex];
        stack[lastIndex] = 0;
        stackSize--;
        return lastElement;
    }

    public Object peek() {
        if (isEmpty())
            return "Stack is Empty";
        else
            return stack[stackSize - 1];
    }

    public int search(Object element) {
        for (int index = 0; index < stackSize; index++) {
            if (element.equals(stack[index]))
                return index;
        }
        return -1;
    }

    public boolean isFull() {
        return stackSize >= stack.length;
    }

    public boolean isEmpty() {
        return stackSize <= 0;
    }

    public void printStack() {
        for (int index = 0; index < stackSize; index++)
            System.out.println(stack[index] + " ");
        System.out.println();
    }
}