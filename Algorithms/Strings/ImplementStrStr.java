/*
Your task is to implement the function strstr. The function takes two strings as arguments (s,x) and  locates the occurrence of the string x in the string s. The function returns and integer denoting the first occurrence of the string x in s (0 based indexing).

 

Example 1:

Input:
s = GeeksForGeeks, x = Fr
Output: -1
Explanation: Fr is not present in the
string GeeksForGeeks as substring.

Example 2:

Input:
s = GeeksForGeeks, x = For
Output: 5
Explanation: For is present as substring
in GeeksForGeeks from index 5 (0 based
indexing).
https://practice.geeksforgeeks.org/problems/implement-strstr/1#
*/


class GfG
{
    int strstr(String str, String target)
    {
        if(str == null || str == "")
            return -1;
        if(target == null || target == "")
            return -1;
        if(target.length() > str.length())
            return -1;
        for(int i=0;i<str.length()- target.length() + 1;i++)
        {
            int j = i;
            int k = 0;
            while(j < str.length() && k < target.length() && str.charAt(j) == target.charAt(k))
            {
                k++;
                j++;
            }
            if(k == target.length())
                return i;
        }
        return -1;
    }
}
