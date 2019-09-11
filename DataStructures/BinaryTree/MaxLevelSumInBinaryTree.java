/*
Given a Binary Tree having positive and negative nodes, the task is to find maximum sum level in it.
https://practice.geeksforgeeks.org/problems/max-level-sum-in-binary-tree/1
*/

public static int maxLevelSum(Node root)
    {
        if(root == null)
            return 0;
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        int maxLevelSum = 0;
        while(q.size() > 0)
        {
            int n = q.size();
            int sum = 0;
            for(int i=0;i<n;i++)
            {
                Node t = q.remove();
                if(t.left!= null)
                    q.add(t.left);
                if(t.right!=null)
                    q.add(t.right);
                sum += t.data;
            }
            maxLevelSum = Math.max(sum,maxLevelSum);
        }
        return maxLevelSum;
    }
