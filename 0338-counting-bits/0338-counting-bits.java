class Solution {
    public int c(int k){
        int temp=0;
        while(k!=0){
            temp++;
            k=k&(k-1);
        }
        return temp;
    }
    public int[] countBits(int n) {
        int res[]=new int[n+1];
        for(int i=0;i<=n;i++){
            res[i]=c(i);
        }
        return res;
    }
}

//O(n*log(k))-time
//O(n)-space