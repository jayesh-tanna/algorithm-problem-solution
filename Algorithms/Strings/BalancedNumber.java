
/*
https://practice.geeksforgeeks.org/problems/check-if-the-number-is-balanced3014/1/
Given an integer N which has odd number of digits, find whether the given number is a balanced or not.

An odd digit number is called a balanced number if the sum of all digits to the left of the middle digit and the sum of all digits to the right of the middle digit is equal.

Example 1:

Input:
N = 1234006
Output: 1 
Explanation: Total number of digits in
N = 7. Middle digit is 4. LHS = 1+2+3 = 6
and RHS = 0+0+6 = 6. LHS is equal to RHS. 


Example 2:

Input:
N = 12345
Output: 0
Explanation: LHS = 1+2 = 3 and RHS = 4+5
= 9. LHS and RHS are not equal.

*/


class Sol
{
    Boolean balancedNumber(String s)
    {
        int n = s.length();
         int m = n / 2;
         long ls = 0, rs = 0;
         int l = m-1,r = m+1;
         while(l>=0 && r < n)
         {
             ls += Character.getNumericValue(s.charAt(l--));
             rs += Character.getNumericValue(s.charAt(r++));
         }
         return ls == rs ? true : false;
    }
}
