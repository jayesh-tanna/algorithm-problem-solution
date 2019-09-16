/*
https://practice.geeksforgeeks.org/problems/maximum-width-of-tree/1/?ref=self
Given a Binary Tree, find the maximum width of it. Maximum width is defined as the maximum number of nodes in any level.
For example, maximum width of following tree is 4 as there are 4 nodes at 3rd level.

          1
       /     \
     2        3
   /    \    /    \
  4    5   6    7
    \
      8
*/


class Tree
{
    // /* Function to get the maximum width of a binary tree*/
    int getMaxWidth(Node root)
    {
        if(root == null)
            return -1;
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        int max = Integer.MIN_VALUE;
        while(q.size() > 0)
        {
            int n = q.size();
            if(n > max){
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
        }
        return max;
    }		
}
