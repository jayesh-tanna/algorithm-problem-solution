/*
Given a string which may contains lowercase and uppercase chracters. 
The task is to remove all  duplicate characters from the string and print the resultant string.  
The order of remaining characters in the output should be same as in the original string.
https://practice.geeksforgeeks.org/problems/remove-all-duplicates-from-a-given-string/0
*/

using System;
using System.Text;
public class GFG {
	static public void Main () {
		int t= Convert.ToInt32(Console.ReadLine());
		while(t-- > 0){
		    string str = Console.ReadLine();
		    str = RemoveDuplicates(str);
		    Console.WriteLine(str);
		}
	}
	private static string RemoveDuplicates(string str){
	    bool[] flips = new bool[52];
	    StringBuilder sb = new StringBuilder();
	    for(int i=0;i<str.Length;i++){
	        int baseIdx = char.IsUpper(str[i]) ? 65 : 71;
	        if(!(flips[str[i] - baseIdx])){
	            flips[str[i] - baseIdx] = true; 
	            sb.Append(str[i]);
	        }
	    }
	    return sb.ToString();
	}
}
//Another way in java
class Solution {
    String removeDups(String s) {
        if(s == null || s == "")
            return s;
        HashSet<Character> distinctLetters = new HashSet<Character>();
        StringBuilder builder = new StringBuilder("");
        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            if(Character.isUpperCase(c))
                c = Character.toLowerCase(c);
            if(!distinctLetters.contains(s.charAt(i))){
                distinctLetters.add(c);
                builder.append(s.charAt(i));
            }
        }
        return builder.toString();
    }
}
