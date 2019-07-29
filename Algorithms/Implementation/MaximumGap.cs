/*
Given an unsorted array. Your task is to find the maximum difference between the successive elements in its sorted form.
https://practice.geeksforgeeks.org/problems/maximum-gap/0/?ref=self
*/

using System;
using System.Linq;
public class GFG {
	static public void Main () {
		int t = Convert.ToInt32(Console.ReadLine());
		while(t-- > 0){
		    int n = Convert.ToInt32(Console.ReadLine());
		    var items = Array.ConvertAll(Console.ReadLine().Split(' ').Where(x => x!=string.Empty).ToArray(),x=>Convert.ToInt32(x));
		    int diff = GetMaxDifferenceBetweenElement(items,n);
		    Console.WriteLine(diff);
		}
	}
	private static int GetMaxDifferenceBetweenElement(int[] arr,int n){
	    if(n < 2)
	        return 0;
	    Array.Sort(arr);
	    int maxDiff = int.MinValue;
	    for(int i=0;i<n-1;i++){
	        maxDiff = Math.Max(arr[i+1] - arr[i],maxDiff);
	    }
	    return maxDiff;
	}
}
