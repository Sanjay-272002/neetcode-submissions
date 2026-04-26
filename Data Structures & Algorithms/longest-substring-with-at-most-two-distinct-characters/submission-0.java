class Solution {
    public int lengthOfLongestSubstringTwoDistinct(String s) {
        int start=0,end=0,max=0;
        Map<Character,Integer> st=new HashMap<>();

        while(end<s.length()){
            st.put(s.charAt(end),st.getOrDefault(s.charAt(end),0)+1);
            if(st.size()>2){
                st.put(s.charAt(start),st.get(s.charAt(start))-1);
                if(st.get(s.charAt(start))==0) st.remove(s.charAt(start));
                start++;
            }else{
 max=Math.max(max,end-start+1);
            }
           
            end++;
        }

        return max;
    }
}