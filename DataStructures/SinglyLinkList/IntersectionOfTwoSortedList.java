/*
https://practice.geeksforgeeks.org/problems/intersection-of-two-sorted-linked-lists/1
Given two lists sorted in increasing order, create a new list representing the intersection of the two lists. 
The new list should be made with its own memory — the original lists should not be changed.
*/


class GfG
{
    Intersect llist3 = new Intersect(); // object of LinkedList having Intersection of two LinkedLists
    // Function  to find Intersection of two LinkedLists
    void getIntersection(Node head1, Node head2)
    {   
        Node cur1 = head1, cur2 = head2;
        Node cur3 = null;
        while(cur1 != null && cur2 != null)
        {
            if(cur1.data == cur2.data)
            {
                if(llist3.head == null)
                {
                    llist3.head = new Node(cur1.data);
                    cur3 = llist3.head;
                }
                else
                {
                    cur3.next = new Node(cur1.data);
                    cur3 = cur3.next;
                }
                cur1 = cur1.next;
                cur2 = cur2.next;
            }
            else if(cur1.data < cur2.data)
                cur1 = cur1.next;
            else
                cur2 = cur2.next;
        }
    }
}
