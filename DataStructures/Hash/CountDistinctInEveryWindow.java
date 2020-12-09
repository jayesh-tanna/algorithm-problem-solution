/*
https://practice.geeksforgeeks.org/problems/count-distinct-elements-in-every-window/1#
Given an array of integers and a number K. Find the count of distinct elements in every window of size K in the array.

Example 1:

Input:
N = 7, K = 4
A[] = {1,2,1,3,4,2,3}
Output: 3 4 4 3
Explanation: Window 1 of size k = 4 is
1 2 1 3. Number of distinct elements in
this window are 3. 
Window 2 of size k = 4 is 2 1 3 4. Number
of distinct elements in this window are 4.
Window 3 of size k = 4 is 1 3 4 2. Number
of distinct elements in this window are 4.
Window 4 of size k = 4 is 3 4 2 3. Number
of distinct elements in this window are 3.
Example 2:

Input:
N = 3, K = 2
A[] = {4,1,1}
Output: 2 1
Your Task:
Your task is to complete the function countDistinct() which takes the array A[], the size of the array(N) and the window size(K) as inputs and returns an array containing the count of distinct elements in every contiguous window of size K in the array A[].

Expected Time Complexity: O(N).
Expected Auxiliary Space: O(N).

Constraints:
1 <= N <= K <= 105
1 <= A[i] <= 105 , for each valid i
*/

class Solution
{
    ArrayList<Integer> countDistinct(int A[], int n, int k)
    {
        ArrayList<Integer> res = new ArrayList<Integer>();
        if(A == null || A.length == 0)
            return res;
        if(k <= 0)
             return res;
        HashMap<Integer,Integer> distinct = new HashMap<Integer,Integer>();
        for(int i=0;i<k;i++)
        {
            addElementWithFrequency(distinct,A[i]);
        }
        res.add(distinct.size());
        modifyFrequency(distinct,A[0]);
        int c = 1;
        for(int i=k;i<A.length;i++)
        {
            addElementWithFrequency(distinct,A[i]);
            res.add(distinct.size());
            modifyFrequency(distinct,A[c]);
            c++;
        }
        return res;
    }
    void addElementWithFrequency(HashMap<Integer,Integer> distinct,int val)
    {
        int count = 1;
        if(distinct.containsKey(val))
        {
            count = distinct.get(val);
            count++;
        }
        distinct.put(val,count);
    }
    void modifyFrequency(HashMap<Integer,Integer> distinct,int key)
    {
        int j = distinct.get(key);
        j--;
        if(j == 0)
            distinct.remove(key);
        else
            distinct.put(key,j);
    }
}

