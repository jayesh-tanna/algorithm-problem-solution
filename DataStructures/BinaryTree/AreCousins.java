/*
https://practice.geeksforgeeks.org/problems/check-if-two-nodes-are-cousins/1
Given the binary Tree and the two nodes say ‘a’ and ‘b’, determine whether the two node values are cousins of each other or not.

Two nodes value are cousins of each other if they are at same level and have different parents.
*/

class Solution {
    
    // Function to complete
    public boolean isCousins(Node root, int x, int y) {
        if(root == null)
            return false;
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        while(!q.isEmpty())
        {
            int n = q.size();
            int j = 0;
            for(int i=0;i<n;i++)
            {
                Node temp = q.remove();
                boolean sameLeftToRight = temp.left != null && temp.left.data == x 
                                            && temp.right != null && temp.right.data == y;
                boolean sameRightToLeft = temp.left != null && temp.left.data == y 
                                            && temp.right != null && temp.right.data == x;
                if(sameLeftToRight == true || sameRightToLeft == true)
                    return false;
                if(temp.left != null && (temp.left.data == x || temp.left.data == y))
                    j++;
                if(temp.right != null && (temp.right.data == x || temp.right.data == y))
                    j++;
                if(j == 2)
                    return true;
                if(temp.left != null)
                    q.add(temp.left);
                if(temp.right != null)
                    q.add(temp.right);
            }
        }
        return false;
    }
}
