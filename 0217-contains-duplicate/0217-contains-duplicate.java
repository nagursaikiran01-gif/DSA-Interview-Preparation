class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> s1=new HashSet<>();
        for(int i:nums){
            if(s1.contains(i)){
                return true;
            }
            s1.add(i);
        }
        return false;
    }
}
//4mins
//O(n)-time
//O(n)-space