/*
Given two strings a and b consisting of lowercase characters. The task is to check whether two given strings are an anagram of each other or not. An anagram of a string is another string that contains the same characters, only the order of characters can be different. For example, “act” and “tac” are an anagram of each other.

Example 1:

Input:
a = geeksforgeeks, b = forgeeksgeeks
Output: YES
Explanation: Both the string have same
characters with same frequency. So, 
both are anagrams.
*/


class Anagram{    
    /*  Function to check if two strings are anagram
    *   a, b: input string
    */
    public static boolean isAnagram(String a,String b)
    {
        if((a == null || a.isEmpty()) && (b == null || b.isEmpty())) 
            return true;
        if((a == null || a.isEmpty()) || (b == null || b.isEmpty()))
            return false;
        int[] items = new int[26];
        for(int i=0;i<a.length();i++){
            items[a.charAt(i) - 97]++;
        }
        for(int i=0;i<b.length();i++){
            int idx = b.charAt(i) - 97;
            if(items[idx] == 0)
                return false;
            items[idx]--;
        }
        return true;
    }
}
