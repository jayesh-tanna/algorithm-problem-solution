/*
https://practice.geeksforgeeks.org/problems/minimum-element-in-bst/1
Given an array of size N which represents the elements to be inserted into BST (considering first element as root). 
The task is to find the minimum element 
in this given BST. If the tree is empty, there is no minimum elemnt, so print -1 in that case.
*/

public static int minValue(Node root)
{
    if(root == null)
        return -1;
    int l = minValue(root.left);
    if(l != -1)
        return l;
    else
        return root.data;
}

public static int minValue(Node root)
{
    if(root == null)
        return -1;
    while(root.left != null)
        root = root.left;
    return root.data;
}
