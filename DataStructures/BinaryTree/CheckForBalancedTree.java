/*
https://practice.geeksforgeeks.org/problems/check-for-balanced-tree/1
Given a binary tree, find if it is height balanced or not. 
A tree is height balanced if difference between heights of left and right subtrees is not more than one for all nodes of tree.
*/

boolean isBalanced(Node root)
    {
	    if(height(root) == -1)
	        return false;
	   else
	        return true;
    }
    int height(Node root)
    {
        if(root == null)
            return 0;
            
        int l = height(root.left);
        
        int r = height(root.right);
        
        if(l == -1 || r == -1)
            return -1;
    
        if(Math.abs(l - r) > 1)
            return -1;
        else
            return Math.max(l,r) + 1;
    }
