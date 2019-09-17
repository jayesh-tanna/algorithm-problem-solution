/*
https://practice.geeksforgeeks.org/problems/next-right-node/1
Given a Binary tree and a key in the binary tree, find the node right to the given key. 
If there is no node on right side, then return -1.
*/


public static Node nextRight(Node root, int k)
    {
        if(root == null)
            return null;
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        while(q.size() > 0)
        {
            int n = q.size();
            for(int i=0;i<n;i++)
            {
                Node t = q.remove();
                if(t.data == k)
                {
                    if(i + 1 == n)
                        return null;
                    return q.remove();
                }
                if(t.left != null)
                    q.add(t.left);
                if(t.right != null)
                    q.add(t.right);
            }
        }
        return null;
    }
