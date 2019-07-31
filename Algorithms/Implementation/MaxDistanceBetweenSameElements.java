//Given an array with repeated elements, the task is to find the maximum distance between two occurrences of an element.
//https://practice.geeksforgeeks.org/problems/max-distance-between-same-elements/1


class GfG
{
    int maxDistance(int arr[], int n)
    {
	    Map <Integer,Integer> map = new HashMap<Integer, Integer>();
	    int diff = 0;
	    for(int i=0;i<n;i++){
	        if(map.containsKey(arr[i])){
	            int currentDiff = i - map.get(arr[i]);
	            if(currentDiff > diff)
	                diff = currentDiff;
	        }else{
	            map.put(arr[i],i);
	        }
	    }
	    return diff;
    }
}
