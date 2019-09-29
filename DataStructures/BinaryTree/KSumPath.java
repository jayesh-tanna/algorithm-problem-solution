/*
https://practice.geeksforgeeks.org/problems/k-sum-paths/1
A binary tree and a number k are given. Print the count of every path in the tree with sum of the nodes in the path as k.
*/
class GfG
{
    static Vector<Integer> paths = new Vector<Integer>();
    static int count = 0;
	public int printCount(Node root,int k)
    {
        paths = new Vector<Integer>();
        count = 0;
		countSum(root,k);
		return count;
	}
	public void countSum(Node root,int k)
	{
	    if(root == null)
	        return;
	   paths.add(root.data);
	   countSum(root.left,k);
	   countSum(root.right,k);
	   int s = 0;
	   for(int i=paths.size()-1;i >= 0;i--)
	   {
	       s += paths.get(i); 
	       if(s == k)
	            count++;
	   }
	   paths.remove(paths.size()-1);
	}
}
