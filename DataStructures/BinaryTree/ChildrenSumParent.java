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
