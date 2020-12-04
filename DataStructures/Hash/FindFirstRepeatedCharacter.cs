/*
Given a string S. The task is to find the first repeated character in it. We need to find the character that occurs more than once and whose index of second occurrence is smallest. S contains only lowercase letters.
Input:
The first line of input contains an integer T denoting the no of test cases. Then T test cases follow. Each test case contains a string S.

Output:
For each test case in a new line print the first repeating character in the string. If no such character exist print -1.

Constraints:
1 <= T <= 100
1 <= |S| <=104

Example:
Input:
2
geeksforgeeks
hellogeeks

Output:
e
l

https://practice.geeksforgeeks.org/problems/find-first-repeated-character/0#
*/

using System;
public class GFG {
	static public void Main () {
		int t = Convert.ToInt32(Console.ReadLine());
		while(t-- > 0)
		{
		    string s = Console.ReadLine();
		    string c = GetRepeatedCharacter(s);
		    Console.WriteLine(c);
		}
	}
	static string GetRepeatedCharacter(string s)
	{
	    if(String.IsNullOrWhiteSpace(s))
	        return string.Empty;
	    bool[] trackOccurrences = new bool[26];
	    for(int i=0;i<s.Length;i++)
	    {
	        if(trackOccurrences[s[i] - 97])
	            return new string(s[i],1);
	        trackOccurrences[s[i] - 97] = true;
	    }
	    return "-1";
	}
}
