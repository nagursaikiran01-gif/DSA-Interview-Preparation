class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length == 0){
            return 0;
        }
        int longest = 1;
        
         HashSet<Integer> s = new HashSet<>();
         for(int i = 0; i < nums.length; i++){
            s.add(nums[i]);
         }
        int count=1;
         for(int k:s){
           count = 1;
            if(!s.contains(k-1)){
                while(true){
                if(s.contains(k)){
                longest = Math.max(count,longest);
                count++;
                k++;
                }
                else{
                    break;
                }
                }
            }
         }
         return longest;

            
    }
}