import java.util.HashMap;
import java.util.ArrayList;

class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> map1=new HashMap<Integer,Integer>();
        for(int i=0;i<nums.length;i++)
        {
            if(!map1.containsKey(nums[i]) )
            {
                map1.put(nums[i],i);
            }
            if(map1.containsKey(target-nums[i]) && map1.get(target-nums[i])!=i)
            {
                return new int[]{i,map1.get(target-nums[i])};
            }
        }
        return null;
    }
}