/*
Given an array a[] of N positive and negative numbers. Find if there is a subarray (of size at-least one) with 0 sum.
Example:
Input:
2
5
4 2 -3 1 6
5
4 2 0 1 6

Output:
Yes
Yes
*/

using System;
using System.Linq;
using System.Collections.Generic;
public class GFG {
	static public void Main () {
		int t = Convert.ToInt32(Console.ReadLine());
		while(t-- > 0){
		    int n = Convert.ToInt32(Console.ReadLine());
		    int[] arr = Array.ConvertAll(Console.ReadLine().Split(' ').Where(x => x!=string.Empty).ToArray(),x => Convert.ToInt32(x));
		    bool subArrayExists = SubArrayExists(arr,n);
		    Console.WriteLine(subArrayExists ? "Yes" : "No");
		}
	}
	private static bool SubArrayExists(int[] arr,int n){
	    HashSet<int> set = new HashSet<int>();
	    int sum = 0;
	    for(int i=0;i<n;i++){
	        sum += arr[i];
	        if(set.Contains(sum) || arr[i] == 0 || sum == 0)
	            return true;
	        set.Add(sum);
	    }
	    return false;
	}
}
