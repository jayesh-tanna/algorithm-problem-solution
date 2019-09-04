/*
https://practice.geeksforgeeks.org/problems/lowest-common-ancestor-in-a-bst/1
Given a Binary Search Tree and 2 nodes value n1 and n2, your task is to find the lowest common ancestor(LCA) of the two nodes .
Note: Duplicates are not inserted in the BST.
*/

public static Node LCA(Node node, int n1, int n2) {
    if(node.data > n1 && node.data > n2)
        node = LCA(node.left,n1,n2);
    else if(node.data < n1 && node.data < n2)
        node = LCA(node.right,n1,n2);
    return node;
}
