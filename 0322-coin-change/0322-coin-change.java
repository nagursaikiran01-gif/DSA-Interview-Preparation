class Solution {
    /*
    public int solve(int[] coins,int amount){
        if(amount==0){
            return 0;
        }
        if(amount<0){
            return Integer.MAX_VALUE;
        }
        int min1=Integer.MAX_VALUE;
        for(int coin:coins){
            int res=solve(coins,amount-coin);
            if(res!=Integer.MAX_VALUE){
                min1=Math.min(min1,res+1);
            }
        }
        return min1;

    }
    public int coinChange(int[] coins, int amount) {
        int ans=solve(coins,amount);
        if(ans==Integer.MAX_VALUE){
            return -1;
        }
        return ans;

    }*/

    public int solve(int[] coins,int amount,int dp[]){
        if(amount==0){
            return 0;
        }
        if(amount<0){
            return Integer.MAX_VALUE;
        }
        if(dp[amount]!=-1){
            return dp[amount];
        }
        int min1=Integer.MAX_VALUE;
        for(int coin:coins){
            int res=solve(coins,amount-coin,dp);
            if(res!=Integer.MAX_VALUE){
                min1=Math.min(min1,1+res);
            }
        }
        dp[amount]=min1;
        return min1;

    }
    public int coinChange(int[] coins, int amount) {
        int dp[]=new int[amount+1];
        Arrays.fill(dp,-1);
        int res=solve(coins,amount,dp);
        if(res==Integer.MAX_VALUE){
            return -1;
        }
        return res;

    }
}