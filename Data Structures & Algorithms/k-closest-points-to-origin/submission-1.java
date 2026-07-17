class Solution {
    public int[][] kClosest(int[][] points, int k) {
        ArrayList<int[]> result=new ArrayList<>();
        PriorityQueue<int[]> pq=new PriorityQueue<>(Comparator.comparing(a -> a[0]));
        for(int i=0;i<points.length;i++){
            int sq1=points[i][0]*points[i][0];
            int sq2=points[i][1]*points[i][1];
            pq.offer(new int[]{sq1+sq2,i});
        }
        for(int i=0;i<k;i++){
            result.add(points[pq.poll()[1]]);
        }

        return result.toArray(new int[0][]);
    }
}
