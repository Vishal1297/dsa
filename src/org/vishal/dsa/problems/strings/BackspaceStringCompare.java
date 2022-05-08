package org.vishal.dsa.problems.strings;

public class BackspaceStringCompare {

    public static void main(String[] args) {
        String s = "y#fo##f";
        String t = "y#f#o##f";
        System.out.println(backspaceCompare(s, t));
    }

    public static boolean backspaceCompare(String s, String t) {
        StringBuilder sBuilder = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '#') {
                if (sBuilder.length() > 0)
                    sBuilder.deleteCharAt(sBuilder.length() - 1);
            }else sBuilder.append(s.charAt(i));
        }
        StringBuilder tBuilder = new StringBuilder();
        for (int i = 0; i < t.length(); i++) {
            if (t.charAt(i) == '#') {
                if (tBuilder.length() > 0)
                    tBuilder.deleteCharAt(tBuilder.length() - 1);
            }else tBuilder.append(t.charAt(i));
        }
        return sBuilder.toString().equals(tBuilder.toString());
    }
}
