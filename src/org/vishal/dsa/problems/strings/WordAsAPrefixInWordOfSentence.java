package org.vishal.dsa.problems.strings;

public class WordAsAPrefixInWordOfSentence {

    public static void main(String[] args) {
        String sentence = "i love eating burger";
        String searchWord = "burg";
        System.out.println(isPrefixOfWord(sentence, searchWord));
    }

    public static int isPrefixOfWord(String sentence, String searchWord) {
        int pos = -1;
        String[] split = sentence.split(" ");
        for (int i = 0; i < split.length; i++) {
            if (split[i].startsWith(searchWord)) {
                pos = i + 1;
                break;
            }
        }
        return pos;
    }

}
