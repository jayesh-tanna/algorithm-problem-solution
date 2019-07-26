/*
Given a string S consisting of lowercase Latin Letters. Find the first non repeating character in S.
https://practice.geeksforgeeks.org/problems/non-repeating-character/0
*/

private static string GetNonRepeatingCharacter(string str)
        {
            int[] frequencies = new int[26];
            for (int i = 0; i < str.Length; i++)
            {
                frequencies[str[i] - 'a']++;
            }
            for (int i = 0; i < str.Length; i++)
            {
                if (frequencies[str[i] - 'a'] == 1)
                    return str[i].ToString();
            }
            return "-1";
        }
