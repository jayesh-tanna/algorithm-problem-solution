/*
https://practice.geeksforgeeks.org/problems/insert-in-a-sorted-list/1
Given a sorted singly linked list and a data, your task is to complete the function sortedInsert() that 
inserts the data in the linked list in sorted way i.e. order of the list doesn't changes
*/


class GFG
{
	Node sortedInsert(Node head,int key)
	{
	    Node pre = null;
	    Node current = head;
	    while(current != null && current.data < key)
	    {
	        pre = current;
	        current = current.next;
	    }
	    Node newNode = new Node(key);
	    if(current == head)
	    {
	        newNode.next = head;
	        head = newNode;
	        return head;
	    }
	    pre.next = newNode;
	    newNode.next = current;
	    return head;
	}
}
