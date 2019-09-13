/*
https://practice.geeksforgeeks.org/problems/intersection-of-two-linked-list/1/?ref=self
Given two linked lists, the task is to complete the function findIntersection(), 
that returns the intersection of two linked lists.
Each of the two linked list contains distinct node values.
Note: The new list formed should be in non-decreasing order. 
Also if there is no intersecting nodes among two linked lists, then print empty line.
*/


static Node findIntersection(Node head1, Node head2)
    {
        TreeMap<Integer, Boolean> map= new TreeMap<Integer, Boolean>();
	    addElementsToMap(head1,map);
	    addElementsToMap(head2,map);
	    Node head3 = createIntersection(map);
        return head3;
    }
    private static void addElementsToMap(Node head, TreeMap<Integer, Boolean> map)
	{
	    Node current = head;
	    while(current != null)
	    {
	        if(map.containsKey(current.data))
	            map.put(current.data,true);
	       else
	            map.put(current.data,false);
	        current = current.next;
	    }
	}
	private static Node createIntersection(TreeMap<Integer, Boolean> map)
	{
	    Node head = null, current = null, preNode = null;
        Set set = map.entrySet();
        Iterator i = set.iterator();
        while(i.hasNext()) 
        {
            Map.Entry me = (Map.Entry)i.next();
            boolean exist = (boolean)me.getValue();
            if(exist)
            {
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
          }
          return head;
	}
