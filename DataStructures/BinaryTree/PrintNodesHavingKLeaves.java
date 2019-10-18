/*
https://practice.geeksforgeeks.org/problems/print-nodes-having-k-leaves/1
Given a binary tree and a integer value K, the task is to print all nodes data in given binary tree having exactly K 
leaves in sub-tree rooted with them. If no node is found then print -1.
*/

class GfG
{
    public void btWithKleaves(Node root, int k)
    {
        if(k <= 0 || root == null){
            System.out.print("-1");    
            return;
        }
        int res = countLeaves(root,k);
        if(res == 0)
            System.out.print("-1");
    }
    private int countLeaves(Node root,int k)
    {
        if(root == null)
            return 0;
        if(root.left == null && root.right == null)
            return 1;
        int total = countLeaves(root.left,k) + countLeaves(root.right,k);
        if(total == k)
            System.out.print(root.data + " ");
        return total;
    }
}
