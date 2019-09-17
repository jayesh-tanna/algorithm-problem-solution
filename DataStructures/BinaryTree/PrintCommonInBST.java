/*
https://practice.geeksforgeeks.org/problems/print-common-nodes-in-bst/1
Given two Binary Search Trees(without duplicates), you need to print the common nodes in them. In other words, find intersection of two BSTs.

BST1:

                 5
              /      \
            1         10
          /   \        /
         0     4    7
                    \
                     9

BST2:

               10
             /    \
            7     20
          /   \
         4     9

The common elements of above two BSTs are 4 7 9 10
*/

class BST
{
	public void printCommon(Node root1,Node root2)
    {
        TreeMap<Integer, Boolean> map = new TreeMap<>();
        addToMap(root1,map);
        addToMap(root2,map);
        Set<Map.Entry<Integer, Boolean>> set =  map.entrySet(); 
        for(Map.Entry<Integer,Boolean> me : set) 
        {
            if(me.getValue())
                System.out.print(me.getKey() + " "); 
        }
    }
    public void addToMap(Node root, TreeMap<Integer, Boolean> map)
    {
        if(root == null)
            return;
        addToMap(root.left,map);
        
        if(!map.containsKey(root.data))
            map.put(root.data,false);
        else
            map.put(root.data,true);
        
        addToMap(root.right,map);
    }
}
