package org.vishal.dsa.problems.Implimentation;

import java.util.Scanner;

public class BuyAShovel {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int k = scanner.nextInt();
        int r = scanner.nextInt();
        int result = k, count = 1, i = 2;
        while (true) {
            if (result % 10 == 0) {
                System.out.println(count);
                break;
            } else if (result % 10 == r){
                System.out.println(count);
                break;
            } else {
                result = k * i;
                count++;
                i++;
            }
        }
        scanner.close();
    }
}
