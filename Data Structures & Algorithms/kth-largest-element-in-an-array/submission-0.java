class Solution {
    public int findKthLargest(int[] nums, int k) {
       return quickSelect(nums,0,nums.length-1,nums.length-k);  
    }
    int quickSelect(int[] nums,int st,int end,int k){
        int partition=quickSort(nums,st,end);
        if(partition==k) return nums[k];
        else if(partition<k) return quickSelect(nums,partition+1,end,k);
        else  return quickSelect(nums,st,partition-1,k);
    }
    int quickSort(int[] nums,int l,int r){
        int ind=l;
        int pivot=r;
        for(int i=l;i<r;i++){
            if(nums[i]<=nums[pivot]){
                swap(nums,i,ind);
                ind++;
            }
        }
        swap(nums,ind,r);
        return ind;
    }
    void swap(int [] nums,int ind1,int ind2){
        int temp=nums[ind1];
        nums[ind1]=nums[ind2];
        nums[ind2]=temp;
    }
}
