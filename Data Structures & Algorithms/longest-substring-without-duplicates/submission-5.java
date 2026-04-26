class Solution {
    public int lengthOfLongestSubstring(String s) {
        int l=0,r=0;
        HashSet<Character> hm=new HashSet<>();
        int res=0;
        while(r<s.length()){

            while(hm.contains(s.charAt(r))){
                
              hm.remove(s.charAt(l));
              l++;
            }
           hm.add(s.charAt(r));
           res=Math.max(res,r-l+1);
           r++;
        }
     return res;
    }
}
