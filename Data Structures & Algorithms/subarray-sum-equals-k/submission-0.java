class Solution {
    public int subarraySum(int[] nums, int k) {
       HashMap<Integer,Integer> store=new HashMap<>();
       store.put(0,1);
       int prefixSum=0,res=0;
       for(int i=0;i<nums.length;i++){
        prefixSum+=nums[i];
        int subSum=prefixSum-k;
        if(store.containsKey(subSum))res+=store.get(subSum);
        store.put(prefixSum,store.getOrDefault(prefixSum,0)+1);
       } 

       return res;
    }
}