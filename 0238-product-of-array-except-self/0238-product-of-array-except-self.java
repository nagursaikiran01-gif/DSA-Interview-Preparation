class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n=nums.length;
        int pre[]=new int[n];
        int suf[]=new int[n];
        pre[0]=1;
        suf[n-1]=1;
        int temp=1;
        for(int i=0;i<n;i++){
            pre[i]=temp;
            temp=temp*nums[i];
        }
        temp=1;
        for(int i=n-1;i>=0;i--){
            suf[i]=temp*pre[i];
            temp=temp*nums[i];
        }
        return suf;
    }
}

//11.25min
//O(n)-time
//O(n)-space