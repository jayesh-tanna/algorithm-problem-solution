/*
Given two Binary Search Trees(without duplicates), you need to print the common nodes in them. In other words, find intersection of two BSTs
https://practice.geeksforgeeks.org/problems/print-common-nodes-in-bst/1
*/


class BST
{
        
	public void printCommon(Node root1,Node root2)
    {
        Map<Integer,Boolean> map= new HashMap<Integer,Boolean>();
        InOrder(root1, map);
        InOrder(root2, map);
        Print(map);
    }
    private void Print(Map<Integer,Boolean> map)
    {
        for (Map.Entry<Integer,Boolean> entry : map.entrySet())  
        {
            if(entry.getValue()){
                System.out.print(entry.getKey() + " "); 
            }
        }
    }
    
    private void InOrder(Node root, Map<Integer,Boolean> map)
    {
        if(root == null)
            return;
        InOrder(root.left,map);
        if(map.containsKey(root.data)){
            map.put(root.data,true);
        }else{
            map.put(root.data,false);
        }
        InOrder(root.right,map);
    }
}
