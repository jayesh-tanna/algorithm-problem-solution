/*
https://practice.geeksforgeeks.org/problems/count-the-triplets4615/1#
Given an array of distinct integers. The task is to count all the triplets such that sum of two elements equals the third element.
 
Example 1:

Input:
N = 4
arr[] = {1, 5, 3, 2}
Output: 2
Explanation: There are 2 triplets: 
1 + 2 = 3 and 3 +2 = 5 
â€‹Example 2:

Input: 
N = 3
arr[] = {2, 3, 4}
Output: 0
Explanation: No such triplet exits
*/

class Solution {
    int countTriplet(int arr[], int n) {
        HashSet<Integer> set = new HashSet<Integer>();
        for(int i=0;i<arr.length;i++)
        {
            set.add(arr[i]);
        }
        int cnt = 0;
        for(int i=0;i<arr.length-1;i++)
        {
            for(int j=i+1;j<arr.length;j++)
            {
                if(set.contains(arr[i] + arr[j]))
                {
                    cnt++;
                }
            }
        }
        return cnt;
    }
}
