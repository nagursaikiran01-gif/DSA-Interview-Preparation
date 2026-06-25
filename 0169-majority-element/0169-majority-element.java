class Solution {
    public int majorityElement(int[] nums) {
        int c=1;
        int temp=nums[0];
        for(int i=1;i<nums.length;i++){
            if(temp!=nums[i] && c>1){
                c--;
            }
            else if(temp!=nums[i] && c==1){
                temp=nums[i];
            }
            else if(temp==nums[i]){
                c++;
            }
        }
        return temp;
    }
}

//6.24min
//O(n)-time
//O(1)-space