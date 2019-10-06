
/*
You are given a pointer/ reference to the node which is to be deleted from the linked list of N nodes. The task is to delete the node. Pointer/ reference to head node is not given. 

Note: No head reference is given to you.
https://practice.geeksforgeeks.org/problems/delete-without-head-pointer/1/?ref=self
*/

class GfG
{
    void deleteNode(Node node)
    {
        Node current = node;
        Node next = node.next;
        Node pre = null;
        while(current != null && next != null)
        {
            int t = current.data;
            current.data = next.data;
            next.data = t;
            pre = current;
            current = current.next;
            next = next.next;
        }
        pre.next = null;
    }
}
