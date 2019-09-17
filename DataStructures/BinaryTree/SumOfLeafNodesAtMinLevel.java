 /*
 https://practice.geeksforgeeks.org/problems/sum-of-leaf-nodes-at-min-level/1
 Given a Binary Tree of size N, your task is to complete the function minLeafSum(), that should return the sum of all the leaf 
 nodes that are at minimum level of the given binary tree.
 */
 
 public int minLeafSum(Node root)
    {
        if(root==null)
            return 0;
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        int sum = 0;
        while(q.size() > 0)
        {
            int n = q.size();
            for(int i=0;i<n;i++)
            {
                Node t = q.remove();
                if(t.left == null && t.right == null)
                    sum += t.data;
                if(t.left != null)
                    q.add(t.left);
                if(t.right != null)
                    q.add(t.right);
            }
            if(sum > 0)
                return sum;
        }
        return 0;
    }
