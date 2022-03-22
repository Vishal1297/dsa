package org.vishal.dsa.problems.contests;

import java.util.Arrays;
import java.util.Scanner;

public class BALREV {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0){
            int n = scanner.nextInt();
            String binaryStr = scanner.next();
            char[] charArray = binaryStr.toCharArray();
            Arrays.sort(charArray);
            System.out.println(new String(charArray));
        }
        scanner.close();
    }
}
