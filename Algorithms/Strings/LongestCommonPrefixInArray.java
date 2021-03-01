/*
https://practice.geeksforgeeks.org/problems/longest-common-prefix-in-an-array5129/1#
Given a array of N strings, find the longest common prefix among all strings present in the array.

Example 1:

Input:
N = 4
arr[] = {geeksforgeeks, geeks, geek,
         geezer}
Output: gee
Explanation: "gee" is the longest common
prefix in all the given strings.
â€‹Example 2:

Input: 
N = 2
arr[] = {hello, world}
Output: -1
Explanation: There's no common prefix
in the given strings.
*/

class Solution{
    String longestCommonPrefix(String arr[], int n){
        if(arr == null || arr.length == 0)
            return "-1";
        if(arr.length == 1)
            return arr[0];
        String a = arr[0];
        int i = 0;
        boolean success = true;
        for(i=0;i<a.length();i++)
        {
            for(int j=1;j<arr.length;j++)
            {
                if(arr[j].length() <= i || a.charAt(i) != arr[j].charAt(i))
                {
                    success = false;
                    break;
                }
            }
            if(!success)
                break;
        }
        if(i == 0)
            return "-1";
        StringBuilder sb = new StringBuilder("");
        for(int j = 0;j<i;j++) 
            sb.append(a.charAt(j));
        return sb.toString();
    }
}
