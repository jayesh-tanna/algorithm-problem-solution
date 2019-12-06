/*
https://practice.geeksforgeeks.org/problems/count-distinct-elements-in-every-window/1
Given an array A[] of size N and an integer K. Your task is to complete the function countDistinct() which 
prints the count of distinct numbers in all windows of size k in the array A[].
*/

class GfG
{
    void countDistinct(int A[], int k, int n)
    {
	    HashMap<Integer, Integer> map = new LinkedHashMap<Integer, Integer>();
	    for(int i=0;i<k;i++)
	    {
	        if(map.containsKey(A[i]))
	                map.put(A[i],map.get(A[i]) + 1); 
	        else
	            map.put(A[i],1);       
	    }
	    System.out.print(map.size() + " ");
	    int j=0;
	    for(int i=k;i<n;i++)
	    {
	        Integer fre = map.get(A[j]);
	        if(fre == 1)
	            map.remove(A[j]);
	       else
	            map.put(A[j],map.get(A[j]) - 1);
	        if(map.containsKey(A[i]))
	           map.put(A[i],map.get(A[i]) + 1); 
	        else
	            map.put(A[i],1);       
	       System.out.print(map.size() + " ");
	       j++;
	    }
	    
    }
}
