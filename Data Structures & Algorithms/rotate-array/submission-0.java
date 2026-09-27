class Solution {
     void transform(int [] arr,int st,int end){
        while(st<=end){
            int temp=arr[st];
            arr[st]=arr[end];
            arr[end]=temp;
            st++;
            end--;
        }
    }
    public void rotate(int[] nums, int k) {
        int  n=nums.length;
        k = k % n;
        int mid=n-k;
       
        transform(nums,0,mid-1);
        transform(nums,mid,n-1);
        transform(nums,0,n-1);
    }
}