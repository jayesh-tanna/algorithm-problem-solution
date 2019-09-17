/*
https://practice.geeksforgeeks.org/problems/count-leaves-in-binary-tree/1/?ref=self
Given a binary tree, count leaves in it. For example, there are two leaves in below tree

        1
     /      \
   10      39
  /
5
*/



class Utility
{
    int data = 0;
}
class GfG
{
    int countLeaves(Node node) 
    {
        Utility util = new Utility();
        count(node,util);
        return util.data; 
    }
    void count(Node node,Utility util)
    {
        if(node == null)
            return;
        if(node.left == null && node.right == null)
            util.data++;
        count(node.left,util);
        count(node.right,util);
    }
}
