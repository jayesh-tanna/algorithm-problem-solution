/*
https://practice.geeksforgeeks.org/problems/find-a-pair-with-given-target-in-bst/1/?ref=self
Given a Binary Search Tree and a target sum, write a function that returns true 
if there is a pair with sum equals to target sum, otherwise return false.
*/

class GfG
{
    static HashSet<Integer> set = new HashSet<Integer>();
    public static boolean findPair(Node root, int target)
    {
        set.clear();
        return pairExist(root,target,1);
    }
    private static boolean pairExist(Node root,int target,int t)
    {
        if(root == null)
            return false;
        if(set.contains(target - root.data))
            return true;
        else
        {
            set.add(root.data);
            return pairExist(root.left,target,t) || pairExist(root.right,target,t);
        }
    }
}
