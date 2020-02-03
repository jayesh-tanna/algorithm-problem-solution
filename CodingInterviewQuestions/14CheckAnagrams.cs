/*
Write a function to check whether two given strings are anagram of each other or not. An anagram of a string is another string that contains same characters, only the order of characters can be different. For example, “abcd” and “dabc” are anagram of each other.
*/

public static bool AreAnagram(string str1, string str2)
        {
            if (string.IsNullOrWhiteSpace(str1) && string.IsNullOrWhiteSpace(str2))
                return true;
            if (string.IsNullOrWhiteSpace(str1) || string.IsNullOrWhiteSpace(str2))
                return false;
            if (str1.Length != str2.Length)
                return false;
            Dictionary<int, int> frequencies = new Dictionary<int, int>();
            for (int i = 0; i < str1.Length; i++)
            {
                char lowerChar = char.ToLower(str1[i]);
                if (frequencies.ContainsKey(lowerChar))
                    frequencies[lowerChar]++;
                else
                    frequencies.Add(lowerChar, 1);
            }
            for (int i = 0; i < str2.Length; i++)
            {
                char lowerChar = char.ToLower(str2[i]);
                if (frequencies.ContainsKey(lowerChar))
                    frequencies[lowerChar]--;
            }
            foreach(var item in frequencies)
            {
                if (item.Value != 0)
                    return false;
            }
            return true;
        }
