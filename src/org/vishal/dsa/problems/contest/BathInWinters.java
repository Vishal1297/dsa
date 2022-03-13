package org.vishal.dsa.problems.contest;

import java.util.Scanner;

/**
 * 4
 * 10 6
 * 25 1
 * 100 10
 * 30 40
 */
public class BathInWinters {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0){
            int x = scanner.nextInt();
            int y = scanner.nextInt();
            System.out.println(x/(2 * y));
        }
        scanner.close();
    }
}
