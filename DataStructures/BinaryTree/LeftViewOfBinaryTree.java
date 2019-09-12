
/*
https://practice.geeksforgeeks.org/problems/left-view-of-binary-tree/1/?ref=self
Given a Binary Tree, print Left view of it. Left view of a Binary Tree is set of nodes visible when tree is visited from Left side. 
The task is to complete the function leftView(), which accepts root of the tree as argument.
*/


class Tree
{
    void leftView(Node root)
    {
       if(root == null)
            return;
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        while(q.size() > 0)
        {
            int n = q.size();
            for(int i=0;i<n;i++)
            {
                Node t = q.remove();
                if(t.left != null)
                    q.add(t.left);
                if(t.right != null)
                    q.add(t.right);
                if(i == 0)
                    System.out.print(t.data + " ");
            }
        }
    }
}
