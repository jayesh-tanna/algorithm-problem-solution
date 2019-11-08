/*
remove all the nodes which outside of given range
*/

public Node ExcludeNodes(Node root, int l, int h)
        {
            if (root == null)
                return root;

            root.left = ExcludeNodes(root.left, l, h);

            root.right = ExcludeNodes(root.right, l, h);

            if (root.data < l)
                return root.right;

            if (root.data > h)
                return root.left;

            return root;
        }
