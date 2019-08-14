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
            return s.Where(x => char.IsLetter(x))
                    .Select(x => char.ToLower(x))
                    .Distinct()
                    .Count() == 26;
        }
