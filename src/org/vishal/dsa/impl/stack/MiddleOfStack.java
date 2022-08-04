package org.vishal.dsa.impl.stack;

public class MiddleOfStack {

    static class StackNode {
        StackNode prev;
        int data;
        StackNode next;

        public StackNode(int data) {
            this.data = data;
        }
    }

    StackNode head = null;
    StackNode prev = null;
    StackNode next = null;
    StackNode mid = null;
    int size = 0;

    public MiddleOfStack() {
        super();
    }

    public void push(int data) {
        StackNode node = new StackNode(data);
        if (size == 0) {
            head = node;
            mid = node;
        } else {
            head.next = node;
            node.prev = head;
            head = head.next;
            if (size % 2 != 0) {
                mid = mid.next;
            }
        }
        size++;
    }

    public int pop() {
        int data = -1;
        if (size == 0) {
            throw new IllegalStateException("Stack is emtpy.");
        } else {
            if (size == 1) {
                head = null;
                mid = null;
            } else {
                data = head.data;
                head = head.prev;
                head.next = null;
                if (size % 2 == 0) {
                    mid = mid.prev;
                }
            }
            size--;
        }
        return data;
    }

    public int getSize() {
        return size;
    }

    public int getMid() {
        if (mid == null) {
            throw new IllegalStateException("Stack is emtpy.");
        }
        return mid.data;
    }

    public int peek() {
        if (head == null) {
            throw new IllegalStateException("Stack is emtpy.");
        }
        return head.data;
    }

    public void deleteMiddleElement() {
        if (size != 0) {
            if (size == 1) {
                head = null;
                mid = null;
            } else if (size == 2) {
                head = head.prev;
                mid = mid.prev;
                head.next = null;
            } else {
                mid.prev.next = mid.next;
                mid.next.prev = mid.prev;

                if (size % 2 == 0) {
                    mid = mid.prev;
                } else {
                    mid = mid.next;
                }
            }
            size--;
        }
    }

    public static void main(String[] args) {
        MiddleOfStack ms = new MiddleOfStack();
        ms.push(11);
        ms.push(22);
        System.out.println("Middle Element : " + ms.getMid());
        ms.push(33);
        ms.push(44);

        System.out.println("Popped : " + ms.pop());
        System.out.println("Popped : " + ms.pop());
        System.out.println("Middle Element : " + ms.getMid());

        ms.deleteMiddleElement();

        System.out.println("New Middle Element : " + ms.getMid());
    }
}

