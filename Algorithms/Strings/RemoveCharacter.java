/*
https://practice.geeksforgeeks.org/problems/remove-character3815/1
Given two strings string1 and string2, remove those characters from first string(string1) which are present in second string(string2). Both the strings are different and contain only lowercase characters.
NOTE: Size of  first string is always greater than the size of  second string( |string1| > |string2|).
 

Example 1:

Input:
string1 = "computer"
string2 = "cat"
Output: "ompuer"
Explanation: After removing characters(c, a, t)
from string1 we get "ompuer".
Example 2:

Input:
string1 = "occurrence"
string2 = "car"
Output: "ouene"
Explanation: After removing characters
(c, a, r) from string1 we get "ouene".
*/

class Solution{
    static String removeChars(String s1, String s2){
        if(s2 == null || s2 == "" || s1 == null || s1 == "")
            return s1;
        HashSet<Character> s2Chars = new HashSet<Character>();
        StringBuilder builder = new StringBuilder();
        for(int i = 0;i<s2.length();i++)
        {
            s2Chars.add(s2.charAt(i));
        }
        for(int i = 0;i<s1.length();i++)
        {
            if(!s2Chars.contains(s1.charAt(i)))
                builder.append(s1.charAt(i));
        }
        return builder.toString();
    }
}
