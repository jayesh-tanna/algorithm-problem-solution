/*
https://practice.geeksforgeeks.org/problems/first-negative-integer-in-every-window-of-size-k/0
Given an array and a positive integer k, find the first negative integer for each and every window(contiguous subarray) of size k.
Example:
Input:
2
5
-8 2 3 -6 10
2
8
12 -1 -7 8 -15 30 16 28
3

Output:
-8 0 -6 -6
-1 -1 -7 -15 -15 0
*/

using System;
using System.Collections.Generic;
public class GFG {
	static public void Main () {
		int t = Convert.ToInt32(Console.ReadLine());
		while(t-- > 0){
		    int n  = Convert.ToInt32(Console.ReadLine());
		    int[] arr = Array.ConvertAll(Console.ReadLine().Split(' '),x=>Convert.ToInt32(x));
		    int k = Convert.ToInt32(Console.ReadLine());
		    int[] result = GetFirstNegativeInEveryWindow(arr,n,k);
		    Console.WriteLine(string.Join(" ",result));
		}
	}
	
	private static int[] GetFirstNegativeInEveryWindow(int[] arr,int n,int k){
	    Queue<int> queue = new Queue<int>();
	    List<int> list = new List<int>();
	    for(int i=0;i<k;i++){
	        if(arr[i] < 0)
	            queue.Enqueue(arr[i]);
	    }
	    if(queue.Count > 0)
	        list.Add(queue.Peek());
	    else
	        list.Add(0);
	        
	    for(int i=k;i<n;i++){
	        if(arr[i] < 0)
	            queue.Enqueue(arr[i]);
	        if(arr[i-k] < 0)
	            queue.Dequeue();
	        if(queue.Count > 0)
	            list.Add(queue.Peek());
	       else
	            list.Add(0);
	    }
	    return list.ToArray();
	}
}
