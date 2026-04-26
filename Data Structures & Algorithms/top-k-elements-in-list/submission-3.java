class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> hm=new HashMap<>();
        for(int i :nums){
            hm.put(i,hm.getOrDefault(i,0)+1);
        }
        PriorityQueue<int[]> pq=new PriorityQueue<>((a,b)->b[1]-a[1]);
        for(int i:hm.keySet()){
            pq.add(new int[]{i,hm.get(i)});
        } 
        int [] res=new int[k]; 
        for(int i=0;i<k;i++)
        {
            res[i]=pq.remove()[0];
        }
        return res;
    }
}
