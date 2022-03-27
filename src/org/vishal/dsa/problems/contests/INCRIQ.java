package org.vishal.dsa.problems.contests;

import java.util.Scanner;

public class INCRIQ {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int value = scanner.nextInt();
        System.out.println(value + 7 > 170 ? "Yes" : "No");
        scanner.close();
    }
}
