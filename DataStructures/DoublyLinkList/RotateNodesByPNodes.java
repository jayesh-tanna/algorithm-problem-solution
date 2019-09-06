/*
https://practice.geeksforgeeks.org/problems/rotate-doubly-linked-list-by-p-nodes/1
Given a doubly linked list, rotate the linked list counter-clockwise by P nodes. 
Here P is a given positive integer and is smaller than the count of nodes(N) in a linked list.
*/


class Gfg {
    Node rotateP (Node head, int p){
        Node current = head;
        int count = 1;
        while(count++ < p)
            current = current.next;
        Node lastNode = current;
        while(current.next != null)
            current = current.next;
        lastNode.next.prev = null;
        current.next = head;
        head.prev = current;
        head = lastNode.next;
        lastNode.next = null;
        return head;
    }
}
