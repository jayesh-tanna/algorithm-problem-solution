/*
https://practice.geeksforgeeks.org/problems/delete-nodes-greater-than-k/1
Given a BST and a value x, the task is to delete the nodes having values greater than or equal to x.
*/




public static Node deleteNode(Node root, int key)
{
    if(key < root.data)
        root = deleteNode(root.left,key);
    else if(key > root.data){
        root.right = deleteNode(root.right,key);
    }
    else 
        root = root.left;
    return root;
 
}
