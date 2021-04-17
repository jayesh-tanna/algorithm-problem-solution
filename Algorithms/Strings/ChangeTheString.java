/*
https://practice.geeksforgeeks.org/problems/change-the-string3541/1
Given a string S, the task is to change the complete string to Uppercase or Lowercase depending upon the case for the first character.

Example 1:

Input:
S = "abCD"
Output: abcd
Explanation: The first letter (a) is 
lowercase. Hence, the complete string
is made lowercase.

â€‹Example 2:

Input: 
S = "Abcd"
Output: ABCD
Explanation: The first letter (A) is
uppercase. Hence, the complete string
is made uppercase.
*/





class Solution{
    String modify(String s){
        if(s == null || s == "")
            return s;
        StringBuilder sb = new StringBuilder();
        boolean isFirstCharUpperCase = s.charAt(0) >= 'A' && s.charAt(0) <= 'Z';
        for(int i=0;i<s.length();i++)
        {
            char c = s.charAt(i);
            if((c >= 'a' && c <= 'z') && isFirstCharUpperCase)
                sb.append(Character.toUpperCase(c));
            else if((c >= 'A' && c <= 'Z') && !isFirstCharUpperCase)
                sb.append(Character.toLowerCase(c));
            else
                sb.append(c);
        }
        return sb.toString();
    }
}
