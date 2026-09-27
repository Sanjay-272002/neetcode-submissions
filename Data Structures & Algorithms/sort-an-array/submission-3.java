class Solution {
    public int[] sortArray(int[] nums) {
        return mergeSort(nums,0,nums.length-1);
    }
    int [] mergeSort(int[] nums,int st,int end){
         if(st>=end) return new int[]{nums[st]};
        int mid=st+(end-st)/2;
        int [] left=mergeSort(nums,st,mid);
        int [] right=mergeSort(nums,mid+1,end);
        
        return merge(left,right);
    }


    int [] merge(int [] left,int [] right){
        int tlen=left.length+right.length;
        int [] res=new int[tlen];
        int len=Math.min(left.length,right.length);
        int i=0,j=0,k=0;
        while(i<left.length && j<right.length){
            if(left[i]<=right[j]){
                res[k++]=left[i++];
            }else{
                res[k++]=right[j++];
            }
        }
        while(i<left.length)res[k++]=left[i++];
        while(j<right.length)res[k++]=right[j++];
        return res;
    }
}