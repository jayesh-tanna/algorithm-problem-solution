/*
https://practice.geeksforgeeks.org/problems/closing-bracket-index5900/1/?category[]=Strings&category[]=Strings&problemStatus=unsolved&difficulty[]=0&page=1&query=category[]StringsproblemStatusunsolveddifficulty[]0page1category[]Strings#
Given a string with brackets ('[' and ']') and the index of an opening bracket. Find the index of the corresponding closing bracket.

Example 1:

Input:
S = "[ABC[23]][89]"
pos = 0
Output: 8
Explanation: [ABC[23]][89]
The closing bracket corresponding to the
opening bracket at index 0 is at index 8.

â€‹Example 2:

Input: 
S = "ABC[58]"
pos = 3
Output: 6
Explanation: ABC[58]
The closing bracket corresponding to the
opening bracket at index 3 is at index 6.

*/


// { Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;
class GfG
{
    public static void main (String[] args)
    {
        
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0)
        {
            String s = sc.next();
            int pos = sc.nextInt();
    		System.out.println (new Sol().closing (s, pos));
        }
        
    }
}
// } Driver Code Ends


//User function Template for Java

class Sol
{
    int closing (String s, int pos)
    {
        if(s == null|| s == "")
            return -1;
        Stack<Integer> stack = new Stack<Integer>();     
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i) == '[')
                stack.push(i);
            else if(s.charAt(i) == ']')
            {
                int lastIndex = stack.pop();
                if(lastIndex == pos)
                    return i;
            }
        }
        return -1;
    }
}
