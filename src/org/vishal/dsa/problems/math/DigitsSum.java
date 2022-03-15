package org.vishal.dsa.problems.math;

public class DigitsSum {

    public static void main(String[] args) {
        System.out.println(digitSum(987));
    }

    public static int digitSum(int num) {
        if (num == 0) return 0;
        return (num % 9 == 0) ? 9 : (num % 9);
    }

}
