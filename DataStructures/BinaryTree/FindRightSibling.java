/*
https://practice.geeksforgeeks.org/problems/right-sibling-in-binary-tree/1
Given a binary tree, your task is to complete the function findRightSibling(), 
that should return the right sibling to a given node if it doesn’t exist return null.
*/

class GFG
{
    public static Node findRightSibling(Node node)
    {
        if(node == null)
            return null;
        Node root = findRoot(node);
        Queue<Node> queue = new LinkedList<Node>();
        queue.add(root);
        while(!queue.isEmpty())
        {
            int n = queue.size();
            for(int i=0;i<n;i++)
            {
                Node temp = queue.remove();
                if(temp == node)
                {
                    if(i == n-1)
                        return null;
                    else
                        return queue.peek();
                }
                if(temp.left != null)
                    queue.add(temp.left);
                if(temp.right != null)
                    queue.add(temp.right);
            }
        }
        return null;
    }
    private static Node findRoot(Node node)
    {
        if(node == null)
            return null;
        if(node.parent == null)
            return node;
        return findRoot(node.parent);
    }
}
