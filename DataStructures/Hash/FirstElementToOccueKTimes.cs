/*
https://practice.geeksforgeeks.org/problems/first-element-to-occur-k-times/0#
Given an array of N integers. The task is to find the first element that occurs K number of times. If no element occurs K times the print -1.

Input:
The first line of input contains an integer T denoting the number of test cases. Then T test cases follow. The first line of each test case contains an integer N denoting the size of an array and the number K. The second line of each test case contains N space separated integers denoting elements of the array A[ ].

Output:
For each test case in a new line print the required answer.

Constraints:
1 <= T <= 100
1 <= N, K <= 105
1<= A <= 106

Example:
Input :
1
7 2
1 7 4 3 4 8 7
Output :
7

Explanation:
Both 7 and 4 occur 2 times. But 7 is the first that occurs 2 times.
*/

using System;
using System.Collections.Generic;
public class GFG {
	static public void Main () {
		var t = Convert.ToInt32(Console.ReadLine());
		while(t-- > 0)
		{
		    int[] inputs = Array.ConvertAll(Console.ReadLine().Trim().Split(),int.Parse);
		    int[] elements = Array.ConvertAll(Console.ReadLine().Trim().Split(),int.Parse);
	        int res = GetRepeatedElement(elements,inputs[1]);
	        Console.WriteLine(res);
		}
	}
	
	static int GetRepeatedElement(int[] elements,int k)
	{
	    if(elements == null || elements.Length == 0)
	        return -1;
	    Dictionary<int,int> fre = new Dictionary<int,int>();
	    for(int i=0;i<elements.Length;i++)
	    {
	        if(fre.ContainsKey(elements[i]))
	            fre[elements[i]]++;
	       else
	            fre.Add(elements[i],1);
	    }
	    foreach(var item in fre)
	    {
	        if(item.Value == k)
	            return item.Key;
	    }
	    return -1;
	}
}
