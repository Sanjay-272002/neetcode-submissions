class Solution {
    public int maxProfit(int[] prices) {
        int n=prices.length;
        int min=Integer.MAX_VALUE;
        int res=Integer.MIN_VALUE;
        int start=0,end=n-1;
        while(start<=end){
            min=Math.min(min,prices[start]);
            if(prices[start]>min)res=Math.max(res,prices[start]-min);
             start++;
        }
        if(res==Integer.MIN_VALUE) res=0;
        return res;
    }
}
