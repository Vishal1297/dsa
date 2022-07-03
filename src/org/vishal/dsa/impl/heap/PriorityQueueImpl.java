package org.vishal.dsa.impl.heap;

import java.util.ArrayList;

public class PriorityQueueImpl<T extends Comparable<T>> {

    private final ArrayList<T> heap;

    public PriorityQueueImpl() {
        this.heap = new ArrayList<>();
    }

    private int parent(int i) {
        return (i - 1) / 2;
    }

    private int leftChild(int i) {
        return (i * 2) + 1;
    }

    private int rightChild(int i) {
        return (i * 2) + 2;
    }

    private boolean isLeafNode(int index) {
        return rightChild(index) >= getSize() || leftChild(index) >= getSize();
    }

    public void add(T element) {
        heap.add(element);
        heapifyUp(heap.size() - 1);
    }

    private void heapifyUp(int index) {
        if (index == 0) return;
        if (heap.get(parent(index)).compareTo(heap.get(index)) > 0){
            swap(index, parent(index));
            heapifyUp(parent(index));
        }
    }

    public T remove() {
        if (getSize() == 0) return (T) new Integer(-1);
        swap(0, getSize() - 1);
        T popped = heap.get(getSize() - 1);
        heap.remove(popped);
        heapifyDown(0);
        return popped;
    }

    private void heapifyDown(int parentIndex) {
        int minIndex = parentIndex;
        int leftIndex = leftChild(parentIndex);
        if ((leftIndex < getSize() && heap.get(minIndex).compareTo(heap.get(leftIndex)) > 0)){
            minIndex = leftIndex;
        }

        int rightIndex = rightChild(parentIndex);
        if (rightIndex < getSize() && heap.get(minIndex).compareTo(heap.get(rightIndex)) > 0){
            minIndex = rightIndex;
        }

        if (minIndex != parentIndex){
            swap(parentIndex, minIndex);
            heapifyDown(minIndex);
        }
    }

    private void swap(int index1, int index2) {
        T element1 = heap.get(index1);
        T element2 = heap.get(index2);
        heap.set(index1, element2);
        heap.set(index2, element1);
    }

    public T peek() {
        if (getSize() == 0) return (T) new Integer(-1);;
        return heap.get(0);
    }

    public int getSize() {
        return heap.size();
    }

    public void printHeap() {
        System.out.println("Heap elements : ");
        for (int i = 0; i < (getSize() / 2); i++) {
            System.out.println("Parent : " + heap.get(i));
            if (leftChild(i) < getSize())
                System.out.print("Left : " + heap.get(leftChild(i)));
            if (rightChild(i) < getSize())
                System.out.print(" Right :" + heap.get(rightChild(i)));
            System.out.println();
        }
        System.out.println();
    }


    public static void main(String[] args) {
        PriorityQueueImpl<Integer> priorityQueueImpl = new PriorityQueueImpl<>();
        for (int i = 10; i>0; i--) {
            priorityQueueImpl.add(i);
        }
        System.out.println("Peek of heap : " + priorityQueueImpl.peek());

        priorityQueueImpl.printHeap();

        int elementsToRemove = 5;
        System.out.print("Removed : ");
        for (int i = 0; i < elementsToRemove; i++) {
            System.out.print(priorityQueueImpl.remove() + " ");
        }
        System.out.println("\nAfter removing " + elementsToRemove + " elements : ");

        priorityQueueImpl.printHeap();

        System.out.println("Peek of heap : " + priorityQueueImpl.peek());

    }
}
