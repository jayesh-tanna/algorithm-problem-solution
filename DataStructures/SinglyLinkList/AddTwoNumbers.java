/*
https://practice.geeksforgeeks.org/problems/add-two-numbers-represented-by-linked-lists/1/?ref=self
Given two numbers represented by two linked lists of size N and M. The task is to return a sum list. 
The sum list which is a linked list representation of addition of two input numbers.
2
5 4
3
5 4 3
Output:
0 9 3 
*/


class Add {
    
    // This function will add the numbers represented by two linked lists
    Node addTwoLists(Node first, Node second) {
        int carry = 0;
        Node sumList = null;
        Node prev = null;
        while(first != null || second != null)
        {
            int sum = ((first != null) ? first.data : 0) + 
                       ((second != null) ? second.data : 0) + carry;
            carry = (sum >= 10) ? 1 : 0;
            sum = (sum >= 10) ? sum % 10 : sum;
            if(sumList == null){
                sumList = new Node(sum);
                prev = sumList;
            }
            else{
                prev.next = new Node(sum);
                prev = prev.next;
            }
            if(first != null)
                first = first.next;
            if(second != null)
                second = second.next;
        }
        if(carry > 0)
            prev.next = new Node(carry);
        return sumList;
    }
    
    //Other solution in c#
    private static ListNode AddTwoNumbers(ListNode l1, ListNode l2)
    {
        if (l1 == null) return l2;
        if (l2 == null) return l1;
        ListNode l3 = new ListNode(-1), cur = l3;
        int a, k = 0;
        while (l1 != null || l2 != null)
        {
            if (k == 1)
                a = (l1 == null ? 0 : l1.val) + (l2 == null ? 0 : l2.val) + 1;
            else
                a = (l1 == null ? 0 : l1.val) + (l2 == null ? 0 : l2.val);
            k = 0;
            if (a >= 10)
            {
                cur.val = a - 10;
                k = 1;
            }
            else
                cur.val = a;
            l1 = l1?.next;
            l2 = l2?.next;
            if (l1 == null && l2 == null)
                break;
            cur.next = new ListNode(-1);
            cur = cur.next;
        }
        if (k == 1)
            cur.next = new ListNode(1);
        return l3;
    }
}
