class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int cn1=0,ele1=0,cn2=0,ele2=0;
        for(int i=0;i<nums.length;i++){
            if(cn1==0 && nums[i]!=ele2){
                cn1++;
                ele1=nums[i];
            }else if(cn2==0 && nums[i]!=ele1){
                cn2++;
                ele2=nums[i];
            }else if(nums[i]==ele1)cn1++;
            else if(nums[i]==ele2)cn2++;
            else {
                cn1--;
                cn2--;
            }
        }

        cn1=0;
        cn2=0;
        int n=nums.length;
        List<Integer> res=new ArrayList<>();
        for(int num : nums){
            if(num==ele1) cn1++;
            else if(num==ele2)cn2++;
        }
         if(cn1>n/3)res.add(ele1);
            if(cn2>n/3) res.add(ele2);

            return res;
    }
}