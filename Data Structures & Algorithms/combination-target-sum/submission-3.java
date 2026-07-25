class Solution {
    
    public List<List<Integer>> combinationSum(int[] nums, int target) {
        return formCombination(nums,0,target,new ArrayList<>(),0);
    }

    List<List<Integer>> formCombination(int [] nums,int index,int target,List<Integer> arr,int sum){
        List<List<Integer>> result=new ArrayList<>();
         if(sum==target){
            result.add(new ArrayList<>(arr));
            return result;
         }
         if(sum>target) return result;
         for(int i=index;i<nums.length;i++){
            
            int currsum=sum+nums[i];
            arr.add(nums[i]);
            result.addAll(formCombination(nums,i,target,arr,currsum));
            arr.remove(arr.size()-1);
         }
         return result;
    }
}
