package org.vishal.dsa.problems.strings;

public class ConsecutiveCharacters {

    public static void main(String[] args) {
        System.out.println(maxPower("leetcode"));
    }

    public static int maxPower(String s) {
        if (s.length() == 1) return 1;
        int max = 0, count = 1;
        for (int i = 1; i < s.length(); i++) {
            if(s.charAt(i - 1) == s.charAt(i)) {
                count++;
            }else {
                count = 1;
            }
            max = Math.max(max, count);
        }
        return max;
    }

}
