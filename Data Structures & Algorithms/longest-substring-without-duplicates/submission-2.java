class Solution {
    public int lengthOfLongestSubstring(String s) {
        int start=0,end=0,max=0;
        Set<Character> st=new HashSet<>();
        while(end<s.length()){
            if(st.contains(s.charAt(end))){
              
             st.remove(s.charAt(start));
             start++;
            }else{
             max=Math.max(max,end-start+1);
             st.add(s.charAt(end));
            end++;
            }
           
            
        }
        return max;
    }
}
