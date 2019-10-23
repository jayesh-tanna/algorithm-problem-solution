/*
https://practice.geeksforgeeks.org/problems/delete-keys-in-a-linked-list/1
Given a single linked list and an integer x. Your task is to complete the function deleteAllOccurances() which deletes all 
occurences of a key x present in the linked list. The function takes two arguments: the head of the linked list and an integer x. 
The function should return the head of the modified linked list.
*/

class GfG
{
    Node deleteAllOccurances(Node head, int x)
    {
        if(head == null)
            return head;
        Node cur = head;
        Node prev = null;
        while(cur != null)
        {
            while(cur != null && cur.data == x)
                cur = cur.next;
            if(prev == null && cur != head)
                head = cur;
            else if(prev != null && prev.next != cur)
                prev.next = cur;
            prev = cur;
            if(cur != null)
                cur = cur.next;
        }
        return head;
    }
}
