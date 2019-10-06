
/*
https://practice.geeksforgeeks.org/problems/delete-a-node-from-bst/1
Given a Binary Search Tree (BST) and a node no 'x', your task is to delete the node 'x' from the BST.
Note: The duplicates are not inserted in the BST.
*/


class BST
{   
    Node deleteNode(Node root, int k) 
    {
	    if(root == null)
	        return root;
	    if(root.key > k)
	    {
	        root.left = deleteNode(root.left,k);
	        return root;
	    }
	    else if(root.key < k)
	    {
	        root.right = deleteNode(root.right,k);
	        return root;
	    }
	    if(root.left == null)
	        return root.right;
	   else if(root.right == null)
	        return root.left;
	   else
	   {
	        Node sucParent = root.right;
	        Node suc = root.right;
	        while(suc.left != null)
	        {
	            sucParent = suc;
	            suc = suc.left;
	        }
	        if(suc == root.right) //no left child
	        {
	            root.key = root.right.key;
	            root.right = root.right.right;
	        }
	        else
	        {
	            sucParent.left = suc.right;
	            root.key = suc.key;
	        }
	        return root;
	   }
    }
}
