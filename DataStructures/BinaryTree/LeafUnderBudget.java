/*
https://practice.geeksforgeeks.org/problems/leaf-under-budget/1
Given a binary tree and a budget. Assume you are at the root of the tree(level 1), you need to maximise the count of 
leaf nodes you can visit in your budget if the cost of visiting a leaf node is equal to the level of that leaf node.
*/



public int getCount(Node node, int bud)
    {
        if(node == null)
            return 0;
        Queue<Node> q = new LinkedList<>();
        q.add(node);
        int level = 1;
        int count = 0;
        int sum = 0;
        while(q.size() > 0)
        {
            int n = q.size();
            for(int i=0;i<n;i++)
            {
                Node t = q.remove();
                if(t.left == null && t.right == null)
                {
                    sum+=level;
                    if(sum <= bud){
                        count++;
                    }
                    else
                        return count;
                }
                if(t.left != null)
                    q.add(t.left);
                if(t.right != null)
                    q.add(t.right);
            }
            level++;
        }
        return count;
    }
