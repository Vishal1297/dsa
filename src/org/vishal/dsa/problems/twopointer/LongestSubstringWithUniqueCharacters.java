package org.vishal.dsa.problems.twopointer;

import java.util.HashSet;

public class LongestSubstringWithUniqueCharacters {

    public static void main(String[] args) {
        String s = "abcabcbb";
        long startTime = System.nanoTime();
        System.out.println(lengthOfLongestSubstring(s));
        long endTime = System.nanoTime();
        long duration = (endTime - startTime);
        System.out.println("Time taken : " + (duration / 1000000) + " ms");
    }

    public static int lengthOfLongestSubstring(String s) {
        int leftPtr = 0, rightPtr = 0, max = 0;
        HashSet<Character> unique = new HashSet<>();
        while (rightPtr < s.length()){
            if (!unique.contains(s.charAt(rightPtr))){
                unique.add(s.charAt(rightPtr));
                max = Math.max(unique.size(), max);
                rightPtr++;
            }else {
                unique.remove(s.charAt(leftPtr));
                leftPtr++;
            }
        }
        return max;
    }

}
