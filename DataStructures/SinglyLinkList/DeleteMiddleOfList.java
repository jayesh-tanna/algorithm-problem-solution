/*
https://practice.geeksforgeeks.org/problems/delete-middle-of-linked-list/1
Given a singly linked list, delete middle  of the linked list. For example, if given linked list is 1->2->3->4->5 then linked list should be modified to 1->2->4->5.
If there are even nodes, then there would be two middle nodes, we need to delete the second middle element. For example, if given linked list is 1->2->3->4->5->6 
then it should be modified to 1->2->3->5->6.
*/

class GFG
{
   Node Delete(Node head)
   {
	   if(head == null)
	        return null;
	   if(head.next == null)
	       return new Node(0);
	   Node prev = null;
	   Node slower = head;
	   Node faster = head;
	   while(faster != null && faster.next != null)
	   {
	       prev = slower;
	       faster = faster.next.next;
	       slower = slower.next;
	   }
	   prev.next = slower.next;
	   return head;
   }
}
