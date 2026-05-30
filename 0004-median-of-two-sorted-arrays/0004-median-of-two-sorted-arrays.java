class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n=nums1.length;
        int m=nums2.length;
        int res[]=new int[m+n];
        int temp=0;
        if(n==0 && m==0)
        {
            return 0;
        }
        if(n==1 && m==0)
        {   
            double a=nums1[0];
            return a;
        }
        if(n==0 && m==1)
        {
            double b=nums2[0];
            return b;
        }
        int a=0,b=0;
        for(int i=0;i<n+m;i++)
        {
            if(a<n && b<m && nums1[a]>=nums2[b])
            {
                res[temp]=nums2[b];
                b++;
                temp++;
            }
            if(a<n && b<m && nums1[a]<nums2[b])
            {
                res[temp]=nums1[a];
                a++;
                temp++;
            }
            if(a>=n && b<m)
            {
                res[temp]=nums2[b];
                b++;
                temp++;
            }
            if(b>=m && a<n)
            {
                res[temp]=nums1[a];
                a++;
                temp++;
            }

        }
       double sol=0;
       if((m+n)%2==0)
       {
           int t1=(m+n)/2;
           sol=((double)res[t1-1]+(double)res[t1])/2;
       }
       else
       {
           sol=(double)res[(m+n)/2];
       }
       return sol;
    }
}