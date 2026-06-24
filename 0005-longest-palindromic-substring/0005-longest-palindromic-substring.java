class Solution {
    public boolean pali(String k,int i,int j)
    {
        while(i<j)
        {
            if(!(k.charAt(i)==(k.charAt(j))))
            {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
    public String longestPalindrome(String s) {
        
        int n=s.length();
        
        int mi=0;
        int mj=0;
        int max=0;
        for(int i=0;i<n;i++)
        {
            for(int j=n-1;j>=0;j--)
            {
                if(i<j && pali(s,i,j))
                {
                    if(max<j-i)
                    {
                        max=j-i;
                        mj=j;
                        mi=i;
                    }
                }
            }
        }
        String res="";
        while(mi<=mj)
        {
            res=res+s.charAt(mi);
            mi++;
        }
        return res;
        
        
    }
}