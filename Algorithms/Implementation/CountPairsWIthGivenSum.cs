/*
Given an array of integers, and an integer  ‘K’ , find the count of pairs of elements in the array whose sum is equal to 'K'.
https://practice.geeksforgeeks.org/problems/count-pairs-with-given-sum/0
*/

using System;
using System.Collections.Generic;
using System.Linq;
public class GFG {
	static public void Main () {
		int t = Convert.ToInt32(Console.ReadLine());
		while(t-- > 0){
		    var arr = Console.ReadLine().Split(' ');
		    int n = Convert.ToInt32(arr[0]);
		    int k = Convert.ToInt32(arr[1]);
		    var items = Array.ConvertAll(Console.ReadLine().Split(' ').Where(x => x!=string.Empty).ToArray(),x=>Convert.ToInt32(x));
		    int countPairs = CountPairs(items,n,k);
		    Console.WriteLine(countPairs);
		}
	}
	private static int CountPairs(int[] arr,int n,int k){
	    Dictionary<int,int> table = new Dictionary<int,int>();
	    int count = 0;
	    for(int i=0;i<n;i++){
	        int t = k - arr[i];
	        if(table.ContainsKey(t))
	            count += table[t];
	        if(table.ContainsKey(arr[i]))
	            table[arr[i]]++;
	        else
	            table.Add(arr[i],1);    
	           
	    }
	    return count;
	}
}
