/*
Given a String S, reverse the string without reversing its individual words. Words are separated by dots.

Example 1:

Input:
S = i.like.this.program.very.much
Output: much.very.program.this.like.i
Explanation: After reversing the whole
string(not individual words), the input
string becomes
much.very.program.this.like.i

https://practice.geeksforgeeks.org/problems/reverse-words-in-a-given-string5459/1
*/

class Solution {
    String reverseWords(String s) {
        StringBuilder sb = new StringBuilder("");
        StringBuilder cur = new StringBuilder("");
        for(int i=s.length()-1;i>=0;i--){
            if(s.charAt(i) == '.'){
                String rev = reverse(cur.toString());
                sb.append(rev);
                sb.append(".");
                cur = new StringBuilder("");
            }
            else{
                cur.append(s.charAt(i));
            }
        }
        sb.append(reverse(cur.toString()));
        return sb.toString();
    }
    
    String reverse(String s){
        StringBuilder sb = new StringBuilder("");
        for(int i=s.length()-1;i>=0;i--){
            sb.append(s.charAt(i));
        }
        return sb.toString();
    }
}
