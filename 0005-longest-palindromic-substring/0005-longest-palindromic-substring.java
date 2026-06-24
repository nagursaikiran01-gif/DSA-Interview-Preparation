class Solution {
    int f=0;
    int len=0;
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
    public void sol(String s,int l,int r){
        while(l>=0 && r<s.length() && s.charAt(l)==s.charAt(r)){
            l--;
            r++;
        }
        if(len<r-l-1){
            len=r-l-1;
            f=l+1;
        }
    }
    public String longestPalindrome(String s) {
        
        
        /*
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
        */
        int n=s.length();
        for(int i=0;i<n;i++){
            sol(s,i,i);
            sol(s,i,i+1);
        }
        StringBuilder b=new StringBuilder();
        for(int i=f;i<f+len;i++){
            b.append(s.charAt(i));
        }
        return b.toString();
        
    }
}