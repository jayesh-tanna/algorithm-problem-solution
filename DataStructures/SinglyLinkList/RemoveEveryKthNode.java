/*
https://practice.geeksforgeeks.org/problems/remove-every-kth-node/1
Given a singly linked list, your task is to remove every kth node from the linked list.
*/

class GfG
{
    /*You are required to complete this method*/
    Node delete(Node head, int k)
    {
        if(k == 0)
            return head;
        if(k == 1 || head == null)
            return null;
        Node current = head;
        Node pre = null;
        int count = 1;
        while(current != null)
        {
            if(count % k == 0)
                pre.next = current.next;
            count++;
            pre = current;
            current = current.next;
        }
        return head;
    }
}
