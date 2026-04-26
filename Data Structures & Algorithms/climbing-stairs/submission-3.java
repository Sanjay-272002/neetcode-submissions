class Solution {
    public int climbStairs(int n) {
        int dp[]=new int[n+1];
        int prev=1;
        int prev2=0;
        for(int i=1;i<=n;i++){
            int curr=0;
          curr+=prev;
          curr+=prev2;
          prev2=prev;
          prev=curr;
                  }
        
        return prev;
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
