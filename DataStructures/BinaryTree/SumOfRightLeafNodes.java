
/*
Given a Binary Tree of size N, your task is to complete the function rightLeafSum(), 
that should return the sum of all the leaf nodes that are right child of their parent of the given binary tree.
https://practice.geeksforgeeks.org/problems/sum-of-right-leaf-nodes/1/?ref=self
*/


public int rightLeafSum(Node root)
    {
      if(root == null)
        return 0;
      int res = 0;
      res += rightLeafSum(root.left);
      if(root.right != null && root.right.left == null && root.right.right == null)
        res += root.right.data;
    else
        res += rightLeafSum(root.right);
        return res;
   }
