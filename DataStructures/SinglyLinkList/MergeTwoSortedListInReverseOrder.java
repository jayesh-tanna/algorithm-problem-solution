/*
https://practice.geeksforgeeks.org/problems/merge-2-sorted-linked-list-in-reverse-order/1
Given two linked lists of size N and M, which are sorted in non-decreasing order. 
The task is to merge them in such a way that the resulting list is in decreasing order.
*/

Node mergeResult(Node node1, Node node2)
    {
	    Node c1 = node1,c2 = node2;
        Node res = null;
        while(c1 != null && c2 != null)
        {
            if(c1.data <= c2.data)
            {
                Node next = c1.next;
                c1.next = res;
                res = c1;
                c1 = next;
            }
            else
            {
                Node next = c2.next;
                c2.next = res;
                res = c2;
                c2 = next;
            }
        }
        while(c1 != null)
        {
            Node next = c1.next;
            c1.next = res;
            res = c1;
            c1 = next;
        }
        while(c2 != null)
        {
            Node next = c2.next;
            c2.next = res;
            res = c2;
            c2 = next;
        }
        
        return res;
    }
