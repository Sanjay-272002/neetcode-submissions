class Solution {
    public int[] productExceptSelf(int[] nums) {
        int [] prefix =new int[nums.length];
        int [] postfix= new int[nums.length];
        prefix[0]=1;
        postfix[nums.length-1]=1;
        for(int i=1,j=nums.length-2;i<nums.length && j>=0 ;i++,j--){
        prefix[i]=prefix[i-1]*nums[i-1];
        postfix[j]=postfix[j+1]*nums[j+1];
        }
        int [] ans=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            ans[i]=prefix[i]*postfix[i];
        }
        return ans;
    }
}  
