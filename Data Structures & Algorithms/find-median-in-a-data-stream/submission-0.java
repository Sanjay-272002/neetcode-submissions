class MedianFinder {
    PriorityQueue<Integer> minQueue;
    
    public MedianFinder() {
        this.minQueue=new PriorityQueue<>();
    }
    
    public void addNum(int num) {
        this.minQueue.offer(num);
    }
    
    public double findMedian() {
        double median=0;
        ArrayList<Integer> arr=new ArrayList<>();
        if(this.minQueue.size()%2==0){
            int mid=minQueue.size()/2;
            int cn=0;
             while(cn!=mid){
               arr.add(minQueue.poll());
               cn++;
             }
             median=((double)minQueue.peek()+arr.get(arr.size()-1))/2;
        }else{
             int mid=minQueue.size()/2;
             int cn=0;
             while(cn!=mid){
               arr.add(minQueue.poll());
               cn++;
             }
             median=(double)minQueue.peek();
        }
        for(int i=0;i<arr.size();i++){
            minQueue.offer(arr.get(i));
        }
        return median;
    }
}
