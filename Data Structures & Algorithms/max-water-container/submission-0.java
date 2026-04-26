class Solution {
    public int maxArea(int[] heights) {
        int max=Integer.MIN_VALUE;
        int left=0;
        int n=heights.length;
        int right=n-1;
        while(left<right){
            int min=Math.min(heights[left],heights[right]);
            int area=min*(right-left);
            max=Math.max(max,area);
            if(heights[left]<heights[right]) left++;
            else right--;
        }
        return max;
    }
}
