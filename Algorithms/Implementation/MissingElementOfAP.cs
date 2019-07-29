/*
Find the missing element from  an ordered array A[ ], consisting of N elements representing an Arithmetic Progression (AP) .
https://practice.geeksforgeeks.org/problems/missing-element-of-ap/0/?ref=self
*/

using System;
using System.Linq;
public class GFG {
	static public void Main () {
		int t = Convert.ToInt32(Console.ReadLine());
		while(t-- > 0){
		    int n = Convert.ToInt32(Console.ReadLine());
		    var items = Array.ConvertAll(Console.ReadLine().Split(' ').Where(x => x!=string.Empty).ToArray(),x=>Convert.ToInt32(x));
		    int missedElement = MissingElement(items,n);
		    Console.WriteLine(missedElement);
		}
	}
	
	private static int MissingElement(int[] arr,int n){
	    int sum =0;
	    for(int i=0;i<n;i++)
	        sum += arr[i];
	   int sum1=((n+1)*(arr[0]+arr[n-1]))/2;
	   return sum1-sum;
	}
}
