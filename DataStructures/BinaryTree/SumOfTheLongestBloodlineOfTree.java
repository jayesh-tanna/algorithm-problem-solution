/*
https://practice.geeksforgeeks.org/problems/sum-of-the-longest-bloodline-of-a-tree/1/?ref=self
Given a binary tree of size N. Your task is to complete the function sumOfLongRootToLeafPath(), that find the sum of all nodes on the longest path from root to leaf node.
If two or more paths compete for the longest path, then the path having maximum sum of nodes is being considered.
*/

class GfG
{
    static int maxSum;
    static int maxLen;
    public int sumOfLongRootToLeafPath(Node root)
    {
        
        maxSum = 0;
        maxLen = 0;
        sumOfLongRootToLeafPath(root,0,0);
        return maxSum;
    }
    public void sumOfLongRootToLeafPath(Node root,int sum,int len)
    {
        if(root == null)
        {
            if(maxLen < len)
            {
                maxSum = sum;
                maxLen = len;
            }
            else if(maxLen == len && maxSum < sum)
                maxSum = sum;
            return;
        }
        sumOfLongRootToLeafPath(root.left,sum + root.data,len+1);
        sumOfLongRootToLeafPath(root.right,sum+root.data,len+1);
    }
}
