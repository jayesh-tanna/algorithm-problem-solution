/*
https://practice.geeksforgeeks.org/problems/delete-n-nodes-after-m-nodes-of-a-linked-list/1
Given a linked list, delete N nodes after skipping M nodes of a linked list until the last of the linked list.
*/

class Solution
{
    static void linkdelete(Node head, int M, int N)
    {
        if (head == null)
                return;
            Node current = head;
            while (current != null)
            {
                for (int i = 1; i < M && current != null; i++)
                    current = current.next;
                if (current == null) return;
                Node t = current.next;
                for (int i = 1; i <= N && t != null; i++)
                    t = t.next;
                current.next = t;
                current = t;
            }
    }
}
