/*
Given a linked list of strings having n nodes check to see whether the combined string formed is palindrome or not. 
https://practice.geeksforgeeks.org/problems/linked-list-of-strings-forms-a-palindrome/1
*/

class GfG
{
    public static boolean compute(Node node)
    {
        StringBuilder str = new StringBuilder();
        Node temp = node;
        while(temp != null)
        {
            str.append(temp.data);
            temp = temp.next;
        }
        
        return isPalin(str.toString());
    }
    
    public static boolean isPalin(String str)
    {
        int l =0;
        int r = str.length() - 1;
        while(l <= r)
        {
            if(str.charAt(l) != str.charAt(r))
               return false;
            l++;
            r--;
        }
        return true;
    }
}
