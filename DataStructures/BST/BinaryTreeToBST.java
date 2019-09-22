

/*
https://practice.geeksforgeeks.org/problems/binary-tree-to-bst/1
Given a binary tree, your task is to complete the function binaryTreeToBST which converts the binary tree to binary 
search tree(BST) and returns the root of the converted binary search tree.
*/

class GfG
{
    static int count;
    Node binaryTreeToBST(Node root)
    {
        if(root == null)
            return null;
        count = 0;
	    List<Integer> list = new ArrayList<Integer>();  
	    storeDataToList(root, list);
	    sort(list);
	    storeDataToTree(root,list);
	    return root;
    }
    void storeDataToTree(Node root,List<Integer> list)
    {
        if(root == null)
            return;
        storeDataToTree(root.left,list);
        root.data = list.get(count);
        count++;
        storeDataToTree(root.right,list);
    }
    void storeDataToList(Node root,List<Integer> list)
    {
        if(root == null)
            return;
        storeDataToList(root.left,list);
        list.add(root.data);
        storeDataToList(root.right,list);
    }
    void sort(List<Integer> list)
    {
        Collections.sort(list); 
    }
}
