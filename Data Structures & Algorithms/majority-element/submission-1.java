class Solution {
    public int majorityElement(int[] nums) {
        int cn=0,res=0;
        for(int num : nums){
            if(cn==0) res=num;
            cn+=(res==num)?1:-1;
        }
      return res;
    }
}