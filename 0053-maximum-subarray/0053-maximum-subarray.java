class Solution {
    public int maxSubArray(int[] nums) {
        int n=nums.length;
        int sum=0;
        int max1=nums[0];
        if(n==1){
            return max1;
        }
        for(int i=0;i<n;i++){
            sum=nums[i]+sum;
            max1=Math.max(max1,sum);
            if(sum<0){
                sum=0;
            }
        }
        return max1;
    }
}

