/*
https://practice.geeksforgeeks.org/problems/remove-duplicate-element-from-sorted-linked-list/1/?ref=self
Given a singly linked list consisting of N nodes. The task is to remove duplicates (nodes with duplicate values) from the given list (if exists).

Note: Try not to use extra space. Expected time complexity is O(N). The nodes are arranged in a sorted way.
*/

class GfG
{
    // head: head node
    Node removeDuplicates(Node root)
    {
	    Node current = root;
	    while(current != null)
	    {
	        current.next = getNextNode(current);
	        current = current.next;
	    }
	    return root;
    }
    Node getNextNode(Node node)
    {
        int data = node.data;
        while(node.next != null && node.next.data == data)
            node = node.next;
        return node.next;
    }
}
