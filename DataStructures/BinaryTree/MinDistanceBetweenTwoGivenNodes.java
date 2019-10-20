/*
https://practice.geeksforgeeks.org/problems/min-distance-between-two-given-nodes-of-a-binary-tree/1
Given a binary tree and two node values your task is to find the minimum distance between them.
*/


class GfG
{
    int findDist(Node root, int a, int b)
    {
        if(root == null)
            return -1;
        Vector<Integer> l1 = new Vector<Integer>();
        Vector<Integer> l2 = new Vector<Integer>();
        boolean res = findPath(root,a,l1);
        if(!res)
            return -1;
        res = findPath(root,b,l2);
        if(!res)
            return -1;
        return getDistance(l1,l2);
    }
    boolean findPath(Node root,int x,Vector<Integer> arr)
    {
        if(root == null)
            return false;
        arr.add(root.data);
        if(root.data == x)
            return true;
        boolean lRes = findPath(root.left,x,arr);
        if(lRes == true)
            return lRes;
        boolean rRes = findPath(root.right,x,arr);
        if(rRes == true)
            return rRes;
        if(lRes == false && rRes == false)
            arr.remove(arr.size()-1);
        return lRes || rRes;
    }
    int getDistance(Vector<Integer> l1,Vector<Integer> l2)
    {
        int d = 0;
        int n = Math.min(l1.size(),l2.size());
        int i = 0;
        for(i=0;i<n;i++)
        {
            if(l1.get(i) == l2.get(i))
                continue;
            break;
        }
        return (l1.size() - i) + (l2.size() - i);
    }
}
