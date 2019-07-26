/*
Given a binary string S. The task is to count the number of substrings that starts and end with 1. For example, if the input string is “00100101”, then there are three substrings “1001”, “100101” and “101”.
https://practice.geeksforgeeks.org/problems/count-substrings/0
*/

public class GFG {
	static public void Main () {
		int t = Convert.ToInt32(Console.ReadLine());
		while(t-- > 0){
		    string str = Console.ReadLine();
		    int count = CountSubstrings(str);
		    Console.WriteLine(count);
		}
	}
	
	private static int CountSubstrings(string str){
	    int count = 0;
	    for(int i=0;i<str.Length;i++){
	        if(str[i] == '1')
	            count++;
	    }
	    int j = 0;
	    int sum = 0;
	    while(count > j){
	        sum += j;
	        j++;
	    }
	    return sum;
	}
}
