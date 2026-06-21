class Solution {
    public int largestRectangleArea(int[] heights) {
        int n=heights.length;
        Stack<Integer> stack=new Stack<>();
        int maxArea=0;
        for(int i=0;i<=n;i++){
            while(!stack.isEmpty() && (i==n || heights[stack.peek()]> heights[i])){
                int nse=i;
                int height=heights[stack.pop()];
                int pse=stack.isEmpty()?-1:stack.peek();
                int width=nse-pse-1;
                maxArea=Math.max(maxArea,height*width);
            }
            stack.push(i);
        }

        return maxArea;
    }
}
