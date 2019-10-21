/*
https://practice.geeksforgeeks.org/problems/check-if-subtree/1/?ref=self
Given two binary trees with head reference as T and S having at most N nodes. The task is to check if S is present as subtree in T.
A subtree of a tree T1 is a tree T2 consisting of a node in T1 and all of its descendants in T1.
*/

class Tree {
    public static boolean isSubtree(Node root1, Node root2) {
        if(root1 == null && root2 == null)
            return false;
        if(root1 == null || root2 == null)
            return false;
        Node subTreeNode = getNode(root1,root2);
        return identical(root1,subTreeNode);
    }
    private static boolean identical(Node root1,Node root2)
    {
        if(root1 == null && root2 == null)
            return true;
        if(root1 == null || root2 == null)
            return false;
        return  root1.data == root2.data 
                && identical(root1.left,root2.left) 
                && identical(root1.right,root2.right);
    }
    private static Node getNode(Node root1,Node root2)
    {
        if(root2 == null)
            return null;
        if(root2.data == root1.data)
            return root2;
        Node res = getNode(root1,root2.left);
        if(res == null)
            res = getNode(root1,root2.right);
        return res;    
    }
}
