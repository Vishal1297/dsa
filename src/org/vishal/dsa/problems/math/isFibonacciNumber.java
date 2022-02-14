package org.vishal.dsa.problems.math;

public class isFibonacciNumber {

    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) {
            if (isFibonacciNumber(i)) {
                System.out.print(i + "\t");
            }
        }
        System.out.println();
    }

    // Write a method that returns true if a number is a Fibonacci number, false otherwise.
    
    public static boolean isFibonacciNumber(int number) {
        if (number == 0 || number == 1) {
            return true;
        }
        int first = 0;
        int second = 1;
        int next = first + second;

        while (next <= number) {
            if (next == number) {
                return true;
            }
            first = second;
            second = next;
            next = first + second;
        }
        return false;
    }
}