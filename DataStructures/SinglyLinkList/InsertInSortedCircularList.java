/*
https://practice.geeksforgeeks.org/problems/sorted-insert-for-circular-linked-list/1/?ref=self
Given a sorted circular linked list, the task is to insert a new node in this circular list 
so that it remains a sorted circular linked list.
*/

class GfG
{
	public static void insert(Node head,int value,int n)
    {
        Node newNode = new Node(value);
        if(head == null)
        {
            head = newNode;
            head.next = newNode;
            print(head);
            return;
        }
        Node cur = head;
        if(value <= head.data)
        {
            while(cur.next != head)
                cur = cur.next;
            cur.next = newNode;
            newNode.next = head;
            head = newNode;
            print(head);
            return;
        }
        Node pre = null;
        while(cur.next != head && value > cur.data)
        {
            pre = cur;
            cur = cur.next;
        }
        if(cur.next == head && value > cur.data)//insert at end
        {
            cur.next = newNode;
            newNode.next = head;
        }
        else
        {
            pre.next = newNode;
            newNode.next = cur;
        }
        print(head);
    }
    private static void print(Node head)
    {
        Node cur = head;
        do
        {
            System.out.print(cur.data + " ");
            cur = cur.next;
        }while(cur != head);
    }
}
