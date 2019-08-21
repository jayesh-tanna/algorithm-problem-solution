/*
Given a Binary Search Tree (BST) and a range, print all the numbers in the 
BST that lie in the given range l-h(inclusive) in non-decreasing order. 
If no such element exists, an empty line will be printed.
https://practice.geeksforgeeks.org/problems/print-bst-elements-in-given-range/1
*/

public static void printNearNodes(Node root,int l,int h)
{
    if(root == null)
        return;
    if(root.data >= l)
        printNearNodes(root.left,l,h);
    if(root.data >= l && root.data <= h)
        Console.Write(root.data + " ");
    if(root.data <= h)
        printNearNodes(root.right,l,h);
}
