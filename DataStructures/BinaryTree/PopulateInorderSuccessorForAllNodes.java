/*
https://practice.geeksforgeeks.org/problems/populate-inorder-successor-for-all-nodes/1
Given a Binary Tree, write a function to populate next pointer for all nodes. 
The next pointer for every node should be set to point to inorder successor.
*/

class GFG
{
    private static Node lastNode = null;
    public static void populateNext(Node root)
    {
        if(root == null)
            return;
        inOrder(root);
    }
    private static void inOrder(Node root)
    {
        if(root == null)
            return;
        inOrder(root.left);
        if(lastNode != null)
            lastNode.next = root;
        lastNode = root;
        inOrder(root.right);
    }
}
