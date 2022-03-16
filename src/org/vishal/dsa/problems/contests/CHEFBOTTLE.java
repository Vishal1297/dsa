package org.vishal.dsa.problems.contests;

import java.util.Scanner;

public class CHEFBOTTLE {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0){
            int n = scanner.nextInt();
            int x = scanner.nextInt();
            int k = scanner.nextInt();
            if (x > k) {
                System.out.println(0);
            } else {
                if (n <= (k / x)) {
                    System.out.println(n);
                } else {
                    System.out.println(Math.min((k / x), n));
                }
            }
        }
        scanner.close();
    }
}
