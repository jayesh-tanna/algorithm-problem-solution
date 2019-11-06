/*
https://practice.geeksforgeeks.org/problems/k-distance-from-root/1/?ref=self
Given a Binary Tree and a number k. Print all nodes that are at distance k from root (root is considered at distance 0 from itself). 
Nodes should be printed from left to right. If k is more that height of tree, nothing should be printed.

For example, if below is given tree and k is 2. Output should be 4 5 6.

          1
       /     \
     2        3
   /         /   \
  4        5    6 
     \
      8
*/

class GfG
{
     void printKdistance(Node root, int k)
     {
         if(root == null || k < 0)
            return;
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);
        int level = 0;
        while(!queue.isEmpty()){
            int n = queue.size();
            for(int i=0;i<n;i++){
                Node temp = queue.remove();
                if(level == k)
                    System.out.print(temp.data + " ");
                if(temp.left != null)
                    queue.add(temp.left);
                if(temp.right != null)
                    queue.add(temp.right);
            }
            if(level == k)
                break;
            level++;
        }
     }
}
