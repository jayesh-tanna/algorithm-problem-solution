/*
https://leetcode.com/explore/other/card/30-day-leetcoding-challenge/528/week-1/3285/
Given an integer array nums, find the contiguous subarray (containing at least one number) which has the largest sum and return its sum.
Example:

Input: [-2,1,-3,4,-1,2,1,-5,4],
Output: 6
Explanation: [4,-1,2,1] has the largest sum = 6.
*/

public class Solution {
    public int MaxSubArray(int[] nums) {
        if(nums == null)
            throw new ArgumentNullException();
        int sum = Int32.MinValue, currentSum = 0;
        for(int i=0;i<nums.Length;i++)
        {
            currentSum += nums[i];
            if(currentSum > sum)
                sum = currentSum;
            if(currentSum < 0)
                currentSum = 0;
            
        }
        return sum;
    }
}
