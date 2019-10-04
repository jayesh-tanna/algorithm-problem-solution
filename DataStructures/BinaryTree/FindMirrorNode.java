/*
https://practice.geeksforgeeks.org/problems/mirror-of-a-given-node/1
Given a Binary tree, the problem is to find mirror of a given node. The mirror of a node is a node which exist at the 
mirror position of node in opposite subtree at the root.
*/

class Solution{
    public int mirror(Node root, int key)
    {
        if(root == null)
            return -1;
        if(root.data == key)
            return root.data;
        return findMirror(root.left,root.right,key);
    }
    private int findMirror(Node left,Node right,int key)
    {
        if(left == null || right == null)
            return -1;
        if(left.data == key)
            return right.data;
        if(right.data == key)
            return left.data;
        int res = findMirror(left.left,right.right,key);
        if(res != -1)
            return res;
        return findMirror(left.right,right.left,key);
    }
}
