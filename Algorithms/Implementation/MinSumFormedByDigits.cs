/*
Given an array of digits (values are from 0 to 9), find the minimum possible sum of two numbers formed from digits of the array. 
All digits of given array must be used to form the two numbers.
https://practice.geeksforgeeks.org/problems/min-sum-formed-by-digits/0
*/


using System;
using System.Linq;
public class GFG {
	static public void Main () {
		int t= Convert.ToInt32(Console.ReadLine());
		while(t-- > 0){
		    int n =Convert.ToInt32(Console.ReadLine());
		    int[] arr = Array.ConvertAll(Console.ReadLine().Split(' ').Where(x => x!=string.Empty).ToArray(),x => Convert.ToInt32(x));
		    int sum = GetSum(arr,n);
		    Console.WriteLine(sum);
		}
	}
	
	private static int GetSum(int[] arr,int n){
	    Array.Sort(arr);
	    int first = 0;
	    int second = 0;
	    for(int i=0;i<arr.Length;i++){
	        if(i % 2 == 0)
	            first = first * 10 + arr[i];
	       else
	            second = second * 10 + arr[i];
	    }
	    return first + second;
	}
}
