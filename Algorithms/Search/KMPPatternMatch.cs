/*
Given three strings ‘str’, ‘oldW’ and ‘newW’. The task is find all occurrences of the word ‘oldW’ and replace then with word ‘newW’.
Example:
Input:
2
xxforxx xx for xx
xx
geeks
india is the xx country
xx
best

Output:
geeksforgeeks geeks for geeks
india is the best country
https://practice.geeksforgeeks.org/problems/replace-a-word/0
*/

static public void Main()
        {
            string str = "xxforxx xx for xx";
            string pat = "xx";
            string newString = "geeks";
            string output = Replace(str, pat, newString);
            Console.WriteLine(output);
        }

        private static List<int> PatternMatchIndexes(string str, string pat)
        {
            int[] lpsArr = computeLPSArr(pat);
            int i = 0, j = 0;
            List<int> idx = new List<int>();
            while (i < str.Length)
            {
                if (str[i] == pat[j])
                {
                    j++;
                    i++;
                }
                if (j == pat.Length)
                {
                    idx.Add(i - j);
                    j = lpsArr[j - 1];
                }
                else if (i < str.Length && str[i] != pat[j])
                {
                    if (j != 0)
                        j = lpsArr[j - 1];
                    else
                        i++;
                }
            }
            return idx;
        }

        private static string Replace(string str, string pat,string newString)
        {
            List<int> idx = PatternMatchIndexes(str, pat);
            if(idx.Count > 0)
            {
                StringBuilder sb = new StringBuilder();
                for(int k = 0; k < str.Length;)
                {
                    if (idx.Contains(k))
                    {
                        int l = 0;
                        while (l < newString.Length)
                            sb.Append(newString[l++]);
                        k += pat.Length;
                    }
                    else
                    {
                        sb.Append(str[k]);
                        k++;
                    }
                }
                return sb.ToString();
            }
            else
                return str;
        }

        private static int[] computeLPSArr(string pat)
        {
            int[] arr = new int[pat.Length];
            arr[0] = 0;
            int j = 0, i = 1;
            while (i < pat.Length)
            {
                if (arr[i] == arr[j])
                {
                    j++;
                    arr[i] = j;
                    i++;
                }
                else
                {
                    if (j != 0)
                        j = arr[j - 1];
                    else
                    {
                        arr[i] = 0;
                        i++;
                    }
                }
            }
            return arr;
        }
