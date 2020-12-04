/*
Given two unsorted arrays A of size N and B of size M of distinct elements, the task is to find all pairs from both arrays whose sum is equal to X.

Input:
The first line of input contains an integer T denoting the no of test cases. Then T test cases follow. Each test case contains 3 lines . The first line contains 3 space separated integers N, M, X. Then in the next two lines are space separated values of the array A and B respectively.

Output:
For each test case in a new line print the sorted space separated values of all the pairs u,v where u belongs to array A and v belongs to array B, such that each pair is separated from the other by a ',' without quotes also add a space after the ',' . If no such pair exist print -1.

Constraints:
1 <= T <= 100
1 <= N, M, X <= 106
-106 <= A, B <= 106

Example:
Input:
2
5 5 9
1 2 4 5 7
5 6 3 4 8
2 2 3
0 2
1 3
Output:
1 8, 4 5, 5 4
0 3, 2 1

Explanation:
Testcase 1: (1, 8), (4, 5), (5, 4) are the pairs which sum to 9.

https://practice.geeksforgeeks.org/problems/find-all-pairs-whose-sum-is-x/0#

*/

using System;
using System.Text;
using System.Collections.Generic;
public class GFG {
	static public void Main () {
		int t = Convert.ToInt32(Console.ReadLine());
		while(t-- > 0)
		{
		    //int n = Convert.ToInt32(Console.ReadLine());
		    int[] inputs = Array.ConvertAll(Console.ReadLine().Trim().Split(),int.Parse);
		    int[] aInputs = Array.ConvertAll(Console.ReadLine().Trim().Split(),int.Parse);
		    int[] bInputs = Array.ConvertAll(Console.ReadLine().Trim().Split(),int.Parse);
		    string pairs = GetPairs(aInputs,bInputs,inputs[2]);
		    Console.WriteLine(pairs);
		}
	}
	static string GetPairs(int[] a,int[] b, int x)
	{
	    if(a == null || b == null)
	        throw new ArgumentNullException();
	    if(a.Length == 0 || b.Length == 0)
	        throw new ArgumentException();
	    HashSet<int> set = new HashSet<int>();
	    for(int i=0;i<b.Length;i++)
	        set.Add(b[i]);
	    StringBuilder sb = new StringBuilder("");
	    for(int i=0;i<a.Length;i++)
	    {
	        if(set.Contains(x - a[i]))
	        {
	            sb.Append(a[i]);
	            sb.Append(" ");
	            sb.Append(x - a[i]);
	            sb.Append(", ");
	        }
	    }
	    string res = sb.ToString();
	    if(string.IsNullOrEmpty(res))
	        return "-1";
	    return res.Substring(0,res.Length - 2);
	}
}
