/*
Given a linked list L of N nodes, sorted in ascending order based on the absolute values of its data. Sort the linked list according to the actual values.
Ex: Input : 1 -> -2 -> -3 -> 4 -> -5 
      Output: -5 -> -3 -> -2 -> 1 -> 4
https://practice.geeksforgeeks.org/problems/absolute-list-sorting/1
*/


Node sortedList(Node head)
	{
	    if(head == null)
	        return head;
		Node current = head;
		Node preNode = null;
		while(current != null)
		{
		    if(current.data < 0)
		    {
		        Node nextNode = current.next;
		        current.next = head;
		        if(preNode == null)
		            preNode = current;
		        preNode.next = nextNode;
		        head = current;
		        current = nextNode;
		    }
		    else
		    {
		        preNode = current;
		        current = current.next;
		    }
		}
		return head;
	}
