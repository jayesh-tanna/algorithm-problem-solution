/*
Given a binary tree containing N+1 with N edges nodes and an integer X. Your task is to complete the function countSubtreesWithSumX() 
that returns the count of the number of subtress having total node’s data sum equal to a value X.
https://practice.geeksforgeeks.org/problems/count-number-of-subtrees-having-given-sum/1/?ref=self
*/
class Utility
{
    int count;
}
class GFG
{
    int countSubtreesWithSumX(Node root, int x)
    {
        Utility util = new Utility();
	    count(root,x,util);
	    return util.count;
    }
    int count(Node root,int x, Utility util)
    {
        if(root == null)
            return 0;
        int l = count(root.left,x,util);
        int r = count(root.right,x,util);
        int sum = l + r + root.data;
        if(sum == x)
            util.count++;
        return sum; 
    }
}
