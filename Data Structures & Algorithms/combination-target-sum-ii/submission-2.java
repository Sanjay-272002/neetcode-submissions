class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        Set<List<Integer>> set= formCombination(candidates,0,target,0,new ArrayList<>());
        List<List<Integer>> res=new ArrayList<>(set);
        return res;
    }
    Set<List<Integer>> formCombination(int[] candidates,int index,int target,int sum,List<Integer> arr){
        Set<List<Integer>> result=new HashSet<>();
        if(sum>target) return result;
        if(sum==target) {
            result.add(new ArrayList<>(arr));
            return result;
        }
        for(int i=index;i<candidates.length;i++){
            if (i > index && candidates[i] == candidates[i - 1]) {
                continue;
            }
            arr.add(candidates[i]);
            result.addAll(formCombination(candidates,i+1,target,sum+candidates[i],arr));
            arr.remove(arr.size()-1);
        }
        return result;
    }
}
