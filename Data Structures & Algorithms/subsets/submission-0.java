class Solution {
    List<List<Integer>> result=new ArrayList<>();
    public List<List<Integer>> subsets(int[] nums) {
        formSubsets(new ArrayList<>(),nums);
        return result;
    }
    void formSubsets(List<Integer> path, int [] nums){
        if(nums.length==0){
            result.add(path);
            return;
        }

        int first=nums[0];
        List<Integer> newPath=new ArrayList<>(path);
        newPath.add(first);
        formSubsets(newPath,Arrays.copyOfRange(nums,1,nums.length));
        formSubsets(path,Arrays.copyOfRange(nums,1,nums.length));
    }
}
