/*
https://practice.geeksforgeeks.org/problems/find-the-closest-element-in-bst/1/?ref=self
Given a BST with N nodes and a target node K. The task is to find an integer having minimum absolute difference 
with given target value K and return this difference.
*/

class GfG
{
      public static int diff;
      public static int maxDiff(Node root, int k)
       {
           diff = Integer.MAX_VALUE;
           findDiff(root,k);
           return diff;
       }
       private static void findDiff(Node root,int k)
       {
           if(root == null)
                return;
            
            int res = Math.abs(k - root.data);
            
            diff = Math.min(res,diff);
            
            if(k < root.data)
                findDiff(root.left,k);
            else
                findDiff(root.right,k);
       }
}
