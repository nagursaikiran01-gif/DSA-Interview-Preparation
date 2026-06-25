class Solution {
    List<List<Integer>> res=new ArrayList<>();
    public void p(int[] nums,int pos,int n,List<Integer> l,HashSet<Integer> s){
        int s1=s.size();
        if(s1==n){
            List<Integer> k=new ArrayList<>(l);
            res.add(k);
            return;
        }
        for(int i=0;i<n;i++){
            if(!s.contains(nums[i])){
                l.add(nums[i]);
                s.add(nums[i]);
                p(nums,i,n,l,s);
                l.remove(l.size() - 1);
                s.remove(nums[i]);
            }
        }
    }
    public void per(int nums[],int pos,int n){
        if(pos==n){
            List<Integer> l1=new ArrayList<>();
            for(int i:nums){
                l1.add(i);
            }
            res.add(l1);
            return;
        }
        for(int i=pos;i<n;i++){
            int temp=nums[pos];
            nums[pos]=nums[i];
            nums[i]=temp;
            per(nums,pos+1,n);
            temp=nums[pos];
            nums[pos]=nums[i];
            nums[i]=temp;
        }
    }
    public List<List<Integer>> permute(int[] nums) {
        //p(nums,0,nums.length,new ArrayList<>(),new HashSet<>());
        //return res;
        per(nums,0,nums.length);
        return res;
    }
}

//O(n*n!)-time
//O(n)-space-axi
//O(n*n!)-space