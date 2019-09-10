/*
https://practice.geeksforgeeks.org/problems/remove-half-nodes/1
Given A binary Tree, Task is to remove all the half nodes (which has only one child).
*/

public Node removeHalfNodes(Node root)
    {
        if(root == null)
            return null;
        root.left = removeHalfNodes(root.left);
        root.right = removeHalfNodes(root.right);
        if(root.left == null && root.right == null)
            return root;
        if(root.left == null)
            return root.right;
        if(root.right == null)
            return root.left;
        return root;
    }
