package org.vishal.dsa.problems.twopointer;

public class ReverseVowelsFromString {

    public static void main(String[] args) {
        String s = "leetcode";
        System.out.println(reverseVowels(s));
    }

    public static String reverseVowels(String s) {
        char[] charArr = s.toCharArray();
        int length = charArr.length;
        int leftPtr = 0, rightPtr = length - 1;
        while (leftPtr < rightPtr){
            if (isVowel(charArr[leftPtr]) && isVowel(charArr[rightPtr])){
                char temp = charArr[leftPtr];
                charArr[leftPtr] = charArr[rightPtr];
                charArr[rightPtr] = temp;
                leftPtr++;
                rightPtr--;
            }else if (isVowel(charArr[leftPtr]) && !isVowel(charArr[rightPtr])){
                rightPtr--;
            }else if (!isVowel(charArr[leftPtr]) && isVowel(charArr[rightPtr])){
                leftPtr++;
            }else {
                leftPtr++;
                rightPtr--;
            }
        }
        return new String(charArr);
    }

    public static boolean isVowel(char ch){
        return (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
                || (ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U');
    }
}
