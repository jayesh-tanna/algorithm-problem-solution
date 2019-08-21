/*
Given a Binary Search Tree, find the sum of all leaf nodes.
https://practice.geeksforgeeks.org/problems/sum-of-leaf-nodes-in-bst/1
*/

public static int sumOfLeafNodes(Node root)
{
    if(root == null)
        return 0;
    if(root.left == null && root.right == null)
        return root.data;
    return GetSum(root.left) + GetSum(root.right);
}
