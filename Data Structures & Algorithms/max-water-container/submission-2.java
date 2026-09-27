class Solution {
    public int maxArea(int[] heights) {
        int l=0,e=heights.length-1;
        int res=0;
        while(l<e){
         int len=e-l;
         int breadth=Math.min(heights[l],heights[e]);
         res=Math.max(res,len*breadth);
         if(heights[l]>=heights[e])e--;
         else l++;

        }

        return res;
    }
}
