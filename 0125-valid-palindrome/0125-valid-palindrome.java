class Solution {
    public boolean isPalindrome(String s) {
        String res="";
        for(char c:s.toCharArray()){
            int r=c;
            if((r>=65 && r<=90) || (r>=97 && r<=122) || (r>=48 && r<=57)){
                res+=Character.toLowerCase(c);
            }
        }
        int n=res.length();
        for(int i=0;i<n/2;i++){
            if(res.charAt(i)!=res.charAt(n-1-i)){
                return false;
            }
        }
        return true;
    }
}

//15min
//O(n^2)-time
//O(1)-space