/*
https://practice.geeksforgeeks.org/problems/pairs-violating-bst-property/1
You are given a Binary tree. You are required to find the number of pairs violating the BST property. 
In BST every element in left subtree must be less than every element in the right subtree.
*/

class Solution {
    /*
    The structure of the node class is:
    class Node {
    int data;
    Node left, right;
        public Node(int data){
            this.data = data;
        }
    }
    */
    
    public int pairs(Node root){
        ArrayList<Integer> list = new ArrayList<Integer>();
        storeBSTElements(root,list);
        int count = countPairs(list);
        return count;
    }
    private int countPairs(ArrayList<Integer> list)
    {
        int count = 0;
        for(int i=0;i<list.size()-1;i++)
        {
            for(int j=i+1;j<list.size();j++)
            {
                if(list.get(j) < list.get(i))
                    count++;
            }
        }
        return count;
    }
    private void storeBSTElements(Node root, ArrayList<Integer> list)
    {
        if(root == null)
            return;
        storeBSTElements(root.left,list);
        list.add(root.data);
        storeBSTElements(root.right,list);
    }
}
