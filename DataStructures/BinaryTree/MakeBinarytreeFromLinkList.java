/*
https://practice.geeksforgeeks.org/problems/make-binary-tree/1
Given a Linked List Representation of Complete Binary Tree. The task is to construct the Binary tree.

Note : The complete binary tree is represented as a linked list in a way where if root node is stored at position i, its left, and right children are stored at position 2*i+1, 2*i+2 respectively.
*/


class GfG 
{
    public static Tree convert(Node head, Tree node) 
    {
        if(head == null)
            return node;
        node = new Tree(head.data);
        Queue<Tree> queue = new LinkedList<Tree>();
        queue.add(node);
        Node curr = head.next;
        while(!queue.isEmpty())
        {
            int n = queue.size();
            for(int i=0;i<n;i++)
            {
                if(curr == null)
                    return node;
                Tree temp = queue.remove();
                temp.left = new Tree(curr.data);
                curr = curr.next;
                if(curr == null)
                    return node;
                temp.right = new Tree(curr.data);
                curr = curr.next;
                queue.add(temp.left);
                queue.add(temp.right);
            }
        }
        return node;
    }
}
