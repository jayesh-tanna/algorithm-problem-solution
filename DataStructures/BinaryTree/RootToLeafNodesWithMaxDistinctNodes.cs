/*
Root to leaf path with maximum distinct nodes
Given a Binary Tree, find count of distinct nodes in a root to leaf path with maximum distinct nodes.
*/

public class Path
    {
        public int Number { get; set; }
    }

public int maxDistinctNodeFromRootToLeaf(Node root)
        {
            Path p = new Path();
            Dictionary<int, int> set = new Dictionary<int, int>();
            maxDistinctNodeInPath(root, set, p, 0);
            return p.Number;
        }

        private void maxDistinctNodeInPath(Node root, Dictionary<int, int> set, Path path, int level)
        {
            if (root == null)
                return;
            if (!set.ContainsKey(root.data))
                set.Add(root.data, level);
            if (root.left == null && root.right == null)
            {
                path.Number = Math.Max(path.Number, set.Count);
                if (set.ContainsKey(root.data) && set[root.data] == level)
                    set.Remove(root.data);
                return;
            }

            maxDistinctNodeInPath(root.left, set, path, level + 1);
            maxDistinctNodeInPath(root.right, set, path, level + 1);
            if (set.ContainsKey(root.data) && set[root.data] == level)
                set.Remove(root.data);
        }
