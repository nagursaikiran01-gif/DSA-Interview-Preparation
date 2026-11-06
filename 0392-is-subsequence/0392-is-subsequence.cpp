class Solution {
public:
    bool isSubsequence(string s, string t) {
        int flag=0;
        int n1=s.size();
        int n2=t.size();
        int i=0,j=0;
        if(n1==0){
            return true;
        }
        while(i<n1 && j<n2){
            if(s[i]==t[j]){
                i++;
            }
            if(i==n1){
                return true;
            }
            j++;
        }
        return false;
    }
};