/*
Mr. Modulo comes up with another problem related to modulo and this time he is interested in finding all the possible pairs a and b in the array a[] such that a % b = k where k is a given integer. The array given will have distinct elements.
You are required to print how many such pairs exist.

https://practice.geeksforgeeks.org/problems/mr-modulo-and-pairs/0
*/

using System;
using System.Linq;
public class GFG {
	static public void Main () {
		int t = Convert.ToInt32(Console.ReadLine());
		while(t-- > 0){
		    string[] idx = Console.ReadLine().Split(' ');
		    int n = Convert.ToInt32(idx[0]);
		    int k = Convert.ToInt32(idx[1]);
		    int[] arr = Array.ConvertAll(Console.ReadLine().Split(' ').Where(x => x!=string.Empty).ToArray(),x => Convert.ToInt32(x));
		    int count = GetCount(arr,n,k);
		    Console.WriteLine(count);
		}
	}
	
	private static int GetCount(int[] arr,int n,int k){
	    int count =0;
	    for(int i=0;i<n;i++){
	        for(int j=0;j<n;j++){
	            if(i != j && arr[i] % arr[j] == k)
	                count++;
	        }
	    }
	    return count;
	}
}
