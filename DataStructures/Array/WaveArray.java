/*
Given a sorted array arr[] of distinct integers. Sort the array into a wave-like array and return it. In other words, arrange the elements into a sequence such that a1 >= a2 <= a3 >= a4 <= a5..... (considering the increasing lexicographical order).
https://practice.geeksforgeeks.org/problems/wave-array-1587115621/1#
Example 1:

Input:
n = 5
arr[] = {1,2,3,4,5}
Output: 2 1 4 3 5
Explanation: Array elements after 
sorting it in wave form are 
2 1 4 3 5.
*/

public static void convertToWave(int arr[], int n){
        
        if(arr == null || arr.length == 0)
            return;
        n = n % 2 == 0 ? n : n-1;
        for(int i =0;i<n;i+=2)
        {
            int temp = arr[i];
            arr[i] = arr[i+1];
            arr[i+1] = temp;
        }
    }
