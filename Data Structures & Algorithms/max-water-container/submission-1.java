class Solution {
    public int maxArea(int[] nums) {
        int res=0;
        int l=0,r=nums.length-1;
        while(l<r){
            int min=Math.min(nums[l],nums[r]);
            int len=r-l;
            int prod=len*min;
            res=Math.max(res,prod);
            if(nums[l]<nums[r])l++;
            else r--;
        }
        return res;
    }
}
