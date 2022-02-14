package org.vishal.dsa.problems.math;

import java.util.HashMap;
import java.util.Scanner;

/**
 * Problem Statement : https://codeforces.com/contest/294/problem/A
 */

public class ShaassAndOskol {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int wires = scanner.nextInt();
        HashMap<Integer, Integer> birds = new HashMap<>();
        for (int i = 0; i < wires; i++) {
            birds.put(i+1, scanner.nextInt());
        }
        int birdsShot = scanner.nextInt();
        for (int i = 0; i < birdsShot; i++) {
            int x = scanner.nextInt();
            int y = scanner.nextInt();
            int birdsToRight = birds.get(x) - y;
            int birdsToLeft = birds.get(x) - birdsToRight - 1;
            if (birds.containsKey(x - 1) && birdsToLeft > 0) {
                birds.put(x - 1, birds.get(x - 1) + birdsToLeft);
            }
            if (birds.containsKey(x + 1) && birdsToRight > 0) {
                birds.put(x + 1, birds.get(x + 1) + birdsToRight);
            }
            birds.put(x, 0);
        }
        birds.forEach((key,value) -> System.out.println(value));
        scanner.close();
    }
}
