package org.vishal.dsa.problems.strings;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PalindromePairs {

    public static void main(String[] args) {
        String[] words = {"abcd", "dcba", "lls", "s", "sssll"};
        List<List<Integer>> pairsList = palindromePairs(words);
        for (List<Integer> list : pairsList) {
            System.out.print(list + "  ");
        }
    }

    /**
     * Get palindrome pairs ( O^2 )
     * Result - TLE
     *
     * @param words String array of words
     * @return List of indexes which are palindrome pairs
     */
    public static List<List<Integer>> palindromePairs(String[] words) {
        List<List<Integer>> pairs = new ArrayList<>();
        for (int i = 0; i < words.length - 1; i++) {
            for (int j = i + 1; j < words.length; j++) {
                if (!words[i].equals(words[j])) {
                    String joined = words[i] + words[j];
                    String joined2 = words[j] + words[i];
                    if ((new StringBuilder(joined).reverse().toString().equals(joined))) {
                        pairs.add(Arrays.asList(i, j));
                    }
                    if ((new StringBuilder(joined2).reverse().toString().equals(joined2))) {
                        pairs.add(Arrays.asList(j, i));
                    }
                }
            }
        }
        return pairs;
    }
}
