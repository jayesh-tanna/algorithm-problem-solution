/*
https://practice.geeksforgeeks.org/problems/print-a-binary-tree-in-vertical-order/1
You are given a binary tree for which you have to print its vertical order traversal. your task is to complete the function verticalOrder which takes one argument the root of the binary tree and prints the node of the binary tree in vertical order as shown below.
If there are multiple nodes passing through a vertical line, then they should printed as they appear in level order traversal.
*/

class BinaryTree
{
    static void verticalOrder(Node root)
    {
        if(root == null)
            return;
        TreeMap<Integer, String> tm = new TreeMap<>(); 
        traverse(root,tm);
        print(tm);
    }
    private static void print(TreeMap<Integer, String> tm)
    {
        Set<Map.Entry<Integer, String>> set =  tm.entrySet(); 
        for(Map.Entry<Integer,String> me : set)
        {
            System.out.print(me.getValue() + " ");
        }
    }
    static void traverse(Node root,TreeMap<Integer, String> tm)
    {
        Queue<Node> nodeQueue = new LinkedList<>();
        root.hd = 0;
        nodeQueue.add(root);
        while(!nodeQueue.isEmpty())
        {
            int n = nodeQueue.size();
            for(int i=0;i<n;i++)
            {
                Node temp = nodeQueue.remove();
                if(tm.containsKey(temp.hd))
                    tm.put(temp.hd,tm.get(temp.hd) + " " + temp.data);
                else
                    tm.put(temp.hd,Integer.toString(temp.data));
                if(temp.left != null){
                    temp.left.hd = temp.hd - 1;
                    nodeQueue.add(temp.left);
                }
                if(temp.right != null){
                    temp.right.hd = temp.hd + 1;
                    nodeQueue.add(temp.right);
                }
            }
        }
    }
}
