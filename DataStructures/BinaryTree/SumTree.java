/*
https://practice.geeksforgeeks.org/problems/sum-tree/1
Write a function that returns true if the given Binary Tree is SumTree else false. 
A SumTree is a Binary Tree where value of every node x is equal to sum of nodes present in its left subtree and right subtree of x. 
An empty tree is SumTree and sum of an empty tree can be considered as 0. A leaf node is also considered as SumTree.

Following is an example of SumTree.

          26
        /    \
      10      3
    /   \   /   \ 
   4     6  1    2
*/



class GfG
{
	boolean isSumTree(Node node)
	{
        int res = isSumTreeUtil(node);
        if(res == -1)
            return false;
        else
            return true;
	}
	int isSumTreeUtil(Node node)
	{
	    if(node == null)
            return 0;
        if(node.left == null && node.right == null)
            return node.data;
        int l = isSumTreeUtil(node.left);    
        int r = isSumTreeUtil(node.right);
        if(l + r == node.data)
            return l + r + node.data;
        return -1;
	}
}
