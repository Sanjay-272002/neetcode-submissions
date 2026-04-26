class Solution {
    public int climbStairs(int n) {
        int dp[]=new int[n+1];
        dp[0]=1;
        for(int i=1;i<=n;i++){
          dp[i]+=dp[i-1];
          if(i-2>=0)dp[i]+=dp[i-2];
                  }
        
        return dp[n];
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
