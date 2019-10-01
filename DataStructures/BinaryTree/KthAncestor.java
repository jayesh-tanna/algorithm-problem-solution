/*
https://practice.geeksforgeeks.org/problems/kth-ancestor-in-a-tree/1
Given a binary tree of size  N, a node and a positive integer K., your task is to complete the function kthAncestor(), 
the function should return the Kth ancestor of 
the given node in the binary tree. If there does not exist any such ancestor then return -1.
*/

class Solution {
    List<Integer> list;
    public int kthAncestor(Node root, int k, int node){
        if(k <= 0)
            return -1;
        list = new ArrayList<Integer>();
        kThAncestorUtil(root,k,node);
        if (k > list.size() - 1)
            return -1;
        return list.get(list.size() - 1 - k);
    }
    public boolean kThAncestorUtil(Node root,int k,int node)
    {
        if(root == null)
            return false;
        list.add(root.data);
        if(root.data == node || kThAncestorUtil(root.left,k,node) || kThAncestorUtil(root.right,k,node))
            return true;
        list.remove(list.size()-1);
        return false;
    }
}
