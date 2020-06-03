/*
https://leetcode.com/explore/other/card/30-day-leetcoding-challenge/529/week-2/3293/
Given a binary tree, you need to compute the length of the diameter of the tree. The diameter of a binary tree is the length of the longest path between any two nodes in a tree. This path may or may not pass through the root.

Example:
Given a binary tree
          1
         / \
        2   3
       / \     
      4   5    
Return 3, which is the length of the path [4,2,1,3] or [5,2,1,3].

Note: The length of path between two nodes is represented by the number of edges between them.
*/

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     public int val;
 *     public TreeNode left;
 *     public TreeNode right;
 *     public TreeNode(int val=0, TreeNode left=null, TreeNode right=null) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
public class Solution {
    public int DiameterOfBinaryTree(TreeNode root) {
        if(root == null)
            return 0;
        int leftHeight = GetHeight(root.left);
        int rightHeight = GetHeight(root.right);
        int leftDiameter = DiameterOfBinaryTree(root.left);
        int rightDiameter = DiameterOfBinaryTree(root.right);
        int result = Math.Max(leftHeight + rightHeight, Math.Max(leftDiameter,rightDiameter));
        return result;
    }
    public int GetHeight(TreeNode root)
    {
        if(root == null)
            return 0;
        return Math.Max(GetHeight(root.left),GetHeight(root.right)) + 1;
    }
}
