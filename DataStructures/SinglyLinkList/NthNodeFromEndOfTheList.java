/*
https://practice.geeksforgeeks.org/problems/nth-node-from-end-of-linked-list/1
Given a linked list consisting of L nodes and given a number N. The task is to find the Nth node from the end of the linked list.
*/

int getNthFromLast(Node head, int n)
    {
        int c = 0;
        Node current = head;
        while(c++ < n){
            if(current == null)
                return -1;
            current = current.next;
        }
        Node mainPointer = head;
        while(current != null)
        {
            mainPointer = mainPointer.next;
            current = current.next;
        }
        return mainPointer.data;
    }
