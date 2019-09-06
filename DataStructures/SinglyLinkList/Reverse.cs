/*Reverse singly link list*/


public static void Reverse(Node head)
        {
            Node temp = null, nextNode = null;
            while(head != null)
            {
                nextNode = head.Next;
                head.Next = temp;
                temp = head;
                head = nextNode;
            }
        }
