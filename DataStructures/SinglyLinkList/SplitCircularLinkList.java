/*
https://practice.geeksforgeeks.org/problems/split-a-circular-linked-list-into-two-halves/1
Given a Cirular Linked List split it into two halves circular lists. If there are odd number of nodes in the given circular linked list then out of the resulting two halved lists, first list should have one node more than the second list. 
The resultant lists should also be circular lists and not linear lists.
*/

class gfg
{
        // Function  to split a circular LinkedList
	void splitList(circular_LinkedList list)
    {
        if(list.head == null || list.head.next == list.head)
            return;
        Node slow = list.head;
        Node fast = list.head;
        while(fast.next != list.head && fast.next.next != list.head)
        {
            fast = fast.next.next;
            slow = slow.next;
        }
        if(fast.next != list.head)
            fast = fast.next;
        list.head1 = list.head;
        list.head2 = slow.next;
        fast.next = slow.next;
        slow.next = list.head1;
	}
}
