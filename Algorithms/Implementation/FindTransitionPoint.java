/*
You are given a sorted array containing only numbers 0 and 1. Find the transition point efficiently. 
Transition point is a point where "0" ends and "1" begins.
https://practice.geeksforgeeks.org/problems/find-transition-point/1
*/


class GfG
{
	int transitionPoint(int arr[],int n)
	{
	    int low = 0;
	    int high = arr.length - 1;
	    while(low <= high){
	        int mid = (low + high) / 2;
	        if(arr[mid] == 1 && arr[mid - 1] == 0)
	            return mid;
	       if(arr[mid] == 1){
	            high = mid - 1;
	        }
	        else if(arr[mid] == 0)
	            low = mid +1;
	    }
	    return -1;
    } 
}
