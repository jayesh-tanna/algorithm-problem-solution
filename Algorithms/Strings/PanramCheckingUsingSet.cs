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


public static bool checkPanagram(string s)
        {
            HashSet<char> set = new HashSet<char>();
            for (int i = 0; i < s.Length; i++)
            {
                if (char.IsLetter(s[i]))
                    set.Add(char.ToLower(s[i]));
            }
            return set.Count == 26;
        }
