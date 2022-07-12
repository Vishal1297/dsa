package org.vishal.dsa.problems.strings;

public class ValidPalindromeTwo {

    public static void main(String[] args) {
        System.out.println(validPalindrome("cbbc"));
    }

    private static boolean checkPalindrome(String s, int i, int j) {
        while (i < j) {
            if (s.charAt(i) != s.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }

        return true;
    }

    public static boolean validPalindrome(String s) {
        int i = 0;
        int j = s.length() - 1;
        while (i < j) {
            if (s.charAt(i) != s.charAt(j)) {
                return (checkPalindrome(s, i, j - 1) || checkPalindrome(s, i + 1, j));
            }
            i++;
            j--;
        }

        return true;
    }
}
