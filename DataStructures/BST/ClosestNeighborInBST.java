/*
https://practice.geeksforgeeks.org/problems/closest-neighbor-in-bst/1
Given a binary search tree and a number N. Your task is to complete the function findMaxforKey(), 
that find's the greatest number in the binary search tree that is less than or equal to N. 
Print the value of the element if it exists otherwise print -1.
*/

class GfG
{
    public static int findMaxforKey(Node root, int val, int size)
    {
        if(root == null)
            return -1;
        int res = findMaxforKey(root.left,val,size);
        if(root.data <= val)
            res = Math.max(root.data,res);
        else
            return res;
        int rightRes = findMaxforKey(root.right,val,size);
        return Math.max(res,rightRes);
    }
}
