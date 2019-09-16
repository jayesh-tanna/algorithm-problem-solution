/*
https://practice.geeksforgeeks.org/problems/symmetric-tree/1
Given a Binary Tree of size N, your task is to complete the function isSymettric(), 
that check whether a binary is Symmetric or not, i.e. the binary tree is Mirror image of itself or not.
*/


class GfG
{
    public static boolean isSymmetric(Node root)
    {
        return isSymmetric(root.left,root.right);
    }
    public static boolean isSymmetric(Node root1,Node root2)
    {
        if(root1 == null && root2 == null)
            return true;
        if(root1 == null || root2 == null)
            return false;
        if(root1.data != root2.data)
            return false;
        return isSymmetric(root1.left,root2.right) 
            && isSymmetric(root1.right,root2.left);
    }
}
