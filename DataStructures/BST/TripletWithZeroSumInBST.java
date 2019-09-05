/*
https://practice.geeksforgeeks.org/problems/three-numbers-sum-equal-to-0/1
Given a Binary Search Tree (BST), write a function isTripletPresent() that returns 
true if there is a triplet in given BST with sum equals to 0, otherwise returns false.
*/

class GfG
{
    static ArrayList<Integer> list;
    public static boolean isTriplet(Node root)
    {
        list = new ArrayList<Integer>();
        inorder(root);
        boolean res = isTripletUtil();
        return res;
    }
    
    public static void inorder(Node root)
    {   
        if(root == null)
            return;
        inorder(root.left);
        list.add(root.data);
        inorder(root.right);
    }
    
    public static boolean isTripletUtil()
    {
        for(int i=0;i<list.size()-2;i++)
        {
            int l=i+1;
            int r=list.size()-1;
            while(l < r)
            {
                int sum = list.get(i) + list.get(l) + list.get(r);
                if(sum == 0)
                    return true;
                if(sum < 0)
                    l++;
                else
                    r--;
            }
        }
        return false;
    }
}
