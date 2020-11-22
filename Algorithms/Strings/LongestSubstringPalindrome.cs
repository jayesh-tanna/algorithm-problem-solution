/*
Given a string S, find the longest palindromic substring in S. Substring of string S: S[ i . . . . j ] where 0 ≤ i ≤ j < len(S). Palindrome string: A string which reads the same backwards. More formally, S is palindrome if reverse(S) = S. Incase of conflict, return the substring which occurs first ( with the least starting index ).

NOTE: Required Time Complexity O(n2).

Input:
The first line of input consists number of the testcases. The following T lines consist of a string each.

Output:
In each separate line print the longest palindrome of the string given in the respective test case.

Constraints:
1 ≤ T ≤ 100
1 ≤ Str Length ≤ 104

Example:
Input:
1
aaaabbaa

Output:
aabbaa
https://practice.geeksforgeeks.org/problems/longest-palindrome-in-a-string/0#
*/

using System;
using System.Text;
public class GFG {
	static public void Main () {
		int t = Convert.ToInt32(Console.ReadLine());
		while(t-- > 0)
		{
		    string s = Console.ReadLine();
		    string res = LongestSubstringPalindrome(s);
		    Console.WriteLine(res);
		}
	}
	static string LongestSubstringPalindrome(string s)
	{
	    if (string.IsNullOrEmpty(s))
                return s;
	    int y = -1, z = -1, max = -1;
            for (int i = 0; i < s.Length - 1; i++)
            {
                for (int j = s.Length - 1; j > i; j--)
                {
                    if (max >= j - i + 1)
                        break;
                    int a = i, b = j;
                    while (s[a] == s[b] && b >= a)
                    {
                        a++;
                        b--;
                    }
                    //palindrome case
                    if (b <= a && j - i + 1 > max)
                    {
                        y = i;
                        z = j;
                        max = z - y + 1;
                    }
                }
            }
            StringBuilder sb = new StringBuilder("");
            while (y <= z)
            {
                sb.Append(s[y++]);
            }
            return sb.ToString();
	}
}
