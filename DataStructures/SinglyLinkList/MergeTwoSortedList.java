/*
https://practice.geeksforgeeks.org/problems/merge-two-sorted-linked-lists/1
Given two sorted linked lists consisting of N and M nodes respectively. The task is to merge both of the list (in-place) and return head of the merged list.

Note: It is strongly recommended to do merging in-place using O(1) extra space.
*/


class LinkedList
{
    Node sortedMerge(Node headA, Node headB) 
    {
    if (headA == null)
                return headB;
            if (headB == null)
                return headA;
            Node cur1 = headA;
            Node cur2 = headB;
            Node headC = null;
            Node cur3 = null;
            while (cur1 != null && cur2 != null)
            {
                if (cur1.data < cur2.data)
                {
                    if (headC == null)
                    {
                        headC = cur1;
                        cur3 = cur1;
                    }
                    else
                    {
                        cur3.next = cur1;
                        cur3 = cur3.next;
                    }
                    cur1 = cur1.next;
                }
                else
                {
                    if (headC == null)
                    {
                        headC = cur2;
                        cur3 = cur2;
                    }
                    else
                    {
                        cur3.next = cur2;
                        cur3 = cur3.next;
                    }
                    cur2 = cur2.next;
                }
            }
            if (cur1 == null)
                cur3.next = cur2;
            if (cur2 == null)
                cur3.next = cur1;
            return headC;    
   } 
}
