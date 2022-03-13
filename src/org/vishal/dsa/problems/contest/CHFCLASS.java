package org.vishal.dsa.problems.contest;

import java.util.Scanner;

/**
 * Input
 *
 * 4
 * 5
 * 6
 * 8
 * 22
 *
 * Output
 *
 * 0
 * 1
 * 1
 * 3
 *
 * M T W Th Fr Sat Sun
 */
public class CHFCLASS {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0){
            long days = scanner.nextLong();
            System.out.println(days / 6);
        }
        scanner.close();
    }
}
