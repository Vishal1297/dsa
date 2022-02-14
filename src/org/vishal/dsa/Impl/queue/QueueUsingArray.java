package org.vishal.dsa.Impl.queue;

// Queue Implementation Using Arrays
class QueueUsingArray {

    private int size = 10;
    private Object[] queue = new Object[size];
    private int frontIndex = 0;
    private int rearIndex = 0;

    public void enQueue(Object element) {
        if (isFull()) {
            System.out.println("Queue is full.");
        } else {
            queue[rearIndex] = element;
            rearIndex++;
        }
    }

    public Object deQueue() {
        if (isEmpty()) {
            System.out.println("Queue is empty.");
            return -1;
        } else {
            Object obj = queue[frontIndex];
            queue[frontIndex] = 0;
            frontIndex++;
            return obj;
        }
    }

    public Object peek(int position) {
        if (queue[position] == null) {
            System.out.print("No Element At " + position + " ");
            return -1;
        } else {
            if (position == frontIndex)
                return queue[position];
            else {
                return queue[frontIndex + position - 1];
            }
        }
    }

    public Object getFirst() {
        return queue[frontIndex];
    }

    public Object getLast() {
        return queue[rearIndex];
    }

    public boolean isEmpty() {
        return rearIndex <= 0;
    }

    public boolean isFull() {
        return rearIndex + 1 == size;
    }

    public void printQueue() {
        for (int index = frontIndex; index < rearIndex; index++) {
            System.out.print(queue[index] + " ");
        }
        System.out.println();
    }

}
