/*
Given a string containing uppercase alphabets and integer digits (from 0 to 9), 
the task is to print the alphabets in the order followed by the sum of digits.
https://practice.geeksforgeeks.org/problems/rearrange-a-string/0
Example:
Input:
2
AC2BEW3
ACCBA10D2EW30

Output:
ABCEW5
AABCCDEW6
*/



using System;
using System.Text;
using System.Linq;
public class GFG {
	static public void Main () {
		int t = Convert.ToInt32(Console.ReadLine());
		while(t-- > 0){
		    string s = Console.ReadLine();
		    Console.WriteLine(ReArrangeString(s));
		}
	}
	
	private static string ReArrangeString(string s)
	{
	  int sum = 0;
	  StringBuilder sb = new StringBuilder();
	  for(int i=0;i<s.Length;i++)
	  {
	      if(char.IsLetter(s[i]))
	        sb.Append(s[i]);
	       else if(char.IsDigit(s[i]))
	        sum += Convert.ToInt32(char.GetNumericValue(s[i]));
	  }
	  var array = sb.ToString().OrderBy(x => x).ToArray();
	  return  new string(array) + sum;
	}
	
	//Linq solution
	private static string ReArrangeStringUsingLinq(string s)
	{
	  string str = new string(s.Where(x => char.IsLetter(x)).OrderBy(x => x).ToArray());
          int sum = s.Where(x => char.IsDigit(x)).Select(x => Convert.ToInt32(char.GetNumericValue(x))).Sum();
            return str + sum;
	}
}
