/*
https://practice.geeksforgeeks.org/problems/split-singly-linked-list-alternatingly/1
Given a singly linked list of size N. Your task is to complete the function alternatingSplitList() that splits the given linked list into two smaller list. The sublists should be made from alternating elements from the original list.
Note: the sublist should in the order with respect to original list.
*/

class Solution {
    public void alternatingSplitList(Node head)
    {
        if(head == null)
            return;
        Node cur = head;
        Node cur1 = null,cur2 = null,head1 = null,head2 = null;
        boolean isOdd = true;
        while(cur != null)
        {
            if(isOdd)
            {
                if(head1 == null)
                {
                    head1 = cur;
                    cur1 = cur;
                }
                else
                {
                    cur1.next = cur;
                    cur1 = cur1.next;
                }
            }
            else
            {
                if(head2 == null)
                {
                    head2 = cur;
                    cur2 = cur;
                }
                else
                {
                    cur2.next = cur;
                    cur2 = cur2.next;
                }
            }
            cur = cur.next;
            isOdd = !isOdd;
        }
        cur1.next = null;
        if(cur2 != null)
            cur2.next = null;
        cur1 = head1;
        while(cur1 != null)
        {
            System.out.print(cur1.data + " ");
            cur1 = cur1.next;
        }
        System.out.println();
        cur2 = head2;
        while(cur2 != null)
        {
            System.out.print(cur2.data + " ");
            cur2 = cur2.next;
        }
    }
}
