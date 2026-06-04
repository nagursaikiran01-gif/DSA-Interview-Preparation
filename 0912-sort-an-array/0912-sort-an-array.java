class Solution {
    public int pivot(int[] nums,int l,int r){
        int p=r;
        int j=l;
        int i=j-1;
        while(j<p){
            if(nums[j]<=nums[p]){
                i++;
                int temp=nums[j];
                nums[j]=nums[i];
                nums[i]=temp;
            }
            j++;
        }
        int temp=nums[i+1];
        nums[i+1]=nums[p];
        nums[p]=temp;
        return i+1;
    }
    public void quick(int nums[],int l,int r){
        if(l>=r){
            return;
        }
        int p=pivot(nums,l,r);
        quick(nums,l,p-1);
        quick(nums,p+1,r);
    }
    public int[] sortArray(int[] nums) {
       // quick(nums,0,nums.length-1);
        //return nums;
        Arrays.sort(nums);
        return nums;
    }
}