
/*
https://practice.geeksforgeeks.org/problems/vertical-width-of-a-binary-tree/1
Given a Binary Tree of N nodes. The task is to find the vertical width of the tree.

The width of a binary tree is the number of vertical paths in that tree.
*/

class Tree
{
    public static int verticalWidth(Node root)
	{
	    if(root == null)
	        return 0;
	    HashSet<Integer> set = new HashSet<Integer>();
	   verticalUtil(root,set,0);
	   return set.size();
	   
	}
	public static void verticalUtil(Node root,HashSet<Integer> set,int distance)
	{
	    if(root == null)
	        return;
	 verticalUtil(root.left,set,distance - 1);
	 verticalUtil(root.right,set,distance + 1);
	 set.add(distance);
	}
}
