/*
Given a string, check if it is a palindrome by ignoring spaces. E.g. race car would be a palindrome.
https://practice.geeksforgeeks.org/problems/string-palindromic-ignoring-spaces/0
*/

using System;
public class GFG {
	static public void Main () {
		int t = Convert.ToInt32(Console.ReadLine());
		while(t-- > 0){
		    string str = Console.ReadLine();
		    string output = Palindromic(str);
		    Console.WriteLine(output);
		}
	}
	
	private static string Palindromic(string str){
	    int l = 0;
	    int r = str.Length - 1;
	    while(l <= r){
	        
	        while(str[l] == ' ')
	            l++;
	            
	        while(str[r] == ' ')
	            r--;
	        
	        if(str[l] != str[r])
                return "NO";
            l++;
            r--;
	    }
	    return "YES";
	}
}
