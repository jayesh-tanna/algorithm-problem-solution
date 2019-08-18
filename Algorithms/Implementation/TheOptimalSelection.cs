/*
https://practice.geeksforgeeks.org/problems/the-optimal-selection/0
Ishaan is given N integers in the form of an array A. He is asked to select all of these integers in any order. For selecting every integer he gets some points. He needs to maximize those points.
For every integer he selects, he gets points equal to the value of :
the selected integer * number of integers selected before the current integer (Refer example for explanation)
Help him find the maximum points he can get provided he can select every integer exactly 1 time.
Example : 
Input : 
3
5
1 2 2 4 9
3
2 4 6
4
2 2 2 2
Output : 
54
16
12

Explanation : 
Case 1 : 
First he selects 1
Points : 1 * 0 (no integer selected before this)
Total Points = 0

Then he selects 2
Points : 2 * 1 (1 selected before this)
Total Points = 2

Then he selects 2
Points : 2 * 2 (1,2 selected before this)
Total Points = 6

Then he selects 4
Points : 4 * 3 (1,2,2 selected before this)
Total Points = 18

Then he selects 9
Points : 9 * 4 (1,2,2,4 selected before this)
Total Points = 54
*/

using System;
using System.Linq;
public class GFG {
	static public void Main () {
		int t = Convert.ToInt32(Console.ReadLine());
		while(t-- > 0)
		{
		    int n = Convert.ToInt32(Console.ReadLine());
		    int[] arr = Array.ConvertAll(Console.ReadLine().Split(' ')
		                                                   .Where(x => x != string.Empty).ToArray(),x => Convert.ToInt32(x));
		    int optimalSolution = GetOptimalSolution(arr,n);
		    Console.WriteLine(optimalSolution);
		}
	}
	
	private static int GetOptimalSolution(int[] arr,int n){
	    int sum = 0;
	    Array.Sort(arr);
	    for(int i=1;i<n;i++){
	        sum += arr[i] * i;
	    }
	    return sum;
	}
	
	//Using Linq
	private static int GetOptimalSolution1(int[] arr, int n)
        {
            Array.Sort(arr);
            
            int sum = arr.Select((x, i) => x * i).Sum();

            return sum;
        }
}
