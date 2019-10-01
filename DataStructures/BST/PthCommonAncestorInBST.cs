/*
https://practice.geeksforgeeks.org/problems/pth-common-ancestor-in-bst/1
Given a Binary Search Tree and two node values x and y present in the BST. 
Your task is to find the pth (p >= 1) common ancestor of these two nodes x and y.
*/

//Recursion
public int pthAncestor(Node root, int x, int y, int p)
        {
            if (root == null || p <= 0)
                return -1;
            List<int> list = new List<int>();
            var res = findCommonAncestor(root, list, x, y);
            if (p > list.Count || !res)
                return -1;
            return list[list.Count - p];
        }

        public bool findCommonAncestor(Node root, List<int> list, int x, int y)
        {
            if (root == null)
                return false;
            list.Add(root.data);
            bool lres;
            if (root.data > x && root.data > y)
                lres = findCommonAncestor(root.left, list, x, y);
            else if (root.data < x && root.data < y)
                lres = findCommonAncestor(root.right, list, x, y);
            else
                lres = true;
            return lres;
        }
