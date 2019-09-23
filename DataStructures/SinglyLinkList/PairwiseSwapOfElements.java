/*
https://practice.geeksforgeeks.org/problems/pairwise-swap-elements-of-a-linked-list-by-swapping-data/1/?ref=self
Given a singly linked list of size N. The task is to swap elements in the linked list pairwise.
*/

class GfG
{
    public static Node pairwiseSwap(Node node)
    {
        Node temp = node;
        while(temp != null && temp.next != null)
        {
            int data = temp.data;
            temp.data = temp.next.data;
            temp.next.data = data;
            temp = temp.next.next;
        }
       return node;
    }
}
