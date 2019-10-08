/*
https://practice.geeksforgeeks.org/problems/rotate-a-linked-list/1
Given a singly linked list of size N. The task is to rotate the linked list counter-clockwise by k nodes, where k is a 
given positive integer smaller than or equal to length of the linked list.
*/

class Rotate {
    
     /*  This function should rotate list counter-
    clockwise by k and return new head (if changed) */
    public Node rotate(Node head, int k) {
        if(head == null)
            return null;
        Node pre = null;
        Node cur = head;
        while(k-- > 0 && cur != null)
        {
            pre = cur;
            cur = cur.next;
        }
        if(cur == null)
            return head;
        Node head2 = cur;
        pre.next = null;
        while(cur.next!= null)
            cur = cur.next;
        cur.next = head;
        return head2;
    }
}
