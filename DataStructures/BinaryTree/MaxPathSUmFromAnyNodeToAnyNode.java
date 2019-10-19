/*
https://practice.geeksforgeeks.org/problems/maximum-path-sum-from-any-node/1
Given a binary tree of N edges, where every node contains distinct data. The task is to find the maximum path sum. 
The path may start and end at any node in the tree.
*/

class GfG
{
    // This function should returns sum of
    // maximum sum path from any node in
    // a tree rooted with given root.
    static int sum = 0;
    int findMaxSum(Node node)
    {
        sum = 0;
        findSumUtil(node);
        return sum;
    }
    int findSumUtil(Node node)
    {
        if(node == null)
            return 0;
        int l = findSumUtil(node.left);
        int r = findSumUtil(node.right);
        int singleSum = Math.max(node.data, Math.max(l,r) + node.data);
        int allSum = Math.max(singleSum,l + r + node.data);
        sum = Math.max(allSum,sum);
        return singleSum;
    }
}
