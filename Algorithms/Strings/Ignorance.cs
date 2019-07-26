/*
https://practice.geeksforgeeks.org/problems/string-ignorance/0
Given a string of both uppercase and lowercase alphabets, the task is to print the string with alternate occurrences of any character dropped(including space and consider upper and lowercase as same).
Example:
Input:
2
It is a long day dear.
Geeks for geeks
Output:
It sa longdy ear.
Geks fore
*/

internal class Program
    {
        private const int DotIndex = 27;
        private const int SpaceIndex = 26;
    
        static public void Main()
        {
            string s = GetStringWithAlternateOccurancesOfCharacters("Geeks for geeks");
            Console.WriteLine(s);
            Console.ReadLine();
        }

        private static string GetStringWithAlternateOccurancesOfCharacters(string str)
        {
            bool[] flips = new bool[28];
            StringBuilder sb = new StringBuilder();

            for (int i = 0; i < str.Length; i++)
            {
                char c = str[i];
                if (char.IsUpper(c))
                    c = Convert.ToChar(c + 32);

                int idx = GetIndex(c);

                if (!flips[idx])
                {
                    sb.Append(str[i]);
                }
                flips[idx] = !flips[idx];
            }
            return sb.ToString();
        }

        private static int GetIndex(char c)
        {
            if (c == '.')
                return DotIndex;
            else if (c == ' ')
                return SpaceIndex;
            else
                return c - 'a';
        }
    }
