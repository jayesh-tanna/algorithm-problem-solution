//problem : https://www.hackerrank.com/challenges/sherlock-and-valid-string/problem
//Language: c#


static string isValid(string s) {
       int[] arr = new int[26];
            foreach (var c in s)
            {
                arr[c - 97]++;
            }
            Array.Sort(arr);
            int i = 0;
            while (arr[i] == 0)
                i++;
            int min = arr[i];
            int max = arr[25];
            if(min == max || (max - min == 1 && max > arr[24]) || (min == 1) && (arr[i + 1] == max))
                return "YES";
            return "NO";
            
    }
