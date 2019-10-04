/*
https://practice.geeksforgeeks.org/problems/add-all-greater-values-to-every-node-in-a-bst/1/?ref=self
Given a Binary Search Tree (BST), modify it so that all greater values in the given BST are added to every node.
In this function problem, the task is to complete the function modify which takes one argument: Address of the root of the BST. 
The function should contain the logic to modify the BST so that in the modified BST, every node has a value equal to the sum of its 
value in the original BST and  values of all the elements larger than it in the original BST.
*/

class GfG
{   
    public static int sum;
    void modify(Node root)
    {
	    sum = 0;
	    modifyUtil(root);
    }
    void modifyUtil(Node root)
    {
        if(root == null)
	        return;
	        
	   modifyUtil(root.right);
	   
	   int t = root.data;
	   
	   root.data += sum;
	   
	   sum += t;
	   
	   modifyUtil(root.left);
    }
}
