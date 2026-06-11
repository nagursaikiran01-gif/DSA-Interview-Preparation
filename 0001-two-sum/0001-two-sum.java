import java.util.HashMap;
import java.util.ArrayList;

class Solution {
    public int[] twoSum(int[] nums, int target) {
       HashMap<Integer,Integer> m1=new HashMap<>();
       int n=nums.length;
       int res[]=new int[2];
       for(int i=0;i<n;i++){
        if(m1.containsKey(nums[i])){
            res[0]=m1.get(nums[i]);
            res[1]=i;
        }
        else{
            m1.put(target-nums[i],i);
        }
       }
       return res;
    }
}