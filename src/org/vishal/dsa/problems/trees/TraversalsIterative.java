package org.vishal.dsa.problems.trees;

import java.util.Stack;

public class TraversalsIterative {

    public static void inOrderIterative(TreeNode root) {
        Stack<TreeNode> stack = new Stack<>();
        TreeNode currNode = root;

        while (!stack.isEmpty() || currNode != null) {
            if (currNode != null) {
                stack.push(currNode);
                currNode = currNode.left;
            }else {
                currNode = stack.peek();
                stack.pop();
                System.out.print(currNode.val + " ");
                currNode = currNode.right;
            }
        }
    }

    public static void preOrderIterative(TreeNode root) {
        Stack<TreeNode> stack = new Stack<>();
        TreeNode currNode = root;

        while (!stack.isEmpty() || currNode != null) {
            if (currNode != null) {
                System.out.print(currNode.val + " ");
                stack.push(currNode.right);
                currNode = currNode.left;
            }else {
                currNode = stack.peek();
                stack.pop();
            }
        }
    }
}
