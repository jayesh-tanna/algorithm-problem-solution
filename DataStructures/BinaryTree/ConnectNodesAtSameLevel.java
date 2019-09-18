/*
https://practice.geeksforgeeks.org/problems/connect-nodes-at-same-level/1/?ref=self
Given a binary tree, connect the nodes that are at same level.
*/

static void connect(Node root)
    {
        if(root == null)
            return;
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);
        while(queue.size() > 0)
        {
            int n = queue.size();
            for(int i=0;i<n;i++)
            {
                Node temp = queue.remove();
                if(temp.left != null)
                    queue.add(temp.left);
                if(temp.right != null)
                    queue.add(temp.right);
                if(i < n - 1)
                    temp.nextRight = queue.peek();
            }   
        }
    }
