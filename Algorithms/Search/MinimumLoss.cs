//https://www.hackerrank.com/challenges/minimum-loss/problem
//Language: c#


static int minimumLoss(long[] price) {
        List<long> sortedPrice = price.ToList();
            List<long> prices = price.ToList();
            sortedPrice.Sort();
            int lowest = 0;
            for (int i = sortedPrice.Count - 1; i > 0; i--)
            {
                if (prices.IndexOf(sortedPrice[i - 1]) > prices.IndexOf(sortedPrice[i]))
                {
                    int loss = Convert.ToInt32(sortedPrice[i] - sortedPrice[i - 1]);
                    if (loss < lowest || lowest == 0)
                        lowest = loss;
                }
            }
            return lowest;
    }
