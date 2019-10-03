/*
https://practice.geeksforgeeks.org/problems/counting-elements-in-two-arrays/1
Given two unsorted arrays arr1[] and arr2[]. They may contain duplicates. 
For each element in arr1[] count elements less than or equal to it in array arr2[].
*/


class GfG
{
    public static void countEleLessThanOrEqual(int arr1[], int arr2[], int m, int n)
    {
       int[] res = new int[m];
       Arrays.sort(arr2);
       for(int i=0;i<m;i++)
       {
           int l=0,r=n-1;
           while(l<=r)
           {
               int mid = (l + r) / 2;
               if(arr2[mid] <= arr1[i])
                    l = mid+1;
               else
                    r = mid-1;
           }
           res[i] = r+1;
       }
       
       for(int j=0;j<m;j++)
       {
           System.out.print(res[j] + " ");
       }
    }
}
