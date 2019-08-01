/*
Monu lives in a society which is having high rise buildings. This is the time of sunrise and monu wants see the buildings receiving the sunlight. Help him in counting the number of buildings recieving the sunlight.
Given an array H representing heights of buildings. You have to count the buildings which will see the sunrise (Assume : Sun rise on the side of array starting point).

https://practice.geeksforgeeks.org/problems/facing-the-sun/0
Example:
Input:
2
5
7 4 8 2 9
4
2 3 4 5

Output:
3
4
*/

using System;
using System.Linq;
public class GFG {
	static public void Main () {
		int t = Convert.ToInt32(Console.ReadLine());
		while(t-- > 0){
		    int n = Convert.ToInt32(Console.ReadLine());
		    int[] arr = Array.ConvertAll(Console.ReadLine().Split(' ').Where(x => x!=string.Empty).ToArray(),x=>Convert.ToInt32(x));
		    int count = GetCount(arr,n);
		    Console.WriteLine(count);
		}
	}
	private static int GetCount(int[] arr,int n){
	    int min = arr[0];
	    int count = 1;
	    for(int i=1;i<n;i++){
	        if(arr[i] > min){
	            min = arr[i];
	            count++;
	        }
	    }
	    return count;
	}
}
