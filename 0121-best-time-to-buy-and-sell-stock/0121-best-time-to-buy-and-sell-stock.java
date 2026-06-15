class Solution {
    public int maxProfit(int[] prices) {
        int n=prices.length;
        int res=0;
        int l=0;
        int m1=prices[0];

        for(int i=1;i<n;i++){
            if(m1>prices[i]){
                m1=prices[i];
            }
            if(prices[i]-m1>res){
                res=prices[i]-m1;
            }
        }
        
        return res;
    }
}

//15mins
//O(n)-time
//O(1)-time