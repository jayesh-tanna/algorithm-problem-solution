/*
https://practice.geeksforgeeks.org/problems/brothers-from-different-root/1
Given two BSTs containing N1 and N2 distinct nodes respectively and given a value x. 
Your task is to complete the function countPairs(), 
that returns the count of all pairs from both the BSTs whose sum is equal to x.
*/

class GfG
{
    public static int countPairs(Node root1, Node root2, int x)
    {
        HashSet<Integer> set = getElemetsOfTree(root1,x);
        return getCount(root2,set,x);
    }
    public static int getCount(Node root,HashSet<Integer> set,int x){
        if(root == null)
            return 0;
        int count = 0;
        if(set.contains(x - root.data)){
            count++;
        }
        return getCount(root.left,set,x) + getCount(root.right,set,x) + count;
    }
    public static HashSet<Integer> getElemetsOfTree(Node root,int x){
        HashSet<Integer> set = new HashSet<Integer>();
        Node current = root;
        Stack<Node> stack = new Stack<Node>();
        while(!stack.empty() || current != null){
            while(current != null){
                stack.push(current);
                current = current.left;
            }
            current = stack.pop();
            if(current.data < x){
                set.add(current.data);
            }
            current = current.right;
        }
        return set;
    }
}
