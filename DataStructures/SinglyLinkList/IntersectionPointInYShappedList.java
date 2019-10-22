/*
https://practice.geeksforgeeks.org/problems/intersection-point-in-y-shapped-linked-lists/1/?ref=self
There are two singly linked lists of size N and M in a system. But, due to some programming error the end node of one of the linked list got linked into one of the node of second list, forming a inverted Y shaped list. 
Write a program to get the point where two linked lists intersect each other.
*/

class Intersect
{
	int intersectPoint(Node head1, Node head2)
	{
	    int c1 = 0, c2 = 0;
	    Node cur1 = head1;
	    Node cur2 = head2;
	    while(cur1 != null)
	    {
	        c1++;
	        cur1 = cur1.next;
	    }
	    while(cur2 != null)
	    {
	        c2++;
	        cur2 = cur2.next;
	    }
	    int d = Math.abs(c1-c2);
	    cur1 = head1;
	    cur2 = head2;
	    if(c1 > c2)
	    {
	        while(d-- > 0)
	            cur1 = cur1.next;
	    }
	    else if(c2 > c1)
	    {
	        while(d-- > 0)
	            cur2 = cur2.next;
	    }
	    while(cur1 != null && cur2 != null && cur1 != cur2)
	    {
	        cur1 = cur1.next;
	        cur2 = cur2.next;
	    }
	    if(cur1 == null || cur2 == null)
	        return -1;
	   return cur1.data;     
	}
}
