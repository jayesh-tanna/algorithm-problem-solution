/*
https://practice.geeksforgeeks.org/problems/height-of-binary-tree/1/?ref=self
Given a binary tree, find height of it
*/

int height(Node node) 
    {
        return (node == null) ? 0 : Math.max(height(node.left), height(node.right)) + 1;
    }  
