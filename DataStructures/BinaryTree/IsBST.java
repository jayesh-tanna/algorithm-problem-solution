/*
https://practice.geeksforgeeks.org/problems/check-for-bst/1/?ref=self
Given a binary tree, return true if it is BST, else false.
The task is to complete the function isBST() which takes one argument, root of Binary Tree.
*/

int isBST(Node root)  
    {
        return (isBST(root,Integer.MIN_VALUE,Integer.MAX_VALUE) == true) ? 1 : 0;
    }
    boolean isBST(Node root,int min,int max)
    {
        if(root == null)
            return true;
        if(root.data < min || root.data > max)
            return false;    
        return isBST(root.left,min,root.data) && isBST(root.right,root.data,max);
    }
