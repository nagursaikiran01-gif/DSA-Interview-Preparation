class Solution {
    public int lengthOfLongestSubstring(String s) {
        int res=1;
        HashSet<Character> s1=new HashSet<>();
        int n=s.length();
        int l=0;
        int i=0;
        if(s.length()==0){
            return 0;
        }
        while(i<n){
            if(s1.contains(s.charAt(i))){
                s1.remove(s.charAt(l));
                l++;
            }
            else{
                s1.add(s.charAt(i));
                i++;
            }
            res=Math.max(res,s1.size());
        }
        return res;
    }
}

//19mins