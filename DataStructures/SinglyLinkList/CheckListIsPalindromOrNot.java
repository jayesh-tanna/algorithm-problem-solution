/*
https://practice.geeksforgeeks.org/problems/check-if-linked-list-is-pallindrome/1/?ref=self
Given a singly linked list of size N of integers. The task is to check if the given linked list is palindrome or not.
*/

class Palindrome
{
    // Function to check if linked list is palindrome
    boolean isPalindrome(Node head) 
    {
        if(head == null)
            return true;
        Node fast = head;
        Node slow = head;
        Stack<Integer> stack = new Stack<Integer>();
        while(fast != null && fast.next != null)
        {
            fast = fast.next.next;
            stack.push(slow.data);
            slow = slow.next;
        }
        if(fast != null)
            stack.push(slow.data);
        while(slow != null)
        {
            if(stack.isEmpty() || stack.pop() != slow.data)
                return false;
            slow = slow.next;    
        }
        return true;
    }    
}
