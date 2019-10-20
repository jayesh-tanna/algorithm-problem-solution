/*
https://practice.geeksforgeeks.org/problems/maximum-difference-between-node-and-its-ancestor/1/?ref=self
Given a Binary Tree you need to find maximum value which you can get by subtracting value of node B from value of node A, 
where A and B are two nodes of the 
binary tree and A is an ancestor of B. You are required to complete the function maxDiff.
*/

class GfG
{
    static int diff;
    int maxDiff(Node root)
    {
        diff = Integer.MIN_VALUE;
        maxDiffUtil(root);
        return diff;
    }
    int maxDiffUtil(Node root)
    {
        if (root == null)
            return Integer.MAX_VALUE;
        int l = maxDiffUtil(root.left);
        int r = maxDiffUtil(root.right);
        if (l == Integer.MAX_VALUE && r == Integer.MAX_VALUE)
            return root.data;
        int min = Math.min(l, r);
        diff = Math.max(root.data - min, diff);
        min = Math.min(min, root.data);
        return min;
    }
}
