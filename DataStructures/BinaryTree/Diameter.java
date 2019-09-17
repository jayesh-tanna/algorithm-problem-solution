/*
https://practice.geeksforgeeks.org/problems/diameter-of-binary-tree/1
Given a Binary Tree, find diameter of it.
*/

class Tree
{
   /* Complete the function to get diameter of a binary tree */
    int diameter(Node node)
    {
        if(node == null)
            return 0;
        int lh = height(node.left);
        int rh = height(node.right);
        int ld = diameter(node.left);
        int rd = diameter(node.right);
        int m = Math.max(lh + rh + 1, Math.max(ld,rd));
        return m;
    }
    int height(Node root)
    {
        return (root == null) ? 0 : Math.max(height(root.left),height(root.right)) + 1;
    }
}
