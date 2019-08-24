/*
https://practice.geeksforgeeks.org/problems/kth-largest-element-in-bst/1
Given a Binary search tree. Your task is to complete the function which will return the 
Kth largest element without doing any modification in Binary Search Tree.
*/

class GfG
{
    static int count;
    public void kthLargest(Node root,int k)
    {
        count = 0;
        int result = getKthLargestElement(root,k);
        System.out.println(result);
    }
    public int getKthLargestElement(Node root,int k){
        if(root == null)
            return 0;
        int r = getKthLargestElement(root.right,k);
        if(r != 0)
            return r;
        if(++count == k)
            return root.data;
        return getKthLargestElement(root.left,k);
    }
}
