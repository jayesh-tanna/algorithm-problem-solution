/*
https://practice.geeksforgeeks.org/problems/flattening-a-linked-list/1/?ref=self
Given a Linked List of size N, where every node represents a linked list and contains two pointers of its type:
(i) a next pointer to the next node,
(ii) a bottom pointer to a linked list where this node is head.

You have to flatten the linked list to a single linked list which should be sorted.
*/

class GfG
{
    Node flatten(Node head)
    {
        Node cur = head;
        Node bottomCur = head;
        while(cur != null)
        {
            while(bottomCur != null && bottomCur.bottom != null)
                bottomCur = bottomCur.bottom;
            bottomCur.bottom = cur.next;
            bottomCur = bottomCur.bottom;
            cur = cur.next;
        }
        Node sortedHead = sort(head);
        return sortedHead;
    }
    private Node sort(Node head)
    {
        if(head == null || head.bottom == null)
            return head;
        Node middle = getMiddleNode(head);
        Node middleBottom = middle.bottom;
        middle.bottom = null;
        Node left = sort(head);
        Node right = sort(middleBottom);
        Node sortedList = merge(left,right);
        return sortedList;
    }
    private Node merge(Node a,Node b)
    {
        if(a == null)
            return b;
        if(b == null)
            return a;
        Node res = null;
        if(a.data <= b.data){
            res = a;
            res.bottom = merge(a.bottom,b);
        }
        else{
            res = b;
            res.bottom = merge(a,b.bottom);
        }
        return res;
    }
    private Node getMiddleNode(Node head)
    {
        if(head == null)
            return null;
        Node fast = head;
        Node slow = head;
        while(fast.bottom != null && fast.bottom.bottom != null)
        {
            fast = fast.bottom.bottom;
            slow = slow.bottom;
        }
        return slow;
    }
}
