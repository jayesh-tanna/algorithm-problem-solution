/*
Given an array A[] of integers, sort the array according to frequency of elements. That is elements that have higher frequency come first. If frequencies of two elements are same, then smaller number comes first.

Input:
The first line of input contains an integer T denoting the number of test cases. The description of T test cases follows. The first line of each test case contains a single integer N denoting the size of array. The second line contains N space-separated integers A1, A2, ..., AN denoting the elements of the array.

Output:
For each testcase, in a new line, print each sorted array in a seperate line. For each array its numbers should be seperated by space.

Constraints:
1 ≤ T ≤ 70
30 ≤ N ≤ 130
1 ≤ Ai ≤ 60 

Example:
Input:
2
5
5 5 4 6 4
5
9 9 9 2 5

Output:
4 4 5 5 6
9 9 9 2 5

https://practice.geeksforgeeks.org/problems/sorting-elements-of-an-array-by-frequency/0#
*/


using System;
using System.Collections.Generic;
using System.Linq;
public class GFG {
	static public void Main () {
		int t = Convert.ToInt32(Console.ReadLine());
		while(t-- > 0)
		{
		    int n = Convert.ToInt32(Console.ReadLine());
		    int[] input = Array.ConvertAll(Console.ReadLine().Trim().Split(), int.Parse);
		    int[] res = FrequencySorting(n,input);
		    foreach(var item in res)
		    {
		        Console.Write(item + " ");
		    }
		    Console.WriteLine();
		}
	}
	static int[] FrequencySorting(int n, int[] input)
	{
	    if (input == null || input.Length == 0)
                throw new ArgumentNullException("input");
            Dictionary<int, int> distinctElements = new Dictionary<int, int>();
            for (int i = 0; i < n; i++)
            {
                if (distinctElements.ContainsKey(input[i]))
                    distinctElements[input[i]]++;
                else
                    distinctElements.Add(input[i], 1);
            }
            Dictionary<int, List<int>> items = new Dictionary<int, List<int>>();
            foreach (var keyValue in distinctElements)
            {
                if (items.ContainsKey(keyValue.Value))
                {
                    items[keyValue.Value].Add(keyValue.Key);
                }
                else
                {
                    items.Add(keyValue.Value, new List<int>() { keyValue.Key });
                }
            }
            var res = new List<int>(n);
            foreach (var item in items.OrderByDescending(key => key.Key))
            {
                item.Value.Sort();
                for (int z = 0; z < item.Value.Count; z++)
                {
                    for (int t = 0; t < item.Key; t++)
                    {
                        res.Add(item.Value[z]);
                    }
                }
            }
            return res.ToArray();
	}
}
