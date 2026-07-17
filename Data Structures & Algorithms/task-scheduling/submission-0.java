class Solution {
    public int leastInterval(char[] tasks, int n) {
        int [] freq=new int[26];
        for(int i=0;i<tasks.length;i++){
            freq[tasks[i]-'A']++;
        }
        PriorityQueue<Integer> pq=new PriorityQueue<>(Collections.reverseOrder());
        for(int f :freq){
            if(f>0) pq.offer(f);
        }
        Queue<int[]> qu=new LinkedList<>();
        int time=0;
        while(!qu.isEmpty() || !pq.isEmpty()){
        time++;
        if(pq.isEmpty()){
            time=qu.peek()[1];
        }else{
            int remcn=pq.poll()-1;
            if(remcn>0)qu.offer(new int[]{remcn,time+n});
        }
        if(!qu.isEmpty() && qu.peek()[1]==time){
            pq.add(qu.poll()[0]);
        }
        }
        return time;
    }
}
