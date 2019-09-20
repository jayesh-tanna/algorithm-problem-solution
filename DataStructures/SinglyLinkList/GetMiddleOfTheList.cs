/*
https://practice.geeksforgeeks.org/problems/finding-middle-element-in-a-linked-list/1/?ref=self
Given a singly linked list of N nodes. The task is to find middle of the linked list. For example, 
if given linked list is 1->2->3->4->5 then output should be 3.
If there are even nodes, then there would be two middle nodes, we need to print second middle element. 
For example, if given linked list is 1->2->3->4->5->6 then output should be 4.
*/

public static int getMiddle(Node head)
{
    if(head == null)
        return -1;
    Node faster = head;
    Node slower = head;
    while(faster != null && faster.next != null)
    {
        faster = faster.next.next;
        slower = slower.next;
    }
    return slower.data;
}
