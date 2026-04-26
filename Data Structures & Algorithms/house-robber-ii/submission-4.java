class Solution {
    public int rob(int[] nums) {
        int [][] dp=new int[nums.length][2];
        for (int[] row : dp)
        Arrays.fill(row, -1);
        return maxMoney(nums,nums.length-1,false,dp);
    }
    int maxMoney(int [] nums,int index,boolean flag,int[][] dp){
        if(index<0 || (flag && index==0))return 0;
        if(index==0)return nums[0];
         int f = flag ? 1 : 0;

        if (dp[index][f] != -1)
        return dp[index][f];
        if(dp[index][f]!=-1) return dp[index][f];
        int max=0;
        int pick=nums[index]+maxMoney(nums,index-2,flag || index==nums.length-1,dp);
        int notpick=maxMoney(nums,index-1,flag,dp);
        return dp[index][f]=Math.max(pick,notpick);
    }
}
