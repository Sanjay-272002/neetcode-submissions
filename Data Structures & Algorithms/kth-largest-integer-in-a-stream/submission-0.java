class KthLargest {
    int res;
    PriorityQueue<Integer> pq=new PriorityQueue<>();
    public KthLargest(int k, int[] nums) {
        this.res=k;
        for(int i=0;i<nums.length;i++){
            this.pq.offer(nums[i]);
            if (this.pq.size() > res) {
                this.pq.poll();
            }
        }
    }
    
    public int add(int val) {
        this.pq.offer(val);
        if (this.pq.size() > res) {
                this.pq.poll();
            }
        return this.pq.peek();
    }
}
