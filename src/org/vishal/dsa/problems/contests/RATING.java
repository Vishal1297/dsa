package org.vishal.dsa.problems.contests;

import java.util.Scanner;

public class RATING {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            int sum = scanner.nextInt();
            int x = 1;
            int y = -x - sum;
            System.out.println(y);
        }
        scanner.close();
    }
}
