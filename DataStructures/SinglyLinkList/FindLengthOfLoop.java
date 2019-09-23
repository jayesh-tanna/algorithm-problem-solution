/*
https://practice.geeksforgeeks.org/problems/find-length-of-loop/1/?ref=self
Given a linked list of size N. The task is to complete the function countNodesinLoop() that checks whether 
a given Linked List contains loop or not and if loop is present then return the count of nodes in loop or else return 0.
*/

class Loop
{
    int countNodesinLoop(Node head)
    {
	    Node fast = head;
        Node slow = head;
        int count = 0;
        while(fast != null && fast.next != null)
        {
            fast = fast.next.next;
            slow = slow.next;
            if(fast == slow)
            {
                slow = slow.next;
                count++;
                while(slow != fast)
                {
                    slow = slow.next;
                    count++;
                }
                break;
            }
        }
        return count;
    }
}
