class Solution {
    
    public List<List<Integer>> combinationSum(int[] nums, int target) {
        return formCombination(nums,-1,target,new ArrayList<>(),0);
    }

    List<List<Integer>> formCombination(int [] nums,int index,int target,List<Integer> arr,int sum){
        List<List<Integer>> result=new ArrayList<>();
         if(sum==target){
            result.add(arr);
            return result;
         }
         if(sum>target) return result;
         for(int i=0;i<nums.length;i++){
            if(i<index) continue;
            int currsum=sum+nums[i];
            List<Integer> curr=new ArrayList<>(arr);
            curr.add(nums[i]);
            result.addAll(formCombination(nums,i,target,curr,currsum));
         }
         return result;
    }
}
