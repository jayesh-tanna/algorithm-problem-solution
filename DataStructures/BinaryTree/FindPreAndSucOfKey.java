/*
https://practice.geeksforgeeks.org/problems/predecessor-and-successor/1
There is BST given with root node with key part as integer only. You need to find the 
inorder successor and predecessor of a given key. In case, if the either of predecessor or successor is not found print -1.
*/

public static void findPreSuc(Node root, Res p, Res s, int key)
    {
        if(root == null)
            return;
        findPreSuc(root.left,p,s,key);
        if(root.data < key){
             if(p.pre == null)
                p.pre = new Node(root.data);
             else if(root.data > p.pre.data)
                p.pre.data = root.data;
        }
        if(root.data > key && s.succ == null)
            s.succ = new Node(root.data);
        findPreSuc(root.right,p,s,key);
    }
