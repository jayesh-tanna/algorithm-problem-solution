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

static  SLNode rearrange(SLNode head)
        {
            // Corner case 
            if (head == null)
                return null;

            // Initialize first nodes of even and 
            // odd lists 
            SLNode odd = head;
            SLNode even = head.Next;

            // Remember the first node of even list so 
            // that we can connect the even list at the 
            // end of odd list. 
            SLNode evenFirst = even;

            while (1 == 1)
            {
                // If there are no more nodes, 
                // then connect first node of even 
                // list to the last node of odd list 
                if (odd == null || even == null ||
                                (even.Next) == null)
                {
                    odd.Next = evenFirst;
                    break;
                }

                // Connecting odd nodes 
                odd.Next = even.Next;
                odd = even.Next;

                // If there are NO more even nodes 
                // after current odd. 
                if (odd.Next == null)
                {
                    even.Next = null;
                    odd.Next = evenFirst;
                    break;
                }

                // Connecting even nodes 
                even.Next = odd.Next;
                even = odd.Next;
            }
            return head;

        }
