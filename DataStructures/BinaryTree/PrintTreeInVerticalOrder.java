/*
https://practice.geeksforgeeks.org/problems/print-a-binary-tree-in-vertical-order/1/?ref=self
You are given a binary tree for which you have to print its vertical order traversal. your task is to complete the function verticalOrder which takes one argument the root of the binary tree and prints the node of the binary tree in vertical order as shown below.
If there are multiple nodes passing through a vertical line, then they should printed as they appear in level order traversal.
*/

class BinaryTree
{
    static void verticalOrder(Node root)
    {
        TreeMap<Integer, String> tm = new TreeMap<>(); 
        traverse(root,tm, 0);
        
        Set<Map.Entry<Integer, String>> set =  tm.entrySet(); 
        for(Map.Entry<Integer,String> me : set)
        {
            System.out.print(me.getValue() + " ");
        }
        
    }
    static void traverse(Node root,TreeMap<Integer, String> map,int level)
    {
        if(root == null)
            return;
        
        if(map.containsKey(level))
        {
            map.put(level,map.get(level) + " " + root.data);
        }
        else
        {
            map.put(level,Integer.toString(root.data));
        }
        
        traverse(root.left,map,level-1);
        
        traverse(root.right,map,level+1);
    }
}
