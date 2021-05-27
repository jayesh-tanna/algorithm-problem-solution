/*
Given an array of N elements and a number K. The task is to arrange array elements according to the absolute difference with K, i. e., element having minimum difference comes first and so on.
Note : If two or more elements are at equal distance arrange them in same sequence as in the given array.

Example 1:

Input: N = 5, K = 7
arr[] = {10, 5, 3, 9, 2}
Output: 5 9 10 3 2
Explanation: Sorting the numbers accoding to 
the absolute difference with 7, we have 
array elements as 5, 9, 10, 3, 2.

*/


static void sortABS(int arr[], int n,int k)
    {
        Integer[] sorted = new Integer[n];
        for(int i = 0; i<n;i++)
            sorted[i]=arr[i];
        Arrays.sort(sorted, new Comparator<Integer>() {
            public int compare(Integer o1, Integer o2) {
                o1 = Math.abs(o1 - k);
                o2 = Math.abs(o2 - k);
                return (o1).compareTo(o2);
            }
        });
        for(int i = 0; i<n;i++)
             System.out.print(sorted[i] + " ");
        
    }
