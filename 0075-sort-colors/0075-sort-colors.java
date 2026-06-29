class Solution {
    public void sortColors(int[] nums) {
        int n=nums.length;
        int z=0;
        int t=nums.length-1;
        int i=0;
        while(i<=t){
            if(nums[i]==2){
                if(nums[t]==2){
                    t--;
                    continue;
                }
                int temp=nums[t];
                nums[t]=2;
                nums[i]=temp;
                t--;
                i--;
            }
            else if(nums[i]==1){
                i++;
                continue;
            }
            else{
                if(nums[z]==0){
                    z++;
                    i++;
                    continue;
                }
                int temp=nums[z];
                nums[z]=0;
                nums[i]=temp;
                z++;
                i--;
            }
            i++;
        }

        /*
        int one=0;
        int two=0;
        int zero=0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]==0)
            {
                zero++;
            }
            else if(nums[i]==1)
            {
                one++;
            }
            else
            {
                two++;
            }
        }
        for(int i=0;i<nums.length;i++){
            if(zero!=0){
                nums[i]=0;
                zero--;
            }
            else if(one!=0){
                nums[i]=1;
                one--;
            }
            else
            {
                nums[i]=2;
                two--;
            }
        }
        */

    }
}