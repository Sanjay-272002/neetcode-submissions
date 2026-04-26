class Solution {
    public int rob(int[] nums) {
        int [] dp=new int[nums.length+1];
        Arrays.fill(dp,-1);
        return maxRob(nums,nums.length-1,dp);
    }
    int maxRob(int[] nums,int n,int[] dp){
        if(n==0)return nums[0];
        if(n<0) return 0;
        if(dp[n]!=-1) return dp[n];
        int max=0;
        int pick=nums[n]+maxRob(nums,n-2,dp);
        int notpick=maxRob(nums,n-1,dp);
        max=Math.max(pick,notpick);
        return dp[n]=max;
    }
}
