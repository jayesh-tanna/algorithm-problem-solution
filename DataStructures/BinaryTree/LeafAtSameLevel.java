/*
https://practice.geeksforgeeks.org/problems/leaf-at-same-level/1
Given a Binary Tree, check if all leaves are at same level or not.
*/

class GfG
{
    boolean check(Node root)
    {
	    int h = height(root);	
	    boolean res = checkLeaves(root,h,0);
	    return res;
    }
    boolean checkLeaves(Node root,int h,int level)
    {
        if(root == null)
            return true;
        boolean l = checkLeaves(root.left,h,level+1);
        boolean r = checkLeaves(root.right,h,level+1); 
        boolean res = false;
        if(root.left == null && root.right == null && h == level + 1)
            res = true;
        if(root.left != null || root.right != null)
            res = true;
        
        return l && r && res;
    }
    int height(Node root)
    {
        return (root == null) ? 0 : Math.max(height(root.left),height(root.right)) + 1;
    }
}
