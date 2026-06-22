class Solution {
    public int reverseBits(int n) {
        int temp=1;
        int res=0;
        for(int i=0;i<32;i++){
            int r=n & temp;
            r=r>>i;
            r=r<<32-i-1;
            res=res|r;
            temp=temp<<1;
        }
        return res;
    }
}