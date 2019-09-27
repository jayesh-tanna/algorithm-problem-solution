/*
https://practice.geeksforgeeks.org/problems/number-of-root-to-leaf-paths/1
Given a binary tree, you need to find the number of all root to leaf paths along with their path lengths.
Input:
2
2
3 2 L 3 4 R
4
10 20 L 10 30 R 20 40 L 20 60 R
Output:
2 2 $
2 1 $3 2 $

Explanation :
Testcase1:
There are 2 root to leaf paths of length 2.    

Testcase2:
There is 1 root to leaf paths of length 2 and 2 root to leaf paths of length 3.
*/

class GfG
{
    TreeMap<Integer,Integer> map;
    void countPaths(Node root)
    {
	    map = new TreeMap<Integer,Integer>();	
	    countPaths(root,1);
	    for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            System.out.print(entry.getKey() + " " + entry.getValue() + " $");
        }
    }
    void countPaths(Node root,int level)
    {
        if(root == null)
            return;
        if(root.left == null && root.right == null)
        {
            if(map.containsKey(level))
                map.put(level,map.get(level) + 1);
            else
                map.put(level,1);
        }
        countPaths(root.left,level + 1);
        countPaths(root.right,level + 1);
    }
}
