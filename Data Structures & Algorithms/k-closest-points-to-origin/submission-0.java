class Solution {
    public int[][] kClosest(int[][] points, int k) {
        ArrayList<int[]> result=new ArrayList<>();
        PriorityQueue<double[]> pq=new PriorityQueue<>((a,b)->Double.compare(a[0],b[0]));
        for(int i=0;i<points.length;i++){
            double sq1=Math.pow(0-points[i][0],2);
            double sq2=Math.pow(0-points[i][1],2);
            double sqrt=Math.sqrt(sq1+sq2);
            pq.offer(new double[]{sqrt,i});
        }
        for(int i=0;i<k;i++){
            result.add(points[(int)pq.poll()[1]]);
        }

        return result.toArray(new int[0][]);
    }
}
