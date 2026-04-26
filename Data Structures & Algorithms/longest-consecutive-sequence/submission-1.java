class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> set=new HashSet<>();

        for(int num :nums ){
            set.add(num);
        }

        int res=0;

        for(int num :nums){
            if(!set.contains(num-1)){
                int len=0;
                while(set.contains(num)){
                    len++;
                    num++;
                }
                res=Math.max(res,len);
            }
        }
        return res;
    }
}
