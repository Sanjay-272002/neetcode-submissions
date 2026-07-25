class Solution {
    List<List<Integer>> result=new ArrayList<>();
    public List<List<Integer>> combinationSum(int[] nums, int target) {
        formCombination(nums,-1,target,new ArrayList<>(),0);
        return result;
    }

    void formCombination(int [] nums,int index,int target,List<Integer> arr,int sum){
         if(sum==target){
            result.add(arr);
            return;
         }
         if(sum>target) return;
         for(int i=0;i<nums.length;i++){
            if(i<index) continue;
            int currsum=sum+nums[i];
            List<Integer> curr=new ArrayList<>(arr);
            curr.add(nums[i]);
            formCombination(nums,i,target,curr,currsum);
         }
    }
}
