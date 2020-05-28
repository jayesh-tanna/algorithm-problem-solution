/*
https://leetcode.com/explore/other/card/30-day-leetcoding-challenge/528/week-1/3283/
Given a non-empty array of integers, every element appears twice except for one. Find that single one.

Note:

Your algorithm should have a linear runtime complexity. Could you implement it without using extra memory?*/

public class Solution {
    public int SingleNumber(int[] nums) {
        Array.Sort(nums);
        int l =0,h=nums.Length - 1,m=0;
        while(l < h)
        {
                m = (l + h) / 2;
                if(m % 2 == 0)
                {
                        if(nums[m] == nums[m+1])
                                l = m + 2;
                        else
                                h = m;
                }
                else
                {
                        if(nums[m] == nums[m-1])
                                l = m + 1;
                        else
                                h = m - 1;
                }
        }
        return nums[l];
    }
}
