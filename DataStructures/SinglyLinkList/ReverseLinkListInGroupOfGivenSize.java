/*
https://practice.geeksforgeeks.org/problems/reverse-a-linked-list-in-groups-of-given-size/1
Given a linked list of size N. The task is to reverse every k nodes (where k is an input to the function) in the linked list.
Example:
Input:
1
8
1 2 2 4 5 6 7 8
4

Output:
4 2 2 1 8 7 6 5
*/

class GfG
{
    public static Node reverse(Node head, int k)
    {
        if(head == null || k <= 1)
            return head;
        int count = 0;
        Node cur = head, next = null, prev = null;
        while(cur != null && count++ < k)
        {
            next = cur.next;
            cur.next = prev;
            prev = cur;
            cur = next;
        }
        if(cur != null)
            head.next = reverse(next,k);
        return prev;
    }
}
