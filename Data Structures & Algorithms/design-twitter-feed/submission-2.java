class Twitter {

    int count=0;
    HashMap<Integer,Set<Integer>> followMap;
    HashMap<Integer,List<int[]>> tweetMap;

    public Twitter() {
        this.count=0;
        this.followMap=new HashMap<>();
        this.tweetMap=new HashMap<>();
    }
    
    public void postTweet(int userId, int tweetId) {
        tweetMap.computeIfAbsent(userId, k -> new ArrayList<>())
        .add(new int[]{count--, tweetId});
    }
    
    public List<Integer> getNewsFeed(int userId) {

       List<Integer> res=new ArrayList<>();
       PriorityQueue<int[]> minHeap=new PriorityQueue<>(Comparator.comparingInt(a -> a[0])); 
       followMap.computeIfAbsent(userId, k -> new HashSet<>()).add(userId);

       for(int followeeId : followMap.get(userId)){
        if(!tweetMap.containsKey(followeeId)) continue;
        List<int[] > tweets=tweetMap.get(followeeId);
        int index=tweets.size()-1;
        int[] tweet = tweets.get(index);
        minHeap.offer(new int[]{tweet[0],tweet[1],followeeId,index-1});
       }

       while(!minHeap.isEmpty() && res.size()<10){
        int [] currtweet=minHeap.poll();
        res.add(currtweet[1]);
        int index=currtweet[3];
        if(index>=0){
            int[] tweet = tweetMap.get(currtweet[2]).get(index);
                minHeap.offer(new int[]{tweet[0], tweet[1], currtweet[2], index - 1});
        }
       }
       return res;
    }
    
    public void follow(int followerId, int followeeId) {
        this.followMap.computeIfAbsent(followerId,k-> new HashSet<>()).add(followeeId);
    }
    
    public void unfollow(int followerId, int followeeId) {
        followMap.computeIfPresent(followerId, (k, v) -> {
    v.remove(followeeId);
    return v;
});
    }
}
