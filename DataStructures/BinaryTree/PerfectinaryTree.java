/*
Given a Binary Tree, write a function to check whether the given Binary Tree is a prefect Binary Tree or not. 
A Binary tree is Perfect Binary Tree in which all internal nodes have two children and all leaves are at same level.
https://practice.geeksforgeeks.org/problems/perfect-binary-tree/1
*/


public static boolean isPerfectRec(Node root, int d, int level)
    {
        
        if(root == null)
            return true;
        if(root.left == null && root.right == null && d - 1 == level)
            return true;
        if(root.left == null || root.right == null)
            return false;
        return isPerfectRec(root.left,d,level + 1) && isPerfectRec(root.right,d,level + 1);
       
    }
