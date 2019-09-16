/*
https://practice.geeksforgeeks.org/problems/size-of-binary-tree/1/?ref=self
Given a binary tree, count number of nodes in it. For example, count of nodes in below tree is 4.

        1
     /      \
   10      39
  /
5
Your task is to complete the function getSize() which accepts root node of the tree, and returns the size.
*/

public static int size(TreeNode root){
        return (root == null) ? 0 : size(root.left) + size(root.right) + 1;
}
