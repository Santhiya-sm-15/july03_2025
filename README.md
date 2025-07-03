# july03_2025
The problem that i solved today in leetcode

Alice and Bob are playing a game. Initially, Alice has a string word = "a".

You are given a positive integer k.

Now Bob will ask Alice to perform the following operation forever:

Generate a new string by changing each character in word to its next character in the English alphabet, and append it to the original word.
For example, performing the operation on "c" generates "cd" and performing the operation on "zb" generates "zbac".

Return the value of the kth character in word, after enough operations have been done for word to have at least k characters.

Note that the character 'z' can be changed to 'a' in the operation.

Code:
class Solution {
    public char kthCharacter(int k) {
        StringBuilder sb=new StringBuilder("a");
        while(sb.length()<k)
        {
            int l=sb.length();
            for(int i=0;i<l;i++)
            {
                int c=sb.charAt(i)-'a';
                c=(c+1)%26;
                sb.append((char)(c+97));
                if(sb.length()==k)
                    return sb.charAt(k-1);
            }
        }
        return sb.charAt(k-1);
    }
}
