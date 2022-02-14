package org.vishal.dsa.problems.trees;
/* IMPORTANT: Multiple classes and nested static classes are supported */

/*
 * uncomment this if you want to read input.
import java.io.BufferedReader;
import java.io.InputStreamReader;

import java.util.*;
*/

// Warning: Printing unwanted or ill-formatted data to output will cause the test cases to fail

import java.io.*;
import java.util.StringTokenizer;
public class YatinPlaysPUBG {
    public static void main(String args[]) throws Exception {
        MyScanner sc = new MyScanner();
        out = new PrintWriter(new BufferedOutputStream(System.out));
        int t = sc.nextInt();
        // int temp[] = { 8, 3, 10, 1, 6, 14, 4, 7, 13 };
        while (t-- > 0) {
            int nodes = sc.nextInt();
            BinaryTree tree = new BinaryTree();
            for (int i = 0; i < nodes; i++) {
                int enemy = sc.nextInt();
                tree.insertNode(enemy);
            }
            Node rNode = tree.getRoot();
            System.out.println(getMaxHeight(rNode));
        }
        out.close();
    }

    public static int getMaxHeight(Node root) {
        if (root == null) {
            return 0;
        }
        int lHeight = getMaxHeight(root.getLeftNode());
        int rHeight = getMaxHeight(root.getRightNode());
        return Math.max(lHeight, rHeight) + 1;
    }

    static class BinaryTree {

        private Node root;

        public Node getRoot() {
            return this.root;
        }

        public void insertNode(int value) {
            if (root == null) {
                root = new Node(value);
            }
            root.insertNode(value);
        }

    }
    

    static class Node {

        private Node leftNode;
        private Node rightNode;
        private int data;

        public Node() {
            super();
            data = 0;
        }

        public Node(int data) {
            this.data = data;
        }

        /**
         * @return the leftNode
         */
        public Node getLeftNode() {
            return leftNode;
        }
        /**
         * @param leftNode the leftNode to set
         */
        public void setLeftNode(Node leftNode) {
            this.leftNode = leftNode;
        }
        /**
         * @return the righNode
         */
        public Node getRightNode() {
            return rightNode;
        }
        /**
         * @param righNode the righNode to set
         */
        public void setRightNode(Node rightNode) {
            this.rightNode = rightNode;
        }
        /**
         * @return the data
         */
        public int getData() {
            return data;
        }
        /**
         * @param data the data to set
         */
        public void setData(int data) {
            this.data = data;
        }


        public void insertNode(int value) {
            if (this.data == value) {
                return;
            }

            if (this.data > value) {
                if (leftNode == null) {
                    leftNode = new Node(value);
                } else {
                    leftNode.insertNode(value);
                }
            } else {
                if (rightNode == null) {
                    rightNode = new Node(value);
                } else {
                    rightNode.insertNode(value);
                }
            }
            return;
        }
        
    }

    //-----------PrintWriter for faster output---------------------------------
    public static PrintWriter out;
        
    //-----------MyScanner class for faster input----------
    static class MyScanner {
        BufferedReader br;
        StringTokenizer st;
    
        public MyScanner() {
            br = new BufferedReader(new InputStreamReader(System.in));
        }
    
        String next() {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }
    
        int nextInt() {
            return Integer.parseInt(next());
        }
    
        long nextLong() {
            return Long.parseLong(next());
        }
    
        double nextDouble() {
            return Double.parseDouble(next());
        }
    
        String nextLine(){
            String str = "";
        try {
            str = br.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return str;
        }

    }
    //--------------------------------------------------------
}