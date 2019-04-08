static int workbook(int n, int k, int[] arr) {
        int specialProblem = 0;
            int pageNo = 1;
            for (int i = 0; i < n; i++)
            {
                for (int j = 1; j <= arr[i]; j++)
                {
                    if (pageNo == j)
                        specialProblem++;

                    if (j % k == 0 || j == arr[i])
                        pageNo++;
                }
            }
            return specialProblem;
    }
