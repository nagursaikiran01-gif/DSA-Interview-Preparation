class Solution {
    public int subarraySum(int[] nums, int k) {
        int n=nums.length;
        int p[]=new int[n];
        int temp=0;
        for(int i=0;i<n;i++){
            temp+=nums[i];
            p[i]=temp;
        }
        int res=0;
        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                if(i==0){
                    if(p[j]==k){
                        res++;
                    }
                }
                else{
                    if(p[j]-p[i-1]==k){
                        res++;
                    }
                }
            }
        }
        return res;
    }
}