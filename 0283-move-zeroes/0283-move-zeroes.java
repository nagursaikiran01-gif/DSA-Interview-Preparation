class Solution {
    public void moveZeroes(int[] nums) {
        int l=0;
        int temp=0;
        int non=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                temp++;
            }
        }
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=0){
                nums[non]=nums[i];
                non++;
            }
        }
        for(int i=nums.length-temp;i<nums.length;i++){
            nums[i]=0;
        }
    }
}