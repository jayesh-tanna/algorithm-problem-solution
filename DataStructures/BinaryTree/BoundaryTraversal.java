/*
https://practice.geeksforgeeks.org/problems/boundary-traversal-of-binary-tree/1
Write a function to print Boundary Traversal of a binary tree. Boundary Traversal of a binary tree here means that you have to print boundary nodes of the binary tree Anti-Clockwise starting from the root.
Note: Boundary node means nodes present at boundary of leftSubtree and nodes present at rightSubtree also including leaf nodes.
*/

class GfG
{
	void printBoundary(Node node)
	{
	    if(node == null)
	        return;
	   System.out.print(node.data + " ");
	    printLeft(node.left);
	    printLeaves(node.left);
	    printLeaves(node.right);
	    printRight(node.right);
	}
	void printLeft(Node node)
	{
	    if(node == null)
	        return;
	   if(node.left != null)
	    {
	        System.out.print(node.data + " ");
	        printLeft(node.left);
	    }
	    else if(node.right != null)
	    {
	        System.out.print(node.data + " ");
	        printLeft(node.right);
	    }
	}
	void printLeaves(Node node)
	{
	    if(node == null)
	        return;
	   printLeaves(node.left);
	   if(node.left == null && node.right == null)
	        System.out.print(node.data + " ");
	   printLeaves(node.right);
	}
	void printRight(Node node)
	{
	    if(node == null)
	        return;
	   if(node.right != null)
	   {
	       printRight(node.right);
	       System.out.print(node.data + " ");
	   }
	   else if(node.left != null)
	   {
	       printRight(node.left);
	       System.out.print(node.data + " ");
	   }
	}
}
