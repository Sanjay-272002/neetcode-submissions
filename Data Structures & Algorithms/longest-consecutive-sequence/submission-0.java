class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> store=new HashSet<>();
        int res=0;
        for(int i=0;i<nums.length;i++){
            store.add(nums[i]);
        }
     
        for(int num:store){
            if(!store.contains(num-1)){
                int length=1;
                while(store.contains(num+length)) length++;
                res=Math.max(res,length);
            }
        }
        return res;
    }
}
