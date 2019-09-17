/*
https://practice.geeksforgeeks.org/problems/odd-even-level-difference/1
Given a a Binary Tree, your task is to complete the function getLevelDiff which  returns the difference between the sum of nodes at
odd level and the sum of nodes at even level . 
The function getLevelDiff  takes only one argument  ie the root of the binary tree . 
*/

class GfG
{   /*You are required to complete this function*/
    int getLevelDiff(Node root)
    {
        if(root == null)
            return -1;
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        int level = 1;
        int oddSum = 0, evenSum = 0;
        while(q.size() > 0)
        {
            int n = q.size();
            boolean oddLevel = level % 2 != 0;
            for(int i=0;i<n;i++)
            {
                Node t = q.remove();
                if(oddLevel)
                    oddSum += t.data;
                else
                    evenSum += t.data;
                if(t.left != null)
                    q.add(t.left);
                if(t.right != null)
                    q.add(t.right);
            }
            level++;
        }
        return oddSum - evenSum;
    }
}
