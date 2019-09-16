/*
https://practice.geeksforgeeks.org/problems/two-mirror-trees/1
Given a Two Binary Trees, write a function that returns true if one is mirror of other, else returns false.
*/

boolean areMirror(Node root1, Node root2) 
    {
        if(root1 == null && root2 == null)
            return true;
        if(root1 == null || root2 == null)
            return false;
        if(root1.data != root2.data)
            return false;
        return areMirror(root1.left,root2.right) 
            && areMirror(root1.right,root2.left);
    }
