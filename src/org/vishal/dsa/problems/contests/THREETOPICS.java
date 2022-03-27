package org.vishal.dsa.problems.contests;

import java.util.Scanner;

public class THREETOPICS {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int x = scanner.nextInt();
        System.out.println((x == a) || (x == b) || (x == c) ? "Yes" : "No");
        scanner.close();
    }
}
