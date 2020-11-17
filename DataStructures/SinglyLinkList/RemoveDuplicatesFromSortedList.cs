 /*
     * For your reference:
     *
     * SinglyLinkedListNode {
     *     int data;
     *     SinglyLinkedListNode next;
     * }
     *
     */
    static SinglyLinkedListNode removeDuplicates(SinglyLinkedListNode head) {
        if(head == null || head.next == null)
            return head;
        
        SinglyLinkedListNode cur = head;
        while(cur != null)
        {
            SinglyLinkedListNode next = cur.next;
            while(next != null && cur.data == next.data)
                next = next.next;
            cur.next = next;
            cur = cur.next;
        }
        return head;
    }
