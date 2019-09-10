/*
https://practice.geeksforgeeks.org/problems/full-binary-tree/1
Given a Binary tree, your task is to check whether the Binary tree is a full binary tree or not.
*/




boolean isFullTree(Node node)
    {
        if(node == null)
            return true;
        boolean l = isFullTree(node.left);
        boolean r = isFullTree(node.right);
        if(node.left == null && node.right == null && l == true && r == true)
            return true;
        if(node.left != null && node.right != null && l == true && r == true)
            return true;
        return false;
    }
