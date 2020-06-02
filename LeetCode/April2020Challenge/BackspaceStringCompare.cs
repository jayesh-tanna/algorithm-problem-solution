/*
https://leetcode.com/explore/other/card/30-day-leetcoding-challenge/529/week-2/3291/
Given two strings S and T, return if they are equal when both are typed into empty text editors. # means a backspace character.

Note that after backspacing an empty text, the text will continue empty.
Example 1:

Input: S = "ab#c", T = "ad#c"
Output: true
Explanation: Both S and T become "ac".
Example 2:

Input: S = "ab##", T = "c#d#"
Output: true
Explanation: Both S and T become "".
Example 3:

Input: S = "a##c", T = "#a#c"
Output: true
Explanation: Both S and T become "c".
Example 4:

Input: S = "a#c", T = "b"
Output: false
Explanation: S becomes "c" while T becomes "b".
Note:

1 <= S.length <= 200
1 <= T.length <= 200
S and T only contain lowercase letters and '#' characters.
*/
public class Solution {
    public bool BackspaceCompare(string S, string T) {
        Stack<char> s = GetStack(S);
        Stack<char> t = GetStack(T);
        return Compare(s,t);
    }
    private Stack<char> GetStack(string s)
    {
        Stack<char> stack = new Stack<char>();
        if(string.IsNullOrEmpty(s))
            return stack;
        for(int i=0;i<s.Length;i++)
        {
            if(s[i] == '#' && stack.Count > 0)
                stack.Pop();
            else if(s[i] != '#')
                stack.Push(s[i]);
        }
        return stack;
    }
    private bool Compare(Stack<char> s,Stack<char> t)
    {
        if (s.Count != t.Count)
                return false;
        while (s.Count > 0 && t.Count > 0)
            {
                if (s.Pop() != t.Pop())
                    return false;
            }
            return true;
    }
}
