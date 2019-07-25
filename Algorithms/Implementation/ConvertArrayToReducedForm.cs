/*
Given an array with n distinct elements, convert the given array to a reduced form where all elements are in range from 0 to n-1. The order of elements is same, i.e., 0 is placed in place of smallest element, 1 is placed for second smallest element, … n-1 is placed for largest element.
https://practice.geeksforgeeks.org/problems/convert-an-array-to-reduced-form/0/?ref=self
*/

using System;
using System.Collections.Generic;
using System.Linq;
public class GFG {
	static public void Main () {
		int t = Convert.ToInt32(Console.ReadLine());
		while(t-- > 0){
		    int n = Convert.ToInt32(Console.ReadLine());
		    int[] arr = Array.ConvertAll(Console.ReadLine().Split(' ').Where(x => x!=string.Empty).ToArray(),x => Convert.ToInt32(x));
		    int[] result = GetReducedForm(arr);
		    Console.WriteLine(string.Join(" ",result));
		}
	}
	
	private static int[] GetReducedForm(int[] arr){
	    Dictionary<int,int> dict = new Dictionary<int,int>();
	    for(int i=0;i<arr.Length;i++){
	        dict.Add(arr[i],-1);   
	    }
	    Array.Sort(arr);
	    for(int i=0;i<arr.Length;i++){
	        dict[arr[i]] = i;
	    }
	    int[] result = new int[arr.Length];
	    int k=0;
	    foreach(var item in dict){
	        result[k++] = item.Value;
	    }
	    return result;
	}
}
