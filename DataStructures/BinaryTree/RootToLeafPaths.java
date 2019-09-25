/*
https://practice.geeksforgeeks.org/problems/root-to-leaf-paths/1
Given a Binary Tree of size N, your task is to complete the function printPaths() 
that prints all the possible paths from root node to the all the leaf node's of the binary tree.
*/

class GfG
{
	public void printPaths(Node root)
       {
          String path = "";
          printPaths(root,path);
       }
       private void printPaths(Node root,String path)
       {
            if(root == null)
                return;
            if(root.left == null && root.right == null)
            {
                System.out.print(path + " " + root.data + " #");
                return;
            }
            path = (path.isEmpty()) ? Integer.toString(root.data) : path + " " + root.data;
            printPaths(root.left,path);
            printPaths(root.right,path);
       }
}
