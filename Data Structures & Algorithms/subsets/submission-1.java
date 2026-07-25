class Solution {
    
    public List<List<Integer>> subsets(int[] nums) {
        return formSubsets(new ArrayList<>(),nums);
        
    }
    List<List<Integer>> formSubsets(List<Integer> path, int [] nums){
        List<List<Integer>> result=new ArrayList<>();
        if(nums.length==0){
            result.add(path);
            return result;
        }

        int first=nums[0];
        List<Integer> newPath=new ArrayList<>(path);
        newPath.add(first);
        result.addAll(formSubsets(newPath,Arrays.copyOfRange(nums,1,nums.length)));
        result.addAll(formSubsets(path,Arrays.copyOfRange(nums,1,nums.length)));
        return result;
    }
}
