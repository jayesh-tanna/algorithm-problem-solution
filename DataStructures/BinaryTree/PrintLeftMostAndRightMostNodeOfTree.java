/*
https://practice.geeksforgeeks.org/problems/leftmost-and-rightmost-nodes-of-binary-tree/1
Given a Binary Tree, Print the corner nodes at each level. The node at the leftmost and the node at the rightmost.
*/

class GfG
{
    public static void printCorner(Node root)
    {
        if(root == null) 
            return;
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        while(!q.isEmpty())
        {
            int n = q.size();
            for(int i=0;i<n;i++)
            {
                Node temp = q.remove();
                if(i == 0 || i == n-1)
                    System.out.print(temp.data + " ");
                if(temp.left != null)
                    q.add(temp.left);
                if(temp.right != null)
                    q.add(temp.right);
            }
        }
    }
    
}
