/*
https://practice.geeksforgeeks.org/problems/max-and-min-element-in-binary-tree/1
Given a Binary Tree, find maximum and minimum elements in it.
*/

public static int findMax(Node root)
	{
	    if(root == null)
	        return Integer.MIN_VALUE;
	    int max = Math.max(findMax(root.left),findMax(root.right));
	    return Math.max(root.data,max);
	}
	public static int findMin(Node root)
	{
	    if(root == null)
	        return Integer.MAX_VALUE;
	    int min = Math.min(findMin(root.left),findMin(root.right));
	    return Math.min(root.data,min);
	}
