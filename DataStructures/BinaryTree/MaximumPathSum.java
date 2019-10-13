/*
https://practice.geeksforgeeks.org/problems/maximum-path-sum/1
Given a binary tree in which each node element contains a number. Find the maximum possible sum from one leaf node to another.
*/

class SumUtil
{
    int sum;
}
class GfG
{
    public static int maxPathSum(Node root)
    {
        SumUtil res = new SumUtil();
        maxPath(root,res);
        return res.sum;
    }
    public static int maxPath(Node root,SumUtil res)
    {
        if(root == null)
            return 0;
        if(root.left == null && root.right == null)
            return root.data;
        int ls = maxPath(root.left,res);
        int rs = maxPath(root.right,res);
        res.sum = Math.max(res.sum, ls + rs + root.data);
        return Math.max(ls,rs) + root.data;
    }
}
