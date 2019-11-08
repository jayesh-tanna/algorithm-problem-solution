/*
https://practice.geeksforgeeks.org/problems/convert-level-order-traversal-to-bst/1
Given an array of size N containing level order traversal of a BST. The task is to complete the function constructBst(), 
that construct the BST (Binary Search Tree) from its given level order traversal.
*/

public class Node
{
    public int data;
    public Node left;
    public Node right;
}
*/
//Complete this function
public static Node constructBst(int []arr,int n)
{
    if(n == 0)
        return null;
    Node root = ConstructBST(arr,n);
    return root;
}
private static Node ConstructBST(int[] arr,int n)
{
    Node root = null;
    for(int i=0;i<n;i++)
    {
        root = InsertNode(root,arr[i]);
    }
    return root;
}
private static Node InsertNode(Node root,int data)
{
    if(root == null)
    {
        root = new Node();
        root.data = data;
        return root;
    }
    if(root.data > data)
        root.left = InsertNode(root.left,data);
    else
        root.right = InsertNode(root.right,data);
    return root;
}
