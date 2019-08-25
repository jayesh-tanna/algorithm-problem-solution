/*
https://practice.geeksforgeeks.org/problems/inorder-successor-in-bst/1
Given a BST,  and a reference to a Node x the task is to find the Inorder Successor of the node . 
*/

class GfG
{
	public Node inorderSuccessor(Node root,Node k){
        if(k.right != null)
            return getMinValueNode(k.right);
        Node suc = null;
        while(root != null){
            if(root.data > k.data){
                suc = root;
                root = root.left;
            }
            else if(root.data < k.data)
                root = root.right;
            else
                break;
        }
        return suc;
    }
    
    private Node getMinValueNode(Node root){
        Node current = root;
        while(current.left != null)
            current  = current.left;
        
        return current;
    }
}
