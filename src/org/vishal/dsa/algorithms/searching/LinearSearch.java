package org.vishal.dsa.algorithms.searching;

public class LinearSearch {
    public static void main(String[] args) {
        int[] input = { 15, 23, 55, 90, 111, 124, 200 };
        int elementToFind = 55;
        int foundAt = search(input, elementToFind);
        if (foundAt != -1) {
            System.out.println("Element " + elementToFind + " Found At " + foundAt);
        } else {
            System.out.println("Element " + elementToFind + " Not Found");
        }
    }

    public static int search(int[] input, int element) {
        for (int index = 0; index < input.length; index++) {
            if (input[index] == element)
                return index;
        }
        return -1;
    }
}