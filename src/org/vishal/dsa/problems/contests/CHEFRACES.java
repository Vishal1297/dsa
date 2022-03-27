package org.vishal.dsa.problems.contests;

import java.util.Scanner;

public class CHEFRACES {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0){
            int x = scanner.nextInt();
            int y = scanner.nextInt();
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            int medals = 0;
            if (x != a && x != b) {
                medals++;
            }
            if (y != a && y != b) {
                medals++;
            }
            System.out.println(medals);
        }
        scanner.close();
    }
}
