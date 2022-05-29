package org.vishal.dsa.problems.contests;

public class EqualDigitValueCount {

    public static void main(String[] args) {
        String num = "1210";
        System.out.println(digitCount(num));
    }

    public static boolean digitCount(String num) {
        int[] indexCount = new int[10];
        for(char c:num.toCharArray()){
            indexCount[c-'0']++;
        }

        for(int i=0;i<num.length();i++){
            if(Character.getNumericValue(num.charAt(i)) != indexCount[i])
                return false;
        }
        return true;
    }
}
