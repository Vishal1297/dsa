package org.vishal.dsa.problems.strings;

public class JewelsAndStones {

    public static void main(String[] args) {
        String jewels = "aA", stones = "aAAbbbb";
        System.out.println(numJewelsInStones(jewels, stones));
    }

    public static int numJewelsInStones(String jewels, String stones) {
        if (jewels.length() == 0 || stones.length() == 0){
            return 0;
        }
        int result = 0;
        for (int i = 0; i < stones.length(); i++) {
            if (jewels.contains(stones.charAt(i) + "")){
                result++;
            }
        }
        return result;
    }

}
