package org.vishal.dsa.problems.contests;

import java.util.Scanner;

/**
 * 3
 * 10 15 8
 * 32 32 32
 * 82 45 54
 */
public class DiscusThrow {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        while (n-- > 0){
            int firstThrow = scanner.nextInt();
            int secondThrow = scanner.nextInt();
            int thirdThrow = scanner.nextInt();
            if (firstThrow >= secondThrow && firstThrow>= thirdThrow){
                System.out.println(firstThrow);
            }else if (secondThrow >= firstThrow && secondThrow>= thirdThrow){
                System.out.println(secondThrow);
            }else {
                System.out.println(thirdThrow);
            }
        }
        scanner.close();
    }
}
