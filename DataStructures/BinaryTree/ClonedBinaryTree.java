/*
https://practice.geeksforgeeks.org/problems/clone-a-binary-tree/1
Given a Binary Tree having random pointers clone the Binary Tree. The task is to complete the function cloneTree which take one 
argument the root of the tree to be copied and should return the root of the cloned tree.
*/

class GfG{
    public static Tree cloneTree(Tree tree)
    {
        if(tree == null)
            return null;
        HashMap<Tree,Tree> map = new HashMap<>();
        Tree clonedRoot = copyLeftRightNodes(tree,map);
        copyRandomNodes(clonedRoot,tree,map);
        return clonedRoot;
    }
    private static void copyRandomNodes(Tree clonedRoot,Tree originalRoot, HashMap<Tree,Tree> map)
    {
        if(clonedRoot == null || originalRoot == null)
            return;
        if(originalRoot.random != null && map.containsKey(originalRoot.random))
            clonedRoot.random = map.get(originalRoot.random);
        copyRandomNodes(clonedRoot.left,originalRoot.left,map);
        copyRandomNodes(clonedRoot.right,originalRoot.right,map);
    }
    private static Tree copyLeftRightNodes(Tree root,HashMap<Tree, Tree> map)
    {
        if(root == null)
            return null;
        Tree clonedNode = new Tree(root.data);
        map.put(root,clonedNode);
        clonedNode.left = copyLeftRightNodes(root.left,map);
        clonedNode.right = copyLeftRightNodes(root.right,map);
        return clonedNode;
    }
}
