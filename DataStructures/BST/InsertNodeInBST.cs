/*
https://practice.geeksforgeeks.org/problems/insert-a-node-in-a-bst/1
Given a BST and some keys, you need to insert the keys in the given BST. Duplicates are not inserted.
*/


Node insert(Node root, int data)
    {
        if(root == null)
            return new Node(data);
         if(root.data > data)
            root.left = insert(root.left,data);       
         else if(root.data < data)
             root.right = insert(root.right,data);
         return root;
    }
