/*
https://practice.geeksforgeeks.org/problems/find-k-th-smallest-element-in-bst/1
Given root of binary search tree and K as input, find K-th smallest element in BST. Your task is to return the K-th smallest element in 
BST from the function k_smallest_element().
*/

class gfg2
{   
    static int count = 0;
    public static int kthSmallest(Node root,int k)
    {
        count = 0;
        return smallestUtil(root,k);
    }
    private static int smallestUtil(Node root,int k)
    {
        if(root == null)
            return -1;
        int res = smallestUtil(root.left,k);
        if(res != -1)
            return res;
        count++;
        if(count == k)
            return root.data;
        return smallestUtil(root.right,k);
    }
}
