/*
https://practice.geeksforgeeks.org/problems/remove-duplicates-from-an-unsorted-linked-list/1/?ref=self
Given an unsorted linked list of N nodes. The task is to remove duplicate elements from this unsorted Linked List. 
If all the nodes in the linked list are equal, then remove n-1 nodes.
*/

class GfG
{
    // Function to remove duplicates from the given linked list
    Node removeDuplicates(Node head)
    {
         Node current = head;
         TreeSet<Integer> set = new TreeSet<Integer>();
         Node prev = null;
         while(current != null)
         {
             if(set.contains(current.data))
             {
                 prev.next = current.next;
             }
             else
             {
                 set.add(current.data);
                 prev = current;
             }
             current = current.next;
         }
         return head;
    }
    
}
