
/*
Given an array containing all numbers from 1 to n except two, find the two missing numbers. 
*/


public static int[] FindMissingNumbers(int n, int[] numbers)
        {
            int[] tempStore = new int[n];
            for (int i = 0; i < numbers.Length; i++)
            {
                tempStore[numbers[i] - 1] = numbers[i];
            }
            int[] result = new int[2];
            for (int i = 0; i < n; i++)
            {
                if (tempStore[i] == 0)
                {
                    if (result[0] == 0)
                        result[0] = i + 1;
                    else
                        result[1] = i + 1;
                }
            }
            return result;
        }
