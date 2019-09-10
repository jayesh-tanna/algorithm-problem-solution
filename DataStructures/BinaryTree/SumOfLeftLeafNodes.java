/*
https://practice.geeksforgeeks.org/problems/sum-of-left-leaf-nodes/1/?ref=self
Given a Binary Tree of size N, your task is to complete the function leftLeafSum(), 
that should return the sum of all the leaf nodes that are left child of their parent of the given binary tree.
*/


public int leftLeafSum(Node root)
    {
        int res = 0;
        
        if(root == null)
            return res;
        if(root.left != null && root.left.left == null && root.left.right == null){
            res += root.left.data;
        }else{
            res += leftLeafSum(root.left);
        }
        res += leftLeafSum(root.right);
        
        return res;
    }
