class Solution {
    public int maxProfit(int[] prices) {
        int n=prices.length;
        int min=Integer.MAX_VALUE;
        int res=0;
        int start=0,end=n-1;
        while(start<=end){
            min=Math.min(min,prices[start]);
            res=Math.max(res,prices[start]-min);
             start++;
        }
        
        return res;
    }
}
