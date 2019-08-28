/*
https://practice.geeksforgeeks.org/problems/count-pairs-whose-sum-is-equal-to-x/1
Given two linked list of size N1 and N2 respectively of distinct elements, 
your task is to complete the function countPairs(), 
which returns the count of all pairs from both lists whose sum is equal to the given value X. 
*/

public static int GetCount(Node head1,Node head2,int x)
    {
        HashSet<int> set = new HashSet<int>();
        Node temp = head1;
        while(temp != null){
            set.Add(temp.data);
            temp = temp.next;
        }
        int count = 0;
        temp = head2;
        while(temp != null) {
            if(set.Contains(x - temp.data))
                count++;
            temp = temp.next;
        }
        
        return count;
   }
