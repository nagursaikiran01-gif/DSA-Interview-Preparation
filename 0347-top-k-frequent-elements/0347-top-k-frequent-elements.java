class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int res[]=new int[k];
        int r=0;
        HashMap<Integer,Integer> m1=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(!m1.containsKey(nums[i])){
                m1.put(nums[i],1);
            }
            else{
                m1.put(nums[i],m1.get(nums[i])+1);
            }
        }
        int f=0;
        int x=0;
        for(int i=0;i<k;i++){
            for(int j:m1.keySet()){
                if(f<=m1.get(j)){
                    f=m1.get(j);
                    x=j;
                   
                }
            }
            m1.remove(x);
            res[i]=x;
            f=0;
        }
        return res;
    }
}