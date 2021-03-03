/*
Given a sorted array with possibly duplicate elements. The task is to find indexes of first and last occurrences of an element X in the given array.

Note: If the element is not present in the array return {-1,-1} as pair.
https://practice.geeksforgeeks.org/problems/find-first-and-last-occurrence-of-x0849/1#
*/

class Compute {
    
    public pair indexes(long v[], long x)
    {
        int l = 0, r = v.length - 1;
        while(l <= r)
        {
            int m = l + (r-l) / 2;
            if(x < v[m])
                r = m -1;
            else if(x > v[m])
                l = m + 1;
            else
            {
                int i = m, j = m+1;
                while(i >= 0 && v[i] == x)
                    i--;
                while(j < v.length && v[j] == x)
                    j++;
                return new pair(i+1,j-1);
            }
        }
        return new pair(-1,-1);
    }
}
