/*
https://practice.geeksforgeeks.org/problems/common-elements5420/1
Given two lists V1 and V2 of sizes n and m respectively. Return the list of elements common to both the lists and return the list in sorted order. Duplicates may be there in the output list.

Example:

Input:
5
3 4 2 2 4
4
3 2 2 7

Output:
2 2 3

Explanation:
The first list is {3 4 2 2 4}, and the second list is {3 2 2 7}. 
The common elements in sorted order are {2 2 3}
User Task:
This is a function problem. You need to complete the function common_element that takes both the lists as parameters and returns a list of common elements.

Constraints:
1 <= n, m <= 105
1 <= Vi <= 105
*/
public static ArrayList<Integer> common_element(ArrayList<Integer> v1, ArrayList<Integer> v2)
{
    ArrayList<Integer> res = new ArrayList<Integer>();
    if((v1 == null || v1.isEmpty()) && (v2 == null || v2.isEmpty()))
        return res;
    Map<Integer, Integer> v1map = new HashMap<Integer, Integer>();
    Map<Integer, Integer> v2map = new HashMap<Integer, Integer>();
    for(int i=0;i<v1.size();i++)
    {
        if(!v1map.containsKey(v1.get(i)))
            v1map.put(v1.get(i),1);
        else
        {
            int v = v1map.get(v1.get(i));
            v1map.put(v1.get(i),++v);
        }
    }
    for(int i=0;i<v2.size();i++)
    {
        if(!v2map.containsKey(v2.get(i)))
            v2map.put(v2.get(i),1);
        else
        {
            int v = v2map.get(v2.get(i));
            v2map.put(v2.get(i),++v);
        }
    }
    for (Map.Entry<Integer,Integer> me : v1map.entrySet()) 
    {
          if(v2map.containsKey(me.getKey()))
          {
              int c2 = v2map.get(me.getKey());
              int c1 = v1map.get(me.getKey());
              int m = Math.min(c1,c2);
              for(int j=0;j<m;j++)
              {
                  res.add(me.getKey());
              }
          }
    }
    Collections.sort(res);
    return res;
}
