/*Reverse singly link list*/


class ReverseLL
{
    // This function should reverse linked list and return
    // head of the modified linked list.
    Node reverseList(Node head)
    {
        if(head == null || head.next == null)
            return head;
        Node pre = null, next = null;
        while(head != null)
        {
            next = head.next;
            head.next = pre;
            pre = head;
            head = next;
        }
        return pre;
    }
}
