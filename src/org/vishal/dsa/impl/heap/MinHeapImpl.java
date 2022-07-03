package org.vishal.dsa.impl.heap;

public class MinHeapImpl {

    private final int capacity;
    private int index;
    private final int[] heap;

    public MinHeapImpl(){
        this.index = 0;
        this.capacity = 10;
        this.heap = new int[capacity];
    }

    public MinHeapImpl(int capacity) {
        this.index = 0;
        this.capacity = capacity;
        this.heap = new int[capacity];
    }

    private void swap(int index1, int index2) {
        int element = heap[index1];
        heap[index1] = heap[index2];
        heap[index2] = element;
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

    private boolean isLeaf(int i) {
        return rightChild(i) >= capacity || leftChild(i) >= capacity;
    }

    public void insert(int element){
        if (index >= capacity) return;
        heap[index] = element;
        int current = index;
        while (heap[current] < heap[parent(current)]){
            swap(current, parent(current));
            current = parent(current);
        }
        index++;
    }

    public int peek() { return heap[0]; }

    public int remove() {
        if (index - 1 < 0) return -1;
        swap(0, index - 1);
        int popped = heap[--index];
        minHeapify(0);
        return popped;
    }

    private void minHeapify(int parentIndex) {
        int minIndex = parentIndex;
        int leftIndex = leftChild(parentIndex);
        if (leftIndex < index && heap[minIndex] > heap[leftIndex]){
            minIndex = leftIndex;
        }

        int rightIndex = rightChild(parentIndex);
        if (rightIndex < index && heap[minIndex] > heap[rightIndex]){
            minIndex = rightIndex;
        }

        if (minIndex != parentIndex){
            swap(parentIndex, minIndex);
            minHeapify(minIndex);
        }
    }

    public void minHeap() {
        for (int i = (index - 1 / 2); i >= 1; i--) {
            minHeapify(i);
        }
    }

    public void printHeap() {
        System.out.println("Heap elements : ");
        for (int i = 0; i < (index  / 2); i++) {
            System.out.println("Parent : " + heap[i]);
            if (leftChild(i) < index)
                System.out.print("Left : " + heap[leftChild(i)]);
            if (rightChild(i) < index)
                System.out.print(" Right :" + heap[rightChild(i)]);
            System.out.println();
        }
        System.out.println();
    }

    public static void main(String[] args) {
        MinHeapImpl minHeapImpl = new MinHeapImpl(10);
        for (int i = 10; i>0; i--) {
            minHeapImpl.insert(i);
        }

        System.out.println("Peek of heap : " + minHeapImpl.peek());

        minHeapImpl.minHeap();

        minHeapImpl.printHeap();

        int elementsToRemove = 6;
        System.out.print("Removed : ");
        for (int i = 0; i < elementsToRemove; i++) {
            System.out.print(minHeapImpl.remove() + " ");
        }
        System.out.println("\nAfter removing " + elementsToRemove + " elements : ");

        minHeapImpl.printHeap();
    }

}
