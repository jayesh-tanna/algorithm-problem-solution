/*
https://practice.geeksforgeeks.org/problems/merge-two-bst-s/1/?ref=self
Given two BST, you need to print the elements of both BSTs in sorted form.
*/


class GfG
{
	public static void merge(Node root1 , Node root2)
    {
        ArrayList<Integer> list1 = new ArrayList<Integer>();
        storeElementsToList(root1, list1);
        ArrayList<Integer> list2 = new ArrayList<Integer>();
        storeElementsToList(root2,list2);
        ArrayList<Integer> mergedList = merge(list1,list2);
        Node mergedRoot = convertListToBST(mergedList, 0, mergedList.size() - 1);
        inOrderPrint(mergedRoot);
    }
    private static void inOrderPrint(Node root)
    {
        if(root == null)
            return;
        inOrderPrint(root.left);
        System.out.print(root.data + " ");
        inOrderPrint(root.right);
    }
    private static Node convertListToBST(ArrayList<Integer> list,int l,int h)
    {
        if(l > h)
            return null;
            
        int m = (l + h)/2;
        
        Node n = new Node(list.get(m));
        
        n.left = convertListToBST(list,l,m-1);
        
        n.right = convertListToBST(list,m+1,h);
        
        return n;
    }
    private static ArrayList<Integer> merge(ArrayList<Integer> a1,ArrayList<Integer> a2)
    {
        int i = 0, j = 0;
        int n = a1.size();
        int m = a2.size();
        ArrayList<Integer> a3 = new ArrayList<Integer>();
        while(i < n && j < m)
        {
            if(a1.get(i) < a2.get(j))
                a3.add(a1.get(i++));
            else
                a3.add(a2.get(j++));
        }
        while(i < n)
            a3.add(a1.get(i++));
        while(j < m)
            a3.add(a2.get(j++));
        return a3;
    }
    private static void storeElementsToList(Node root, ArrayList<Integer> list)
    {
        if(root == null)
            return;
        storeElementsToList(root.left,list);
        list.add(root.data);
        storeElementsToList(root.right,list);
    }
}
