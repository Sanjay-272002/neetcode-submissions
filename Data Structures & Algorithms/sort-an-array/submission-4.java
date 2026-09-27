class Solution {
    public int[] sortArray(int[] nums) {
         quickSort(nums,0,nums.length-1);
         return nums;
    }
    
    void quickSort(int [] nums,int st,int end){
        if(st>=end) return;
        int part=partition(nums,st,end,st);
        quickSort(nums,st,part-1);
        quickSort(nums,part+1,end);
    }
    int partition(int [] nums,int start,int end,int index){

        for(int i=start;i<end;i++){
            if(nums[i]<=nums[end]){
                swap(nums,i,index++);
            }
        }
        swap(nums,end,index);
        return index;
    }
    void swap(int[] nums,int ind1,int ind2){
        int temp=nums[ind1];
        nums[ind1]=nums[ind2];
        nums[ind2]=temp;
    }
}