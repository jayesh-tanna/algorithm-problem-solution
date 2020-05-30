/*
https://leetcode.com/explore/other/card/30-day-leetcoding-challenge/528/week-1/3286/
Given an array nums, write a function to move all 0's to the end of it while maintaining the relative order of the non-zero elements.
Example:

Input: [0,1,0,3,12]
Output: [1,3,12,0,0]
Note:

You must do this in-place without making a copy of the array.
Minimize the total number of operations.
*/

public class Solution {
    public void MoveZeroes(int[] nums) {
        if(nums == null)
            throw new ArgumentNullException();
        int zeroCount = 0;
        for(int i=0;i<nums.Length;i++)
            zeroCount += (nums[i] == 0) ? 1 : 0;
        if(zeroCount == 0)
            return;
        int j=0;
        for(int i=0;i<nums.Length;i++)
        {
            if(nums[i] == 0)
                continue;
            nums[j++] = nums[i];
        }
        for(int i=0;i<zeroCount;i++)
            nums[j++] = 0;
    }
}
