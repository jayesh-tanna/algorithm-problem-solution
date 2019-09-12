/*
https://practice.geeksforgeeks.org/problems/maximum-node-level/1
Find the level in a binary tree which has the maximum number of nodes. The root is at level 0.
*/

class GfG
{
    public static int maxNodeLevel(Node node)
    {
        if(node == null)
            return -1;
        Queue<Node> q = new LinkedList<>();
        q.add(node);
        int level = 0;
        int max = Integer.MIN_VALUE;
        int requiredLevel = 0;
        while(q.size() > 0)
        {
            int n = q.size();
            if(n > max){
                requiredLevel = level;
                max = n;
            }
            for(int i=0;i<n;i++)
            {
                Node t = q.remove();
                if(t.left != null)
                    q.add(t.left);
                if(t.right != null)
                    q.add(t.right);
            }
            level++;
        }
        return requiredLevel;
    }
}
