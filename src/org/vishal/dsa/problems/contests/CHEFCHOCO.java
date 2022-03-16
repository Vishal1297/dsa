package org.vishal.dsa.problems.contests;

import java.util.Scanner;

public class CHEFCHOCO {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0){
            int c = scanner.nextInt();
            int x = scanner.nextInt();
            int y = scanner.nextInt();
            System.out.println((c - x) * y);
        }
        scanner.close();
    }
}
