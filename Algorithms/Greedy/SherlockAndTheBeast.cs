//Problem: https://www.hackerrank.com/challenges/sherlock-and-the-beast/problem
//Language: C#

static void decentNumber(int n) {
            StringBuilder ans = new StringBuilder();
            for (int i = n; i > 0; i--)
            {
                if (i % 3 == 0 && (n - i) % 5 == 0){
                    int j;
                    for (j = 0; j < i; j++)
                        ans.Append("5");
                    for (int k = j; k < n; k++)
                        ans.Append("3");
                    break;
                }
            }
            if (ans.Length == 0 && n % 5 == 0)
            {
                for(int k=n;k>0;k--)
                        ans.Append("3");
            }
                
            else if (ans.Length == 0)
                ans.Append("-1");
            Console.WriteLine(ans);   
    }
