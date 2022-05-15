package org.vishal.dsa.problems.twopointer;

public class ReverseString {

    public static void main(String[] args) {
        char[] s = {'h','e','l','l','o'};
        reverseString(s);
    }

    public static void reverseString(char[] s) {
        int length = s.length;
        if (length <= 1) return;
        int leftPtr = 0, rightPtr = length - 1;
        while (leftPtr < rightPtr){
            char temp = s[leftPtr];
            s[leftPtr] = s[rightPtr];
            s[rightPtr] = temp;
            leftPtr++;
            rightPtr--;
        }
    }
}
