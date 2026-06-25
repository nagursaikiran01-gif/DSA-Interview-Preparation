class Solution {
    public int missingNumber(int[] nums) {
        int n=nums.length;
        int total=0;
        for(int i=0;i<n;i++){
            total+=nums[i];
        }
        int k=n*(n+1)/2;
        return k-total;
    }
}

//5mins
//O(n)-time
//O(1)-space