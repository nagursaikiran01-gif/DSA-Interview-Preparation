class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap<Character,Integer> m1=new HashMap<>();
        for(char k:s.toCharArray()){
            if(!m1.containsKey(k)){
                m1.put(k,1);
            }
            else{
                m1.put(k,m1.get(k)+1);
            }
        }
        for(char k:t.toCharArray()){
            if(m1.containsKey(k) && m1.get(k)>0){
                m1.put(k,m1.get(k)-1);
                if(m1.get(k)==0){
                    m1.remove(k);
                }
            }
            else{
                return false;
            }
        }
        if(!m1.isEmpty()){
            return false;
        }
        return true;
    }
}
//8mins
//O(n)-time
//O(n)-space