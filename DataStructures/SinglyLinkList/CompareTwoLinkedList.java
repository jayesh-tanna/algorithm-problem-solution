/*
https://practice.geeksforgeeks.org/problems/compare-two-linked-lists/1
Given two string, represented as linked lists (every character is a node->data in the linked list). 
Write a function compare() that works similar to strcmp(), i.e., it returns 0 if both strings are same, 
1 if first linked list is lexicographically greater, and -1 if second is lexicographically greater.
*/

int compare(Node node1, Node node2)
    {
        Node c1 = node1,c2 = node2;
        while(c1 != null && c2 != null)
        {
            if(c1.data > c2.data)
                return 1;
            else if(c2.data > c1.data)
                return -1;
            c1 = c1.next;
            c2 = c2.next;
        }
        if(c1 != null)
            return 1;
        else if(c2 != null)
            return -1;
        return 0;
    }
