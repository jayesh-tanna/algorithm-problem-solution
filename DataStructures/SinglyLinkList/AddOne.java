/*
https://practice.geeksforgeeks.org/problems/add-1-to-a-number-represented-as-linked-list/1
A number (n) is represented in Linked List such that each digit corresponds to a node in linked list. Add 1 to it.

*/

class GfG{
	public Node addOne(Node head){
            Node t = head;
            int sum =0;
            int factor = 1;
            while(t != null){
                sum = sum + t.data * factor;
                t = t.next;
                factor *= 10;
            }
            sum++;
            String number = Integer.toString(sum);
            t = head;
            for(int i=0;i<number.length();i++){
                int n = Character.getNumericValue(number.charAt(i));
                if(i==0){
                    t.data = n;
                }
                else{
                    if(t.next == null){
                       t.next = new Node(n);
                    }
                     t = t.next;
                     t.data = n;
                }
            }
            return head;
         }
}
