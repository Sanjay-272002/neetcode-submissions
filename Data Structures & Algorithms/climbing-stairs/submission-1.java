class Solution {
    public int climbStairs(int n) {
        int dp[]=new int[n+1];
        Arrays.fill(dp,-1);
        return Count(n,dp);
    }
    int Count(int n,int[] dp){
        if(n==0) return 1;
        if(n<0) return 0;
        if(dp[n]!=-1)return dp[n];
        int ans=0;
        ans+=Count(n-1,dp);
        ans+=Count(n-2,dp);
        return dp[n]=ans;
    }
}
