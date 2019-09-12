/*
https://practice.geeksforgeeks.org/problems/vertical-sum/1
Given a Binary Tree, find vertical sum of the nodes that are in same vertical line. Print all sums through different vertical lines.
*/

class GfG
{
    public static void printVertical(Node root)
    {
        HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
        verticalUtil(root,map,0);
        
           for (Map.Entry mapElement : map.entrySet()) 
            { 
                System.out.print((int)mapElement.getValue() + " "); 
            }
        
    }
    public static void verticalUtil(Node root,HashMap<Integer,Integer> map,int distance)
    {
        if(root == null)
            return;
            
        verticalUtil(root.left,map,distance - 1);
        
        int preSum = map.containsKey(distance) ? map.get(distance) : 0;
        
        map.put(distance,preSum + root.data);
        
        verticalUtil(root.right,map,distance + 1);
    }
    
}
