/*
Given an array of size N consisting of only 0's and 1's ,which is sorted in such a manner 
that all the 1's are placed first and  then they are followed by all the 0's. 
You have to find  the count of all the 0's.

https://practice.geeksforgeeks.org/problems/count-the-zeros/0
*/

using System;
using System.Linq;
public class GFG {
	static public void Main () {
		int t = Convert.ToInt32(Console.ReadLine());
		while(t-- > 0){
		    int n = Convert.ToInt32(Console.ReadLine());
		    var items = Array.ConvertAll(Console.ReadLine().Split(' ').Where(x => x!=string.Empty).ToArray(),x=>Convert.ToInt32(x));
		    int count = CountZero(items,n);
		    Console.WriteLine(count);
		}
	}
	private static int CountZero(int[] arr,int n){
	    int i = n - 1;
	    while(i >= 0 && arr[i] == 0)
	        i--;
	    return n - i - 1;
	}
}
