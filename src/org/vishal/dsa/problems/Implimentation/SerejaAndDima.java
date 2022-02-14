package org.vishal.dsa.problems.Implimentation;

import java.util.Scanner;

public class SerejaAndDima {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        Integer[] inputs = new Integer[n];
        for (int i = 0; i < n; i++) {
            inputs[i] = scanner.nextInt();
        }
        int serejaPoints = 0, dimaPoints = 0;
        int leftPtr = 0, rightPtr = n - 1;
        boolean first = true;
        while (leftPtr <= rightPtr) {
            int currentMaxPoint = 0;
            if (inputs[leftPtr] > inputs[rightPtr]) {
                currentMaxPoint += inputs[leftPtr];
                leftPtr++;
            } else {
                currentMaxPoint += inputs[rightPtr];
                rightPtr--;
            }
            if (first) {
                serejaPoints += currentMaxPoint;
                first = false;
            } else {
                dimaPoints += currentMaxPoint;
                first = true;
            }
        }
        System.out.println(serejaPoints + " " + dimaPoints);
        scanner.close();
    }
}
