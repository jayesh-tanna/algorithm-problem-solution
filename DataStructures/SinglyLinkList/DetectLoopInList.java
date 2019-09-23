/*
https://practice.geeksforgeeks.org/problems/detect-loop-in-linked-list/1
Given a linked list of N nodes. The task is to check if the the linked list has a loop. Linked list can contain self loop.
*/

class Loop{
    int detectLoop(Node head) {
        Node fast = head;
        Node slow = head;
        while(fast != null && fast.next != null)
        {
            fast = fast.next.next;
            slow = slow.next;
            if(fast == slow)
                return 1;
        }
        return 0;
    }
}
