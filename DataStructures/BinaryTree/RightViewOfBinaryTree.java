/*
https://practice.geeksforgeeks.org/problems/right-view-of-binary-tree/1
Given a Binary Tree, print Right view of it. Right view of a Binary Tree is set of nodes visible when tree is viewed from right side.
*/

class Tree{
    void rightView(Node node) {
        if(node == null)
            return;
        Queue<Node> q = new LinkedList<>();
        q.add(node);
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
                if(i == n-1)
                    System.out.print(t.data + " ");
            }
        }
    }
}
