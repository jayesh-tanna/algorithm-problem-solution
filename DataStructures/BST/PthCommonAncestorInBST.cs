/*
https://practice.geeksforgeeks.org/problems/pth-common-ancestor-in-bst/1
Given a Binary Search Tree and two node values x and y present in the BST. 
Your task is to find the pth (p >= 1) common ancestor of these two nodes x and y.
*/


 public int pthAncestor(Node root, int x, int y, int p)
        {
            HashSet<int> set = new HashSet<int>();
            InsertNodeData(root, set, x, y);
            int count = 0;
            foreach (var d in set)
            {
                if (++count == p)
                    return d;
            }
            return -1;
        }
        public void InsertNodeData(Node root, HashSet<int> set, int x, int y)
        {
            while (root != null)
            {
                if (root.data > x && root.data > y)
                {
                    set.Add(root.data);
                    root = root.left;
                }
                else if (root.data < x && root.data < y)
                {
                    set.Add(root.data);
                    root = root.right;
                }
                else
                {
                    set.Add(root.data);
                    break;
                }
            }
        }
