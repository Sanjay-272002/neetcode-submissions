class Solution {
    public void sortColors(int[] nums) {
       int i=0,r=nums.length-1, t=0;
      while(t<=r){
        if(nums[t]==0){
            swap(nums,t,i++);
            t++;
        }else if(nums[t]==2){
            swap(nums,t,r--);
        }else{
         t++;
        }
       } 
    }

    void swap(int[] nums,int ind1,int ind2){
        int temp=nums[ind1];
        nums[ind1]=nums[ind2];
        nums[ind2]=temp;
    }
}