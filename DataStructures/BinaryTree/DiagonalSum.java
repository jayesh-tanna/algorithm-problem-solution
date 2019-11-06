/*
https://practice.geeksforgeeks.org/problems/diagonal-sum-in-binary-tree/1
Consider lines of slope -1 passing between nodes (dotted lines in below diagram). The diagonal sum in a 
binary tree is the sum of all node’s data lying between these lines. Given a Binary Tree, print all diagonal sums.
*/

class GfG
{
    public void diagonalsum(Node root)
     {
        HashMap<Integer,Integer> map = new HashMap<>();
        storeSum(root,map,0);
        printSum(map);
     }
     private void storeSum(Node root,HashMap<Integer,Integer> map,int d)
     {
         if(root == null)
            return;
         int sum = map.get(d) == null ? root.data : map.get(d) + root.data;
         map.put(d,sum);
         storeSum(root.left,map,d+1);
         storeSum(root.right,map,d);
     }
     private void printSum(HashMap<Integer,Integer> map)
     {
         
         Iterator it = map.entrySet().iterator();
    while (it.hasNext()) {
        Map.Entry pair = (Map.Entry)it.next();
        System.out.print(pair.getValue() + " ");
        it.remove(); // avoids a ConcurrentModificationException
    }
     }
}
