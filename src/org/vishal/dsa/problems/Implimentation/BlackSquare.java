package org.vishal.dsa.problems.Implimentation;

import java.util.Scanner;

public class BlackSquare {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int calories[] = new int[5];
        for (int i = 1; i < 5; i++) {
            calories[i] = scanner.nextInt();
        }
        String strips = scanner.next();
        int totalCalories = 0;
        for (int i = 0; i < strips.length(); i++) {
            totalCalories += calories[strips.charAt(i) - '0'];
        }
        System.out.println(totalCalories);
        scanner.close();
    }
}