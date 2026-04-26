class Solution {
    public int lengthOfLongestSubstring(String s) {
        int start=0,end=0,max=0;
        HashMap<Character,Integer> st=new HashMap<>();
        while(end<s.length()){
        if(st.containsKey(s.charAt(end))){
            start=Math.max(start,st.get(s.charAt(end))+1);
        }
        st.put(s.charAt(end),end);
        max=Math.max(max,end-start+1);
        end++;
        
        }
        return max;
    }
}
