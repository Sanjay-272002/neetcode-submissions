class Solution {
    public int[][] kClosest(int[][] points, int k) {
    int l=0,r=points.length-1;
    int partition=points.length;
    while(partition!=k){
         partition=quickSort(points,l,r);
        if(partition <k)l=partition+1;
        else if(partition>k) r=partition-1;
    }
    int [][] res=new int[k][2];
    System.arraycopy(points,0,res,0,k);
    return res;
    }

    int quickSort(int[][] points,int l,int r){
        int ind=l;
        int pivotInd=r;
        int pivotdis=dis(points[pivotInd]);
        for(int i=l;i<r;i++ ){
            if(dis(points[i])<=pivotdis){
             swap(points,i,ind);
             ind++;
            } 
        }
        swap(points,ind,r);
       
        return ind;
        
            }

            void swap(int[][] points,int ind1,int ind2){
                int [] temp=points[ind1];
                points[ind1]=points[ind2];
                points[ind2]=temp;

            }
            int dis(int [] points){
                return points[0] * points[0] + points[1] * points[1];
            }
}
