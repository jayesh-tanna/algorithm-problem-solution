/*
https://practice.geeksforgeeks.org/problems/merge-list-alternatingly/1
Given two linked lists, your task is to complete the function mergeList() which 
inserts nodes of second list into first list at alternate positions of first list.
*/

class Solution {
    
    public void mergeAlt(Node head1, Node head2){
        if(head1 == null && head2 == null) 
            return;
        Node cur1 = head1;
        Node cur2 = head2;
        boolean merge = true;
        Node temp = null;
        while(cur1 != null && cur2 != null)
        {
            if(merge)
            {
                Node next = cur2.next;
                cur2.next = cur1.next;
                cur1.next = cur2;
                cur2 = next;
                cur1 = cur1.next;
            }
            else
                cur1 = cur1.next;
            if(cur1.next == null){
                temp = cur1;
                break;
            }
            merge = !merge;
        }
        if(cur2 != null)
            temp.next = cur2;
        cur1 = head1;
        while(cur1 != null)
        {
            System.out.print(cur1.data + " ");
            cur1=cur1.next;
        }
    }
}
