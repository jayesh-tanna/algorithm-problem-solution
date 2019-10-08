
/*
https://practice.geeksforgeeks.org/problems/arrange-consonants-and-vowels/1
Given a singly linked list of size N containing only English Alphabets. Your task is to complete the function arrangeC&V(), 
that arranges the consonants and vowel nodes of the list it in such a way that all 
the vowels nodes come before the consonants while maintaining the order of their arrival.
*/

class Solution {
    
    public Node arrangeCV(Node head)
    {
        if(head == null)
            return null;
        Node cur = head;
        Node vowelHead = null, consoHead = null, vowelCur = null, consoCur = null;
        while(cur != null)
        {
            if(isVowel(cur.data))
            {
                if(vowelHead == null)
                {
                    vowelHead = cur;
                    vowelCur = cur;
                }
                else
                {
                    vowelCur.next = cur;
                    vowelCur = vowelCur.next;
                }
            }
            else
            {
                if(consoHead == null)
                {
                    consoHead = cur;
                    consoCur = cur;
                }
                else
                {
                    consoCur.next = cur;
                    consoCur = consoCur.next;
                }
            }
            cur = cur.next;
        }
        if(vowelHead == null)
            return consoHead;
        if (consoCur != null)
            consoCur.next = null;
        vowelCur.next = consoHead;
        return vowelHead;
    }
    private boolean isVowel(Character c)
    {
        return c.equals('a') 
        || c.equals('i') 
        || c.equals('e') 
        || c.equals('o') 
        || c.equals('u');
    }
}
