/*
https://practice.geeksforgeeks.org/problems/array-to-bst/0
Given a sorted array. Write a program that creates a Balanced Binary Search Tree using array elements. 
If there are N elements in array, then floor(n/2)'th 
element should be chosen as root and same should be followed recursively.
Example:
Input:
1
7
1 2 3 4 5 6 7

Output:
4 2 1 3 6 5 7
*/


using System;
public class Node
{
    public int data;
    public Node left,right;
    public Node(int data){
        this.data = data;
    }
}
public class BinaryTree
{
     public Node root = null;
    public void InsertNode(int data)
        {
   
    if (root == null)
            {
                root = new Node(data);
                return;
            }
            Node current = root;
            while (current != null)
            {
                if (data > current.data)
                {
                    if (current.right == null)
                    {
                        current.right = new Node(data);
                        break;
                    }
                    else
                        current = current.right;
                }
                else if (data < current.data)
                {
                    if (current.left == null)
                    {
                        current.left = new Node(data);
                        break;
                    }
                    else
                        current = current.left;
                }
                else
                    break;
            }
        }
    public void PreOrder(Node root){
        if(root == null)
            return;
        Console.Write(root.data + " ");
        PreOrder(root.left);
        PreOrder(root.right);
    }
}
public class GFG {
	static public void Main () 
	{
		int t = Convert.ToInt32(Console.ReadLine());
		while(t-- > 0)
		{
		    int n = Convert.ToInt32(Console.ReadLine());
		    int[] arr = Array.ConvertAll(Console.ReadLine().Trim().Split(),int.Parse);
		    BinaryTree tree = new BinaryTree();
		    InsertData(tree,arr,0,n-1);
		    tree.PreOrder(tree.root);
		    Console.WriteLine();
		}
	}
	
	private static void InsertData(BinaryTree tree,int[] arr,int l,int r)
	{
	    if (l > r)
                return;
            int m = (l + ((r - l) / 2));
            tree.InsertNode(arr[m]);
            InsertData(tree, arr, l, m - 1);
            InsertData(tree, arr, m + 1, r);
	}
}
