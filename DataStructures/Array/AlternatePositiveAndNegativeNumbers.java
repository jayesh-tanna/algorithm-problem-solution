
/*
Given an unsorted array Arr of N positive and negative numbers. Your task is to create an array of alternate positive and negative numbers without changing the relative order of positive and negative numbers.
Note: Array should start with positive number.
https://practice.geeksforgeeks.org/problems/array-of-alternate-ve-and-ve-nos1401/1#
*/


class Solution {
    void rearrange(int arr[], int n) {
        if(arr == null || arr.length == 0)
            return;
       int[] pos = new int[n];
            int l = 0 , r = n - 1, i = 0;
            int negCount = 0, posCount = 0;
            for (i = 0; i < n; i++)
            {
                if (arr[i] < 0)
                {
                    pos[r--] = arr[i];
                    negCount++;
                }
                else
                {
                    pos[l++] = arr[i];
                    posCount++;
                }
            }
            l = 0; r = n - 1;
            i = 0;
            boolean flag = true;
            while (l <= r)
            {
                if (flag || negCount <= 0)
                {
                    arr[i++] = pos[l++];
                    posCount--;
                }
                else
                {
                    arr[i++] = pos[r--];
                    negCount--;
                }
                flag = !flag;
            }
    }
}
