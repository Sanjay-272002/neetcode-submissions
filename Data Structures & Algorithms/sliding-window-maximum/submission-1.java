class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
      int [] output=new int[nums.length-k+1];
      Deque<Integer> qu=new LinkedList<>();
      int end=0,st=0,ind=0;
      while(end<nums.length){
        while(!qu.isEmpty() && nums[qu.getLast()]<nums[end] ){
            qu.removeLast();
        }
        qu.addLast(end);
        if(st> qu.getFirst()) qu.removeFirst();

        if((end-st+1)==k){
        output[ind++]=nums[qu.getFirst()];
        st++;
        }
       
        end++;
      }  
     return output;
    }
}
