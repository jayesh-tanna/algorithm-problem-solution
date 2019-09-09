/*
https://practice.geeksforgeeks.org/problems/children-sum-parent/1
Given a binary tree, complete the function that returns true if the tree satisfies the following property:
For every node, data value must be equal to the sum of data values in left and right children. 
Consider data value as 0 for NULL child.  Also, leaves are considered to follow the property.
*/



public static int isSumProperty(Node node)
    {
        if(node == null || (node.left == null && node.right == null))
            return 1;
        
        int lSum = node.left == null ? 0 : node.left.data;
        int rSum = node.right == null ? 0 : node.right.data;
        
        int l = isSumProperty(node.left);
        int r = isSumProperty(node.right);
        
        return (l == 1 && r == 1 && node.data == lSum + rSum) ? 1 : 0;
    }

public static int isSumProperty(Node node)
    {
        if(node == null)
            return 1;
        Queue<Node> q = new LinkedList<>();
        q.add(node);
        while(q.size() > 0)
        {
            int n = q.size();
            for(int i=0;i<n;i++)
            {
                int sum = 0;
                Node temp = q.remove();
                if(temp.left != null){
                    sum = temp.left.data;
                    q.add(temp.left);
                }
                if(temp.right != null){
                    sum += temp.right.data;
                    q.add(temp.right);
                }
                if(sum != 0 && sum != temp.data)
                    return 0;
                
            }
        }
        return 1;
    }
