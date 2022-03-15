package org.vishal.dsa.problems.contests;

import java.util.Scanner;

/**
 * Input
 * 3
 * ABCDE
 * EDCBA
 * ROUND
 * RINGS
 * START
 * STUNT
 *
 * Output
 * BBGBB
 * GBBBB
 * GGBBG
 *
 */
public class Wordle {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        while (n-- > 0){
            String hidden = scanner.next();
            String guess = scanner.next();
            for (int i = 0; i < 5; i++) {
                if (hidden.charAt(i) == guess.charAt(i)){
                    System.out.print("G");
                }else {
                    System.out.print("B");
                }
            }
            System.out.println();
        }
        scanner.close();
    }
}
