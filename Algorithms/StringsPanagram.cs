/*
https://practice.geeksforgeeks.org/problems/pangram-checking/1
Given a string check if it is Pangram or not. A pangram is a sentence containing every letter in the English Alphabet.
Example:
Input:
2
Bawds jog, flick quartz, vex nymph
sdfs

Output:
1
0
*/

public static bool CheckPanagram(string s)
        {
            bool[] containLetter = new bool[26];
            for (int i = 0; i < s.Length; i++)
            {
                if (char.IsLetter(s[i]))
                    containLetter[char.ToLower(s[i]) - 97] = true;

            }
            for (int i = 0; i < containLetter.Length; i++)
            {
                if (!containLetter[i])
                    return false;
            }
            return true;
        }
