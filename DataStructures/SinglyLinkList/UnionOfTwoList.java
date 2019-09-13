/*
Given two linked lists, your task is to complete the function makeUnion(), that returns the union of two linked lists. 
This union should include all the distinct elements only.
Note: The new list formed should be in non-decreasing order.
https://practice.geeksforgeeks.org/problems/union-of-two-linked-list/1
*/



Node findUnion(Node head1,Node head2)
	{
	    TreeMap<Integer, Boolean> map= new TreeMap<Integer, Boolean>();
	    addElementsToMap(head1,map);
	    addElementsToMap(head2,map);
	    Node head3 = createUnion(map);
        return head3;
	}
	private void addElementsToMap(Node head, TreeMap<Integer, Boolean> map)
	{
	    Node current = head;
	    while(current != null)
	    {
	        map.put(current.data,true);
	        current = current.next;
	    }
	}
	private Node createUnion(TreeMap<Integer, Boolean> map)
	{
	    Node head = null, current = null, preNode = null;
        Set set = map.entrySet();
        Iterator i = set.iterator();
        while(i.hasNext()) 
        {
            Map.Entry me = (Map.Entry)i.next();
            
            if(head == null)
            {
                head = new Node((int)me.getKey());
                preNode = head;
            }
            else
            {
                current = new Node((int)me.getKey());
                preNode.next = current;
                preNode = current;
            }
          }
          return head;
	}
