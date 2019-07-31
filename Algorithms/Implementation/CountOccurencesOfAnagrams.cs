/*
https://practice.geeksforgeeks.org/problems/count-occurences-of-anagrams/0
Given a word S and a text C. Return the count of the occurences of anagrams of the word in the text.
Example:
Input:
2
forxxorfxdofr
for
aabaabaa
aaba

Output:
3
4
*/
using System;
public class GFG {
    private const int Max = 256;
	static public void Main () {
		int t = Convert.ToInt32(Console.ReadLine());
		while(t-- > 0){
		    string s = Console.ReadLine();
		    string p = Console.ReadLine();
		    int count = CountAnagrams(s,p);
		    Console.WriteLine(count);
		}
	}
	private static int CountAnagrams(string s,string p){
	    int[] sArr = new int[Max];
	    int[] pArr = new int[Max];
	    for(int i=0;i<p.Length;i++){
	        pArr[p[i]]++;
	        sArr[s[i]]++;
	    }
	    int count = 0;
	    if(Compare(sArr,pArr))
	        count++;
	    for(int i=p.Length;i<s.Length;i++){
	        sArr[s[i-p.Length]]--;
	        sArr[s[i]]++;
	        if(Compare(sArr,pArr))
	            count++;
	    }
	    return count;
	    
	}
	private static bool Compare(int[] a,int[] b){
	    for(int i=0;i<Max;i++){
	        if(a[i] != b[i])
	            return false;
	    }
	    return true;
	}
}
