
/*
https://practice.geeksforgeeks.org/problems/exchange-the-leaf-nodes/1
Given a binary tree of size N, your task is to complete the function pairwiseSwap(), 
that swap leaf nodes in the given binary tree pairwise starting from from left to right.
*/

class Solution {
    Node first = null, second = null;
    public void exchangeLeaves(Node root){
        if(root == null)
            return;
        if(root.left == null && root.right == null)
        {
            if(first == null)
                first = root;
            else
                second = root;
            if(first != null && second != null)
            {
                int t = first.data;
                first.data = second.data;
                second.data = t;
                first = null;
                second = null;
            }
        }
        if(root.left != null)
            exchangeLeaves(root.left);
        if(root.right != null)
            exchangeLeaves(root.right);
    }
}
