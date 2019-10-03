/*
https://practice.geeksforgeeks.org/problems/root-to-leaf-path-sum/1
Given a Binary Tree and a sum s, your task is to check whether there is a root to leaf path in that tree with the following sum . 
You are required to complete the function hasPathSum. You should not read any input from stdin/console. 
There are multiple test cases. For each test case, this method will be called individually.
*/

class GfG
{
    /*you are required to complete this function */
    boolean hasPathSum(Node node, int sum)
    {
        return hasPathSumUtil(node,sum,0);
    }
    boolean hasPathSumUtil(Node root,int sum,int pathSum)
    {
        if(root == null)
            return false;
        if(root.left == null && root.right == null)
            return (pathSum + root.data == sum);
        pathSum += root.data;
        return hasPathSumUtil(root.left,sum,pathSum) ||
        hasPathSumUtil(root.right, sum, pathSum);
    }
}
