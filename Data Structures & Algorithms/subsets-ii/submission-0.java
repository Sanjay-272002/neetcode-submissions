class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums); 
        Set<List<Integer>> temp=formSubsets(new ArrayList<>(),nums);
        return new ArrayList<>(temp);
    }
    Set<List<Integer>> formSubsets(List<Integer> path, int [] nums){
        Set<List<Integer>> result=new HashSet<>();
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
