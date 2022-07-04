package org.vishal.dsa.impl.trie;

public class TrieImpl {
    static class TrieNode {
        private final TrieNode[] childrens;
        boolean isEndOfWord;
        public TrieNode() {
            this.isEndOfWord = false;
            this.childrens = new TrieNode[ALPHABET_SIZE];
            for (int i = 0; i < ALPHABET_SIZE; i++) {
                childrens[i] = null;
            }
        }
    }

    static final int ALPHABET_SIZE = 26;
    private final TrieNode root;

    public TrieImpl(){
        this.root = new TrieNode();
    }

    public void insert(String key) {
        int length = key.length();
        TrieNode temp = root;
        int index;
        for (int level = 0; level < length; level++) {
            index = key.charAt(level) - 'a';
            if (temp.childrens[index] == null) {
                temp.childrens[index] = new TrieNode();
            }
            temp = temp.childrens[index];
        }
        temp.isEndOfWord = true;
    }

    public boolean search(String key) {
        int length = key.length();
        TrieNode temp = this.root;
        int index;
        for (int level = 0; level < length; level++) {
            index = key.charAt(level) - 'a';
            if (temp.childrens[index] == null) {
                return false;
            }
            temp = temp.childrens[index];
        }
        return temp.isEndOfWord;
    }

    public boolean startsWith(String prefix) {
        int length = prefix.length();
        TrieNode temp = this.root;
        int index;
        for (int level = 0; level < length; level++) {
            index = prefix.charAt(level) - 'a';
            if (temp.childrens[index] == null) {
                return false;
            }
            temp = temp.childrens[index];
        }
        return true;
    }

    public static void main(String[] args) {
        String[] keys = {"the", "a", "there", "answer", "any", "by", "bye", "their"};
        String[] output = {"Not present in trie", "Present in trie"};

        TrieImpl impl = new TrieImpl();
        for (String key : keys) impl.insert(key);

        if (impl.search("answer"))
            System.out.println("answer --- " + output[1]);
        else System.out.println("answer --- " + output[0]);

        if (impl.search("th"))
            System.out.println("th --- " + output[1]);
        else System.out.println("th --- " + output[0]);

        String prefix = "ans";

        System.out.println("Starts with " + prefix + " : " + impl.startsWith(prefix));
        System.out.println("Starts with answers : " + impl.startsWith("answers"));
    }
}
