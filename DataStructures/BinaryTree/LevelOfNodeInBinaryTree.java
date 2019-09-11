/*
https://practice.geeksforgeeks.org/problems/level-of-a-node-in-binary-tree/1
Given a Binary Tree and a target key, your task is to complete the function getLevel() 
that returns the level of the key from the given binary tree.
*/


if(root == null)
            return 0;
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        int level = 1;
        while(q.size() > 0)
        {
            int n = q.size();
            for(int i=0;i<n;i++)
            {
                Node t = q.remove();
                if(key == t.data)
                    return level;
                if(t.left!= null)
                    q.add(t.left);
                if(t.right!=null)
                    q.add(t.right);
            }
            level++;
        }
        return 0;
