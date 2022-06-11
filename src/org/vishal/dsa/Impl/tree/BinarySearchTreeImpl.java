package org.vishal.dsa.Impl.tree;

public class BinarySearchTreeImpl<T extends Comparable<T>> {

    static class TreeNode<T> {
        T data;
        TreeNode<T> left;
        TreeNode<T> right;

        public TreeNode(T data) {
            this.data = data;
        }
    }

    private TreeNode<T> root;

    public void insert(T data) {
        root = insert(data, root);
    }

    public TreeNode<T> insert(T data, TreeNode<T> root){
        if (root == null) return  new TreeNode<>(data);
        else if (data.compareTo(root.data) < 0) root.left = insert(data, root.left);
        else if (data.compareTo(root.data) > 0) root.right = insert(data, root.right);
        return root;
    }

    public void delete(T data) {
        root = delete(data, root);
    }

    public TreeNode<T> delete(T data, TreeNode<T> root) {
        if (root == null) return null;
        else if (data.compareTo(root.data) < 0) {
            root.left = delete(data, root.left);
        }else if (data.compareTo(root.data) > 0) {
            root.right = delete(data, root.right);
        } else {
            if (root.left == null && root.right == null){
                return null;
            }else if (root.left == null){
                return root.right;
            }else if (root.right == null){
                return root.left;
            }else {
                root.data = findMax(root.left);
                root.left = delete(root.data, root.left);
            }
        }
        return root;
    }

    private T findMax(TreeNode<T> root)
    {
        while (root.right != null) root = root.right;
        return root.data;
    }

    public boolean contains(T data) {
        return contains(root, data);
    }

    private boolean contains(TreeNode<T> root, T data)
    {
        if (root == null) return false;
        else if (data.compareTo(root.data) < 0) return contains(root.left, data);
        else if (data.compareTo(root.data) > 0) return contains(root.right, data);
        else return true;
    }

    /**
     * Prints the values in the binary search tree using in-order traversal
     */
    public void inOrder()
    {
        System.out.print("In-order Traversal :");
        inOrder(root);
        System.out.println();
    }

    // ORDER - Left, Root, Right
    private void inOrder(TreeNode<T> root)
    {
        if (root == null) return;
        inOrder(root.left);
        System.out.print(" " + root.data);
        inOrder(root.right);
    }

    /**
     * Prints the values in the binary search tree using pre-order traversal
     */
    public void preOrder()
    {
        System.out.print("Pre-order Traversal :");
        preOrder(root);
        System.out.println();
    }

    // ORDER - Root, Left, Right
    private void preOrder(TreeNode<T> root)
    {
        if (root == null) return;
        System.out.print(" " + root.data);
        preOrder(root.left);
        preOrder(root.right);
    }

    /**
     * Prints the values in the binary search tree using post-order traversal
     */
    public void postOrder()
    {
        System.out.print("Post-order Traversal :");
        postOrder(root);
        System.out.println();
    }

    // ORDER - Left, Right, Root
    private void postOrder(TreeNode<T> root)
    {
        if (root == null) return;
        postOrder(root.left);
        postOrder(root.right);
        System.out.print(" " + root.data);
    }

    public static void main(String[] args) {
        BinarySearchTreeImpl<Integer> bst = new BinarySearchTreeImpl<>();
        for (int i = 0; i < 5; i++)
        {
            int r = (int)(Math.random() * 100) + 1;
            System.out.println("Inserting : " + r + "...");
            bst.insert(r);
        }
        if (bst.contains(74)){
            System.out.println("Contains 74");
        }
        bst.delete(74);
        if (bst.contains(74)){
            System.out.println("Contains 74");
        }
        bst.inOrder();
        bst.preOrder();
        bst.postOrder();
    }

}