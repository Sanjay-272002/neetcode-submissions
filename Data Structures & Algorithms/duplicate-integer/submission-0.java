class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashSet<Integer> store=new HashSet<>();
        for(int i=0;i<nums.length;i++){
            if(store.contains(nums[i])) return true;
            store.add(nums[i]);
        }
        return false;
    }
}