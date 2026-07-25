class Solution {
    public List<List<Integer>> permute(int[] nums) {
        return formPermutation(nums,new ArrayList<>());
    }

    List<List<Integer>> formPermutation(int[] nums, List<Integer> curr){
        List<List<Integer>> res=new ArrayList<>();
        if(nums.length==0){
           res.add(new ArrayList<>(curr));
           return res;
        }
         int num=nums[0];
        for(int i=0;i<=curr.size();i++){
            List<Integer> temp=new ArrayList<>();
            temp.addAll(curr.subList(0,i));
            temp.add(num);
            temp.addAll(curr.subList(i,curr.size()));
            res.addAll(formPermutation(Arrays.copyOfRange(nums,1,nums.length),temp));
        }
        return res;
    }
}
