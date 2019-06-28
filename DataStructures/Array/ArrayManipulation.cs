//https://www.hackerrank.com/challenges/crush/problem
//Solution in C#

private static long arrayManipulation(int n, int[][] queries)
        {
            long max = 0;
            int m = queries.GetLength(0);
            long[][] tempArr = new long[2][];
            tempArr[0] = new long[n];
            tempArr[1] = new long[n];
            for (int row = 0; row < m; row++)
            {
                int a = queries[row][0];
                int b = queries[row][1];
                int k = queries[row][2];
                for (int i = 0; i < n; i++)
                {
                    if (row % 2 == 0)
                    {
                        if (i >= a - 1 && i <= b - 1)
                            tempArr[0][i] = tempArr[1][i] + k;
                        else
                            tempArr[0][i] = tempArr[1][i];

                        if (tempArr[0][i] > max)
                            max = tempArr[0][i];
                    }
                    else
                    {
                        if (i >= a - 1 && i <= b - 1)
                            tempArr[1][i] = tempArr[0][i] + k;
                        else
                            tempArr[1][i] = tempArr[0][i];

                        if (tempArr[1][i] > max)
                            max = tempArr[1][i];
                    }
                }
            }
            return max;
        }
