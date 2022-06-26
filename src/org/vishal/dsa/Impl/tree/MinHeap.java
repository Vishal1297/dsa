package org.vishal.dsa.Impl.tree;

public class MinHeap {

    private final int capacity;
    private int index = 0;
    private final int[] heap;

    public MinHeap(){
        this.index = 0;
        this.capacity = 10;
        this.heap = new int[capacity];
    }

    public MinHeap(int capacity) {
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

    public int remove() {
        int popped = heap[0];
        heap[0] = heap[--index];
        minHeapify(0);
        return popped;
    }

    private void minHeapify(int i) {
        if (!isLeaf(i)) {
            if (heap[i] > heap[leftChild(i)] || heap[i] > heap[rightChild(i)]) {
                if (heap[leftChild(i)] < heap[rightChild(i)]) {
                    swap(i, leftChild(i));
                    minHeapify(leftChild(i));
                } else {
                    swap(i, rightChild(i));
                    minHeapify(rightChild(i));
                }
            }
        }
    }

    public void minHeap() {
        for (int i = (index - 1 / 2); i >= 1; i--) {
            minHeapify(i);
        }
    }

    public void printHeap() {
        System.out.println("Heap elements : ");
        for (int i = 0; i < (index / 2); i++) {
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
        MinHeap minHeap = new MinHeap(10);
        for (int i = 10; i>=0; i--) {
            minHeap.insert(i);
        }

        minHeap.minHeap();

        minHeap.printHeap();

        int elementsToRemove = 4;
        for (int i = 0; i < elementsToRemove; i++) {
            minHeap.remove();
        }
        System.out.println("After removing " + elementsToRemove + " elements : ");
        minHeap.printHeap();
    }

}
