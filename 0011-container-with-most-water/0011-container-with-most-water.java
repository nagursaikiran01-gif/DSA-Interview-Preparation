class Solution {
    public int maxArea(int[] height) {
        int lmax=0;
        int rmax=height.length-1;
        int res=0;
        while(lmax<rmax){
            if(height[lmax]<=height[rmax]){
                if(res<height[lmax]*(rmax-lmax)){
                    res=height[lmax]*(rmax-lmax);
                }
                lmax++;
            }
            if(height[lmax]>height[rmax]){
                if(res<height[rmax]*(rmax-lmax)){
                    res=height[rmax]*(rmax-lmax);
                }
                rmax--;
            }
        }
        return res;
        /*
        int res=0;
        int n=height.length;
       
        for(int i=0;i<n;i++)
        { 
            for(int j=i;j<n;j++)
            {
                int min1=height[i];
                if(height[i]>height[j])
                {
                    min1=height[j];
                }
                if(res<min1*(j-i))
                {
                    res=min1*(j-i);
                }
            }
        }
        return res;*/
    }
}
//O(n)-time
//O(1)-space