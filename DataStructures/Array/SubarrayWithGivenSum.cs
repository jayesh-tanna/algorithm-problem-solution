/*
https://practice.geeksforgeeks.org/problems/subarray-with-given-sum/0#
Given an unsorted array A of size N of non-negative integers, find a continuous sub-array which adds to a given number S.

Input:
The first line of input contains an integer T denoting the number of test cases. Then T test cases follow. Each test case consists of two lines. The first line of each test case is N and S, where N is the size of array and S is the sum. The second line of each test case contains N space separated integers denoting the array elements.

Output:
For each testcase, in a new line, print the starting and ending positions(1 indexing) of first such occuring subarray from the left if sum equals to subarray, else print -1.

Constraints:
1 <= T <= 100
1 <= N <= 107
1 <= Ai <= 1010

Example:
Input:
2
5 12
1 2 3 7 5
10 15
1 2 3 4 5 6 7 8 9 10
Output:
2 4
1 5

Explanation :
Testcase1: sum of elements from 2nd position to 4th position is 12
Testcase2: sum of elements from 1st position to 5th position is 15
*/

using System;
public class GFG {
	static public void Main () {
		int t = Convert.ToInt32(Console.ReadLine());
		while(t-- > 0)
		{
		    int[] inputs = Array.ConvertAll(Console.ReadLine().Trim().Split(), int.Parse);
		    int[] arr = Array.ConvertAll(Console.ReadLine().Trim().Split(), int.Parse);
		    string res = SubArrayWithGivenSum(arr,inputs[1]);
		    Console.WriteLine(res);
		}
	}
	
	private static string SubArrayWithGivenSum(int[] arr,int s)
	{
	    if(arr == null || arr.Length == 0)
	        return String.Empty;
	   int j =0;
	   int sum = 0;
	   string res = String.Empty;
	   for(int i=0;i<arr.Length;i++)
	   {
	       sum += arr[i];
	       
	       while(sum > s)
	            sum -= arr[j++];
	       if(sum == s)
	       {
	           res = (j + 1) + " " + (i+1);
	           break;
	       }
	   }
	   
	   return res == String.Empty ? "-1" : res;
	}
}
