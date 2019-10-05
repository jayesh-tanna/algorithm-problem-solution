/*
https://practice.geeksforgeeks.org/problems/largest-bst/1
Given a binary tree, Your task is to complete the function largestBst that returns the size of the largest subtree which is also a Binary Search Tree (BST). 
If the complete Binary Tree is BST, then return the size of whole tree.
*/

class GfG{
    public static int largestBst(Node node)
    {
        if(isBST(node,Integer.MIN_VALUE,Integer.MAX_VALUE))
            return size(node);
        else
            return Math.max(largestBst(node.left),largestBst(node.right));
    }
    
    private static boolean isBST(Node root,int min,int max)
    {
        if(root == null) return true;
        if(root.data > max || root.data < min)
            return false;
        return isBST(root.left,min,root.data) && isBST(root.right,root.data,max);
    }
    private static int size(Node root)
    {
        if(root == null)
            return 0;
        return size(root.left) + 1 + size(root.right);
    }
}
