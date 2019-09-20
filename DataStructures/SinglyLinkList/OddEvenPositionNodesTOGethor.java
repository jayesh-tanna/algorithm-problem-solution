/*
https://practice.geeksforgeeks.org/problems/rearrange-a-linked-list/1/?ref=self
Given a singly linked list, the task is to rearrange it in a way that all odd position nodes are 
together and all even positions node are together.
*/


Node rearrange(Node head)
    {
          if(head == null)
                return null;
          if(head.next == null)
                return head;
          int[] evenPositionValues = new int[50];
          int[] oddPositionValues = new int[50];
          Node current = head;
          int i = 0,o=0,e=0;
          while(current != null)
          {
              if(i%2 == 0)
                oddPositionValues[o++] = current.data;
            else
                evenPositionValues[e++] = current.data;
              current = current.next;
              i++;
          }
          current = head;
          for(i = 0;i<o;i++)
          {
              current.data = oddPositionValues[i];
              current = current.next;
          }
          for(i=0;i<e;i++)
          {
              current.data = evenPositionValues[i];
              current = current.next;
          }
          return head;
     }
