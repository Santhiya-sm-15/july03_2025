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