/*
https://practice.geeksforgeeks.org/problems/frequency-of-array-elements/0
Given an array A[] of N positive integers which can contain integers from 1 to N where elements can be repeated or can be absent from the array. 
Your task is to count frequency of all elements from 1 to N.
*/

using System;
using System.Collections.Generic;
using System.Linq;
public class GFG {
	static public void Main () {
		int t = Convert.ToInt32(Console.ReadLine());
		while(t-- > 0){
		    int n = Convert.ToInt32(Console.ReadLine());
		    var items = Array.ConvertAll(Console.ReadLine().Split(' ').Where(x => x!=string.Empty).ToArray(),x=>Convert.ToInt32(x));
		    int[] frequencies = GetFrequencies(items,n);
		    Console.WriteLine(string.Join(" ",frequencies));
		}
	}
	private static int[] GetFrequencies(int[] items,int n){
	    Dictionary<int,int> map = new Dictionary<int,int>();
	    for(int i=0;i<n;i++){
	        if(map.ContainsKey(items[i]))
	            map[items[i]]++;
	        else
	            map.Add(items[i],1);
	    }
	    int[] result = new int[n];
	    for(int i=0;i<n;i++){
	        if(map.ContainsKey(i+1))
	            result[i] = map[i+1];
	        else
	            result[i] = 0;
	    }
	    return result;
	}
}
