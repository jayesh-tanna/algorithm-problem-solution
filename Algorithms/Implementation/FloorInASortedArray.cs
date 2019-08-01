/*
Given a sorted array arr[] of size N without duplicates, and given a value x. Find the floor of x in given array. 
Floor of x is defined as the largest element K in arr[] such that K is smaller than or equal to x.

Example:
Input:
3
7 0
1 2 8 10 11 12 19
7 5
1 2 8 10 11 12 19
7 10
1 2 8 10 11 12 19

Output:
-1
1
3

https://practice.geeksforgeeks.org/problems/floor-in-a-sorted-array/0/?ref=self
*/
using System;
using System.Linq;
public class GFG {
	static public void Main () {
		int t = Convert.ToInt32(Console.ReadLine());
		while(t-- > 0){
		    string[] input = Console.ReadLine().Split(' ');
		    int n = Convert.ToInt32(input[0]);
		    int k = Convert.ToInt32(input[1]);
		    int[] arr = Array.ConvertAll(Console.ReadLine().Split(' ').Where(x => x!=string.Empty).ToArray(),x=>Convert.ToInt32(x));
		    int floor = GetFloorIndex(arr,n,k);
		    Console.WriteLine(floor);
		}
	}
	private static int GetFloorIndex(int[] arr,int n,int k){
	    if(arr[0] > k)
	        return -1;
	    int left = 0,right = n-1;
	    while(left < right){
	        int mid = left + (right - left) / 2; 
	        if(arr[mid + 1] > k && arr[mid] <= k)
	            return mid;
	        if(k >= arr[mid + 1])
	            left = mid + 1;
	        else
	            right = mid - 1;
	    }
	    return left;
	}
}
