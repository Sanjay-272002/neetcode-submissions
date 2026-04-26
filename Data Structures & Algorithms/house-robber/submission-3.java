class Solution {
    public int rob(int[] nums) {
        int [] dp=new int[nums.length+1];
        dp[0]=nums[0];
        for(int i=1;i<nums.length;i++){
            int pick=nums[i];
            int notpick=dp[i-1];
            if((i-2)>=0)pick+=dp[i-2];
            int max=Math.max(pick,notpick);
            dp[i]=max;
        }
        
        return dp[nums.length-1];
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
