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
}
