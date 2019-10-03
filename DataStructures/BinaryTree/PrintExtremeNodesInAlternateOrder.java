/*
https://practice.geeksforgeeks.org/problems/extreme-nodes-in-alternate-order/1
Given a binary tree, print nodes of extreme corners of each level but in alternate order.
*/

class GfG{
    public  void printExtremeNode(Node root)
    {
        if(root == null)
            return;
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        boolean fromRight = true;
        while(!q.isEmpty())
        {
            int n = q.size();
            for(int i=0;i<n;i++)
            {
                Node temp = q.remove();
                if(fromRight)
                {
                    if(i == n - 1)
                        System.out.print(temp.data + " ");
                }
                else
                {
                    if(i == 0)
                        System.out.print(temp.data + " ");
                }
                if(temp.left != null)
                    q.add(temp.left);
                if(temp.right != null)
                    q.add(temp.right);
            }
            fromRight = !fromRight;
        }
    }
}
