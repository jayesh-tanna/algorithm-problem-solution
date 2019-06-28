//https://www.hackerrank.com/challenges/insert-a-node-at-a-specific-position-in-a-linked-list/problem
//SOlution in c#

static SinglyLinkedListNode insertNodeAtPosition(SinglyLinkedListNode head, int data, int position) {
        int count = 0;
        SinglyLinkedListNode temp = head;
        SinglyLinkedListNode prev = null;
        while(count < position && temp.next != null){
            count++;
            prev = temp;
            temp = temp.next;
        }
        SinglyLinkedListNode node = new SinglyLinkedListNode(data);
        prev.next = node;
        node.next = temp;
        return head;   
    }
