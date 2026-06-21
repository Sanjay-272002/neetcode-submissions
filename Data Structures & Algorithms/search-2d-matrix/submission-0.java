class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int rn=matrix.length;
        int c=matrix[0].length;
        int l=0,r=rn*c-1;
        while(l<=r){
            int mid=l+(r-l)/2;
            if(matrix[mid/c][mid%c]==target) return true;
            else if(target>matrix[mid/c][mid%c])l=mid+1;
            else r=mid-1;
        }
        return false;
    }
}
