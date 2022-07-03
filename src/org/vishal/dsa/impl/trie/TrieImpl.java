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

    public TrieNode search(String key) {
        int length = key.length();
        TrieNode temp = root;
        int index;
        for (int level = 0; level < length; level++) {
            index = key.charAt(level) - 'a';
            if (temp.childrens[index] == null) {
                return null;
            }
            temp = temp.childrens[index];
        }
        if(temp==root) return null;
        return temp;
    }

    public boolean searchNode(String key) {
        return search(key) != null;
    }

    public boolean startsWith(String prefix) {
        return search(prefix) != null;
    }

    public static void main(String[] args) {
        String[] keys = {"the", "a", "there", "answer", "any", "by", "bye", "their"};
        String[] output = {"Not present in trie", "Present in trie"};

        TrieImpl impl = new TrieImpl();
        for (String key : keys) impl.insert(key);

        if (impl.searchNode("the"))
            System.out.println("the --- " + output[1]);
        else System.out.println("the --- " + output[0]);

        if (impl.searchNode("th"))
            System.out.println("th --- " + output[1]);
        else System.out.println("th --- " + output[0]);

        String prefix = "ans";

        System.out.println("Starts with " + prefix + " : " + impl.startsWith(prefix));
    }
}
