/*
https://practice.geeksforgeeks.org/problems/diagonal-traversal-of-binary-tree/1
Given a Binary Tree, print the diagnol traversal of the binary tree.

Consider lines of slope -1 passing between nodes. Given a Binary Tree, print all diagonal elements in a binary tree belonging to same line.
*/

class GfG
{
     public void diagonalPrint(TreeNode root)
      {
        HashMap<Integer,String> map = new HashMap<>();
        storeElements(root,map,0);
        printElements(map);
      }
      private void storeElements(TreeNode root,HashMap<Integer,String> map,int d)
      {
          if(root == null)
            return;
          String s = (map.get(d) == null) ? "" : map.get(d);
          s += root.data + " "; 
          map.put(d,s);
          storeElements(root.left,map,d+1);
          storeElements(root.right,map,d);
      }
      private void printElements(HashMap<Integer,String> map)
      {
          for (Entry<Integer, String> entry : map.entrySet()) 
        { 
            System.out.print(entry.getValue()); 
        } 
      }
}
