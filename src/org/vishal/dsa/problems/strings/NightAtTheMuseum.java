package org.vishal.dsa.problems.strings;

import java.util.Scanner;

public class NightAtTheMuseum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.next();
        int prevChar = 'a';
        int result = 0;
        for (int i = 0; i < input.length(); i++) {
            int currChar = input.charAt(i);
            int diff = 0;
            if (prevChar == currChar) {
                diff = 0;
            } else {
                int minDiff = Math.abs(prevChar - currChar);
                int diffFromZ = 0, diffFromA = 0, sum = 1;
                if (prevChar < currChar) {
                    diffFromZ = Math.abs(currChar - 'z');
                    diffFromA = Math.abs(prevChar - 'a');
                } else {
                    diffFromZ = Math.abs(prevChar - 'z');
                    diffFromA = Math.abs(currChar - 'a');
                }
                sum += diffFromA + diffFromZ;
                if (sum < minDiff) {
                    diff = sum;
                } else {
                    diff = minDiff;
                }
            }
            result += diff;
            prevChar = currChar;
        }
        System.out.println(result);
        scanner.close();
    }
}